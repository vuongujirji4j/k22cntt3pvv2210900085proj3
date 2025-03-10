package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.beans.PvvNhanVien;

public class PvvNhanVienDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm nhân viên mới
    public int save(PvvNhanVien nv) {
        String sql = "INSERT INTO pvv_NhanVien (pvv_HoTen, pvv_NgaySinh, pvv_GioiTinh, pvv_DiaChi, pvv_SoDienThoai, pvv_Email, pvv_MaPhongBan, pvv_ChucVu, pvv_NgayVaoLam) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return template.update(sql, nv.getPvv_hoTen(), nv.getPvv_ngaySinh(), nv.getPvv_gioiTinh(), nv.getPvv_diaChi(), 
                               nv.getPvv_soDienThoai(), nv.getPvv_email(), nv.getPvv_maPhongBan(), nv.getPvv_chucVu(), nv.getPvv_ngayVaoLam());
    }

    // Cập nhật thông tin nhân viên
    public int update(PvvNhanVien nv) {
        String sql = "UPDATE pvv_NhanVien SET pvv_HoTen=?, pvv_NgaySinh=?, pvv_GioiTinh=?, pvv_DiaChi=?, pvv_SoDienThoai=?, pvv_Email=?, "
                   + "pvv_MaPhongBan=?, pvv_ChucVu=?, pvv_NgayVaoLam=? WHERE pvv_MaNhanVien=?";
        return template.update(sql, nv.getPvv_hoTen(), nv.getPvv_ngaySinh(), nv.getPvv_gioiTinh(), nv.getPvv_diaChi(), 
                               nv.getPvv_soDienThoai(), nv.getPvv_email(), nv.getPvv_maPhongBan(), nv.getPvv_chucVu(), nv.getPvv_ngayVaoLam(), nv.getPvv_maNhanVien());
    }

    // Xóa nhân viên
    public int delete(int maNhanVien) {
        String sql = "DELETE FROM pvv_NhanVien WHERE pvv_MaNhanVien=?";
        return template.update(sql, maNhanVien);
    }

    // Lấy thông tin nhân viên theo ID
    public PvvNhanVien getNhanVienById(int maNhanVien) {
        String sql = "SELECT * FROM pvv_NhanVien WHERE pvv_MaNhanVien=?";
        return template.queryForObject(sql, new Object[] { maNhanVien }, new BeanPropertyRowMapper<>(PvvNhanVien.class));
    }

    // Lấy danh sách tất cả nhân viên
    public List<PvvNhanVien> getAllNhanViens() {
        return template.query("SELECT * FROM pvv_NhanVien", new RowMapper<PvvNhanVien>() {
            public PvvNhanVien mapRow(ResultSet rs, int rowNum) throws SQLException {
                PvvNhanVien nv = new PvvNhanVien();
                nv.setPvv_maNhanVien(rs.getInt("pvv_MaNhanVien"));
                nv.setPvv_hoTen(rs.getString("pvv_HoTen"));
                nv.setPvv_ngaySinh(rs.getDate("pvv_NgaySinh"));
                nv.setPvv_gioiTinh(rs.getString("pvv_GioiTinh"));
                nv.setPvv_diaChi(rs.getString("pvv_DiaChi"));
                nv.setPvv_soDienThoai(rs.getString("pvv_SoDienThoai"));
                nv.setPvv_email(rs.getString("pvv_Email"));
                nv.setPvv_maPhongBan(rs.getInt("pvv_MaPhongBan"));
                nv.setPvv_chucVu(rs.getString("pvv_ChucVu"));
                nv.setPvv_ngayVaoLam(rs.getDate("pvv_NgayVaoLam"));
                return nv;
            }
        });
    }
}