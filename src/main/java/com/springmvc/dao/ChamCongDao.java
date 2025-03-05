package com.springmvc.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.ChamCong;

public class ChamCongDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm chấm công
    public int save(ChamCong cc) {
        String sql = "INSERT INTO ChamCong (MaNhanVien, Ngay, GioVao, GioRa) VALUES (?, ?, ?, ?)";
        return template.update(sql, 
            cc.getMaNhanVien(), 
            new Date(cc.getNgay().getTime()),  // Ép kiểu sang java.sql.Date
            cc.getGioVao(), 
            cc.getGioRa()
        );
    }

    // Cập nhật chấm công
    public int update(ChamCong cc) {
        String sql = "UPDATE ChamCong SET MaNhanVien=?, Ngay=?, GioVao=?, GioRa=? WHERE MaChamCong=?";
        return template.update(sql, 
            cc.getMaNhanVien(), 
            new Date(cc.getNgay().getTime()),  // Ép kiểu sang java.sql.Date
            cc.getGioVao(), 
            cc.getGioRa(), 
            cc.getMaChamCong()
        );
    }

    // Xóa chấm công
    public int delete(int id) {
        String sql = "DELETE FROM ChamCong WHERE MaChamCong=?";
        return template.update(sql, id);
    }

    // Lấy danh sách chấm công
    public List<ChamCong> getAllChamCong() {
        return template.query("SELECT * FROM ChamCong", new RowMapper<ChamCong>() {
            public ChamCong mapRow(ResultSet rs, int rowNum) throws SQLException {
                ChamCong cc = new ChamCong();
                cc.setMaChamCong(rs.getInt("MaChamCong"));
                cc.setMaNhanVien(rs.getInt("MaNhanVien"));
                cc.setNgay(rs.getDate("Ngay"));
                cc.setGioVao(rs.getString("GioVao"));
                cc.setGioRa(rs.getString("GioRa"));
                return cc;
            }
        });
    }

    // Lấy chấm công theo ID
    public ChamCong getChamCongById(int id) {
        String sql = "SELECT * FROM ChamCong WHERE MaChamCong=?";
        return template.queryForObject(sql, new Object[]{id}, new RowMapper<ChamCong>() {
            @Override
            public ChamCong mapRow(ResultSet rs, int rowNum) throws SQLException {
                ChamCong cc = new ChamCong();
                cc.setMaChamCong(rs.getInt("MaChamCong"));
                cc.setMaNhanVien(rs.getInt("MaNhanVien"));
                cc.setNgay(rs.getDate("Ngay")); // Lấy ngày đúng kiểu Date
                cc.setGioVao(rs.getString("GioVao"));
                cc.setGioRa(rs.getString("GioRa"));
                return cc;
            }
        });
    }
}
