package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.DanhGia;

public class DanhGiaDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm đánh giá
    public int save(DanhGia dg) {
        String sql = "INSERT INTO DanhGia (MaNhanVien, KyDanhGia, DiemSo, NhanXet) VALUES (?, ?, ?, ?)";
        return template.update(sql, dg.getMaNhanVien(), dg.getKyDanhGia(), dg.getDiemSo(), dg.getNhanXet());
    }

    // Cập nhật đánh giá
    public int update(DanhGia dg) {
        String sql = "UPDATE DanhGia SET MaNhanVien=?, KyDanhGia=?, DiemSo=?, NhanXet=? WHERE MaDanhGia=?";
        return template.update(sql, dg.getMaNhanVien(), dg.getKyDanhGia(), dg.getDiemSo(), dg.getNhanXet(), dg.getMaDanhGia());
    }

    // Xóa đánh giá
    public int delete(int id) {
        String sql = "DELETE FROM DanhGia WHERE MaDanhGia=?";
        return template.update(sql, id);
    }

    // Lấy danh sách đánh giá
    public List<DanhGia> getAllDanhGia() {
        return template.query("SELECT * FROM DanhGia", new RowMapper<DanhGia>() {
            public DanhGia mapRow(ResultSet rs, int rowNum) throws SQLException {
                DanhGia dg = new DanhGia();
                dg.setMaDanhGia(rs.getInt("MaDanhGia"));
                dg.setMaNhanVien(rs.getInt("MaNhanVien"));
                dg.setKyDanhGia(rs.getString("KyDanhGia"));
                dg.setDiemSo(rs.getInt("DiemSo"));
                dg.setNhanXet(rs.getString("NhanXet"));
                return dg;
            }
        });
    }

    // Lấy đánh giá theo ID
    public DanhGia getDanhGiaById(int id) {
        String sql = "SELECT * FROM DanhGia WHERE MaDanhGia=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(DanhGia.class));
    }
}
