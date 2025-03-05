package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.UngVien;

public class UngVienDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm ứng viên
    public int save(UngVien uv) {
        String sql = "INSERT INTO UngVien (HoTen, ViTriUngTuyen, TrangThai, KetQuaPhongVan) VALUES (?, ?, ?, ?)";
        return template.update(sql, uv.getHoTen(), uv.getViTriUngTuyen(), uv.getTrangThai(), uv.getKetQuaPhongVan());
    }

    // Cập nhật ứng viên
    public int update(UngVien uv) {
        String sql = "UPDATE UngVien SET HoTen=?, ViTriUngTuyen=?, TrangThai=?, KetQuaPhongVan=? WHERE MaUngVien=?";
        return template.update(sql, uv.getHoTen(), uv.getViTriUngTuyen(), uv.getTrangThai(), uv.getKetQuaPhongVan(), uv.getMaUngVien());
    }

    // Xóa ứng viên
    public int delete(int id) {
        String sql = "DELETE FROM UngVien WHERE MaUngVien=?";
        return template.update(sql, id);
    }

 // Lấy danh sách tất cả ứng viên
    public List<UngVien> getAllUngVien() {
        String sql = "SELECT * FROM UngVien";
        return template.query(sql, new RowMapper<UngVien>() {
            public UngVien mapRow(ResultSet rs, int rowNum) throws SQLException {
                UngVien uv = new UngVien();
                uv.setMaUngVien(rs.getInt("MaUngVien"));
                uv.setHoTen(rs.getString("HoTen"));
                uv.setViTriUngTuyen(rs.getString("ViTriUngTuyen"));
                uv.setTrangThai(rs.getString("TrangThai"));
                uv.setKetQuaPhongVan(rs.getString("KetQuaPhongVan"));
                return uv;
            }
        });
    }

    // Lấy ứng viên theo ID
    public UngVien getUngVienById(int id) {
        String sql = "SELECT * FROM UngVien WHERE MaUngVien=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(UngVien.class));
    }
}
