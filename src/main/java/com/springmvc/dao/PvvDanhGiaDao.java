package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.PvvDanhGia;

public class PvvDanhGiaDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm đánh giá
    public int save(PvvDanhGia dg) {
        String sql = "INSERT INTO pvv_DanhGia (pvv_MaNhanVien, pvv_KyDanhGia, pvv_DiemSo, pvv_NhanXet) VALUES (?, ?, ?, ?)";
        return template.update(sql, dg.getPvv_maNhanVien(), dg.getPvv_kyDanhGia(), dg.getPvv_diemSo(), dg.getPvv_nhanXet());
    }

    // Cập nhật đánh giá
    public int update(PvvDanhGia dg) {
        String sql = "UPDATE pvv_DanhGia SET pvv_MaNhanVien=?, pvv_KyDanhGia=?, pvv_DiemSo=?, pvv_NhanXet=? WHERE pvv_MaDanhGia=?";
        return template.update(sql, dg.getPvv_maNhanVien(), dg.getPvv_kyDanhGia(), dg.getPvv_diemSo(), dg.getPvv_nhanXet(), dg.getPvv_maDanhGia());
    }

    // Xóa đánh giá
    public int delete(int id) {
        String sql = "DELETE FROM pvv_DanhGia WHERE pvv_MaDanhGia=?";
        return template.update(sql, id);
    }

    // Lấy danh sách đánh giá
    public List<PvvDanhGia> getAllDanhGia() {
        return template.query("SELECT * FROM pvv_DanhGia", new RowMapper<PvvDanhGia>() {
            public PvvDanhGia mapRow(ResultSet rs, int rowNum) throws SQLException {
                PvvDanhGia dg = new PvvDanhGia();
                dg.setPvv_maDanhGia(rs.getInt("pvv_MaDanhGia"));
                dg.setPvv_maNhanVien(rs.getInt("pvv_MaNhanVien"));
                dg.setPvv_kyDanhGia(rs.getString("pvv_KyDanhGia"));
                dg.setPvv_diemSo(rs.getInt("pvv_DiemSo"));
                dg.setPvv_nhanXet(rs.getString("pvv_NhanXet"));
                return dg;
            }
        });
    }

    // Lấy đánh giá theo ID
    public PvvDanhGia getDanhGiaById(int id) {
        String sql = "SELECT * FROM pvv_DanhGia WHERE pvv_MaDanhGia=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(PvvDanhGia.class));
    }
}