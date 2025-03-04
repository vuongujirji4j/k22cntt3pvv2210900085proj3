package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.PhongBan;

public class PhongBanDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm phòng ban
    public int save(PhongBan pb) {
        String sql = "INSERT INTO PhongBan (TenPhongBan, MoTa, TruongPhong) VALUES (?, ?, ?)";
        return template.update(sql, pb.getTenPhongBan(), pb.getMoTa(), pb.getTruongPhong());
    }

    // Cập nhật phòng ban
    public int update(PhongBan pb) {
        String sql = "UPDATE PhongBan SET TenPhongBan=?, MoTa=?, TruongPhong=? WHERE MaPhongBan=?";
        return template.update(sql, pb.getTenPhongBan(), pb.getMoTa(), pb.getTruongPhong(), pb.getMaPhongBan());
    }

    // Xóa phòng ban
    public int delete(int id) {
        String sql = "DELETE FROM PhongBan WHERE MaPhongBan=?";
        return template.update(sql, id);
    }

    // Lấy danh sách phòng ban
    public List<PhongBan> getAllPhongBan() {
        return template.query("SELECT * FROM PhongBan", new RowMapper<PhongBan>() {
            public PhongBan mapRow(ResultSet rs, int rowNum) throws SQLException {
                PhongBan pb = new PhongBan();
                pb.setMaPhongBan(rs.getInt("MaPhongBan"));
                pb.setTenPhongBan(rs.getString("TenPhongBan"));
                pb.setMoTa(rs.getString("MoTa"));
                pb.setTruongPhong(rs.getInt("TruongPhong"));
                return pb;
            }
        });
    }

    // Lấy phòng ban theo ID
    public PhongBan getPhongBanById(int id) {
        String sql = "SELECT * FROM PhongBan WHERE MaPhongBan=?";
        return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<>(PhongBan.class));
    }
}
