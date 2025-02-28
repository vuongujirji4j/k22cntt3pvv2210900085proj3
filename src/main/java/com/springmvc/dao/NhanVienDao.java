package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.beans.NhanVien;

public class NhanVienDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm nhân viên mới
    public int save(NhanVien nv) {
        String sql = "INSERT INTO NhanVien (HoTen, NgaySinh, GioiTinh, DiaChi, SoDienThoai, Email, MaPhongBan, ChucVu, NgayVaoLam) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return template.update(sql, nv.getHoTen(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), 
                               nv.getSoDienThoai(), nv.getEmail(), nv.getMaPhongBan(), nv.getChucVu(), nv.getNgayVaoLam());
    }

    // Cập nhật thông tin nhân viên
    public int update(NhanVien nv) {
        String sql = "UPDATE NhanVien SET HoTen=?, NgaySinh=?, GioiTinh=?, DiaChi=?, SoDienThoai=?, Email=?, "
                   + "MaPhongBan=?, ChucVu=?, NgayVaoLam=? WHERE MaNhanVien=?";
        return template.update(sql, nv.getHoTen(), nv.getNgaySinh(), nv.getGioiTinh(), nv.getDiaChi(), 
                               nv.getSoDienThoai(), nv.getEmail(), nv.getMaPhongBan(), nv.getChucVu(), nv.getNgayVaoLam(), nv.getMaNhanVien());
    }

    // Xóa nhân viên
    public int delete(int maNhanVien) {
        String sql = "DELETE FROM NhanVien WHERE MaNhanVien=?";
        return template.update(sql, maNhanVien);
    }

    // Lấy thông tin nhân viên theo ID
    public NhanVien getNhanVienById(int maNhanVien) {
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien=?";
        return template.queryForObject(sql, new Object[] { maNhanVien }, new BeanPropertyRowMapper<>(NhanVien.class));
    }

    // Lấy danh sách tất cả nhân viên
    public List<NhanVien> getAllNhanViens() {
        return template.query("SELECT * FROM NhanVien", new RowMapper<NhanVien>() {
            public NhanVien mapRow(ResultSet rs, int rowNum) throws SQLException {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt("MaNhanVien"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setEmail(rs.getString("Email"));
                nv.setMaPhongBan(rs.getInt("MaPhongBan"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                return nv;
            }
        });
    }
}
