package com.springmvc.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.PvvChamCong;

public class PvvChamCongDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm chấm công
    public int save(PvvChamCong cc) {
        String sql = "INSERT INTO pvv_ChamCong (pvv_MaNhanVien, pvv_Ngay, pvv_GioVao, pvv_GioRa) VALUES (?, ?, ?, ?)";
        return template.update(sql, 
            cc.getPvv_maNhanVien(), 
            new Date(cc.getPvv_ngay().getTime()),  // Ép kiểu sang java.sql.Date
            cc.getPvv_gioVao(), 
            cc.getPvv_gioRa()
        );
    }

    // Cập nhật chấm công
    public int update(PvvChamCong cc) {
        String sql = "UPDATE pvv_ChamCong SET pvv_MaNhanVien=?, pvv_Ngay=?, pvv_GioVao=?, pvv_GioRa=? WHERE pvv_MaChamCong=?";
        return template.update(sql, 
            cc.getPvv_maNhanVien(), 
            new Date(cc.getPvv_ngay().getTime()),  // Ép kiểu sang java.sql.Date
            cc.getPvv_gioVao(), 
            cc.getPvv_gioRa(), 
            cc.getPvv_maChamCong()
        );
    }

    // Xóa chấm công
    public int delete(int id) {
        String sql = "DELETE FROM pvv_ChamCong WHERE pvv_MaChamCong=?";
        return template.update(sql, id);
    }

    // Lấy danh sách chấm công
    public List<PvvChamCong> getAllChamCong() {
        return template.query("SELECT * FROM pvv_ChamCong", new RowMapper<PvvChamCong>() {
            public PvvChamCong mapRow(ResultSet rs, int rowNum) throws SQLException {
                PvvChamCong cc = new PvvChamCong();
                cc.setPvv_maChamCong(rs.getInt("pvv_MaChamCong"));
                cc.setPvv_maNhanVien(rs.getInt("pvv_MaNhanVien"));
                cc.setPvv_ngay(rs.getDate("pvv_Ngay"));
                cc.setPvv_gioVao(rs.getString("pvv_GioVao"));
                cc.setPvv_gioRa(rs.getString("pvv_GioRa"));
                return cc;
            }
        });
    }

    // Lấy chấm công theo ID
    public PvvChamCong getChamCongById(int id) {
        String sql = "SELECT * FROM pvv_ChamCong WHERE pvv_MaChamCong=?";
        return template.queryForObject(sql, new Object[]{id}, new RowMapper<PvvChamCong>() {
            @Override
            public PvvChamCong mapRow(ResultSet rs, int rowNum) throws SQLException {
                PvvChamCong cc = new PvvChamCong();
                cc.setPvv_maChamCong(rs.getInt("pvv_MaChamCong"));
                cc.setPvv_maNhanVien(rs.getInt("pvv_MaNhanVien"));
                cc.setPvv_ngay(rs.getDate("pvv_Ngay")); // Lấy ngày đúng kiểu Date
                cc.setPvv_gioVao(rs.getString("pvv_GioVao"));
                cc.setPvv_gioRa(rs.getString("pvv_GioRa"));
                return cc;
            }
        });
    }
}