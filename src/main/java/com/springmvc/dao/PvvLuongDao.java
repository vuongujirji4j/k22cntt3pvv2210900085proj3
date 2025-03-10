package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.PvvLuong;

public class PvvLuongDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm lương
    public int save(PvvLuong l) {
        String sql = "INSERT INTO pvv_Luong (pvv_MaNhanVien, pvv_Thang, pvv_Nam, pvv_LuongCoBan, pvv_PhuCap, pvv_KhauTru, pvv_LuongThucNhan) VALUES (?, ?, ?, ?, ?, ?, ?)";
        return template.update(sql, l.getPvv_maNhanVien(), l.getPvv_thang(), l.getPvv_nam(), l.getPvv_luongCoBan(), l.getPvv_phuCap(), l.getPvv_khauTru(), l.getPvv_luongThucNhan());
    }

    // Cập nhật lương
    public int update(PvvLuong l) {
        String sql = "UPDATE pvv_Luong SET pvv_MaNhanVien=?, pvv_Thang=?, pvv_Nam=?, pvv_LuongCoBan=?, pvv_PhuCap=?, pvv_KhauTru=?, pvv_LuongThucNhan=? WHERE pvv_MaLuong=?";
        return template.update(sql, l.getPvv_maNhanVien(), l.getPvv_thang(), l.getPvv_nam(), l.getPvv_luongCoBan(), l.getPvv_phuCap(), l.getPvv_khauTru(), l.getPvv_luongThucNhan(), l.getPvv_maLuong());
    }

    // Xóa lương
    public int delete(int id) {
        String sql = "DELETE FROM pvv_Luong WHERE pvv_MaLuong=?";
        return template.update(sql, id);
    }

    // Lấy danh sách lương
    public List<PvvLuong> getAllLuong() {
        return template.query("SELECT * FROM pvv_Luong", new RowMapper<PvvLuong>() {
            public PvvLuong mapRow(ResultSet rs, int rowNum) throws SQLException {
                PvvLuong l = new PvvLuong();
                l.setPvv_maLuong(rs.getInt("pvv_MaLuong"));
                l.setPvv_maNhanVien(rs.getInt("pvv_MaNhanVien"));
                l.setPvv_thang(rs.getInt("pvv_Thang"));
                l.setPvv_nam(rs.getInt("pvv_Nam"));
                l.setPvv_luongCoBan(rs.getDouble("pvv_LuongCoBan"));
                l.setPvv_phuCap(rs.getDouble("pvv_PhuCap"));
                l.setPvv_khauTru(rs.getDouble("pvv_KhauTru"));
                l.setPvv_luongThucNhan(rs.getDouble("pvv_LuongThucNhan"));
                return l;
            }
        });
    }

    // Lấy lương theo ID
    public PvvLuong getLuongById(int id) {
        String sql = "SELECT * FROM pvv_Luong WHERE pvv_MaLuong=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(PvvLuong.class));
    }
}
