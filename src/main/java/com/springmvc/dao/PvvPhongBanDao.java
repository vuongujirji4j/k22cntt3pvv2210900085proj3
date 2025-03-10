package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.PvvPhongBan;

public class PvvPhongBanDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm phòng ban
    public int save(PvvPhongBan pb) {
        String sql = "INSERT INTO pvv_PhongBan (pvv_TenPhongBan, pvv_MoTa, pvv_TruongPhong) VALUES (?, ?, ?)";
        return template.update(sql, pb.getPvv_tenPhongBan(), pb.getPvv_moTa(), pb.getPvv_truongPhong());
    }

    // Cập nhật phòng ban
    public int update(PvvPhongBan pb) {
        String sql = "UPDATE pvv_PhongBan SET pvv_TenPhongBan=?, pvv_MoTa=?, pvv_TruongPhong=? WHERE pvv_MaPhongBan=?";
        return template.update(sql, pb.getPvv_tenPhongBan(), pb.getPvv_moTa(), pb.getPvv_truongPhong(), pb.getPvv_maPhongBan());
    }

    // Xóa phòng ban
    public int delete(int id) {
        String sql = "DELETE FROM pvv_PhongBan WHERE pvv_MaPhongBan=?";
        return template.update(sql, id);
    }

    // Lấy danh sách phòng ban
    public List<PvvPhongBan> getAllPhongBan() {
        return template.query("SELECT * FROM pvv_PhongBan", new RowMapper<PvvPhongBan>() {
            public PvvPhongBan mapRow(ResultSet rs, int rowNum) throws SQLException {
                PvvPhongBan pb = new PvvPhongBan();
                pb.setPvv_maPhongBan(rs.getInt("pvv_MaPhongBan"));
                pb.setPvv_tenPhongBan(rs.getString("pvv_TenPhongBan"));
                pb.setPvv_moTa(rs.getString("pvv_MoTa"));
                pb.setPvv_truongPhong(rs.getInt("pvv_TruongPhong"));
                return pb;
            }
        });
    }

    // Lấy phòng ban theo ID
    public PvvPhongBan getPhongBanById(int id) {
        String sql = "SELECT * FROM pvv_PhongBan WHERE pvv_MaPhongBan=?";
        return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<>(PvvPhongBan.class));
    }
}
