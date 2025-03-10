package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.PvvHopDong;

public class PvvHopDongDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Lấy danh sách hợp đồng
    public List<PvvHopDong> getAllHopDong() {
        return template.query("SELECT * FROM pvv_HopDong", new RowMapper<PvvHopDong>() {
            public PvvHopDong mapRow(ResultSet rs, int rowNum) throws SQLException {
                PvvHopDong hd = new PvvHopDong();
                hd.setPvv_maHopDong(rs.getInt("pvv_MaHopDong"));
                hd.setPvv_maNhanVien(rs.getInt("pvv_MaNhanVien"));
                hd.setPvv_loaiHopDong(rs.getString("pvv_LoaiHopDong"));
                hd.setPvv_ngayBatDau(rs.getDate("pvv_NgayBatDau"));
                hd.setPvv_ngayKetThuc(rs.getDate("pvv_NgayKetThuc"));

                // Kiểm tra NULL trước khi gán
                double luongCoBan = rs.getObject("pvv_LuongCoBan") != null ? rs.getDouble("pvv_LuongCoBan") : 0.0;
                double phuCap = rs.getObject("pvv_PhuCap") != null ? rs.getDouble("pvv_PhuCap") : 0.0;

                hd.setPvv_luongCoBan(luongCoBan);
                hd.setPvv_phuCap(phuCap);

                hd.setPvv_trangThai(rs.getString("pvv_TrangThai"));
                return hd;
            }
        });
    }


    // Thêm hợp đồng mới
    public int save(PvvHopDong hd) {
        String sql = "INSERT INTO pvv_HopDong (pvv_MaNhanVien, pvv_LoaiHopDong, pvv_NgayBatDau, pvv_NgayKetThuc, pvv_LuongCoBan, pvv_PhuCap, pvv_TrangThai) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        return template.update(sql, hd.getPvv_maNhanVien(), hd.getPvv_loaiHopDong(), hd.getPvv_ngayBatDau(), 
                               hd.getPvv_ngayKetThuc(), hd.getPvv_luongCoBan(), hd.getPvv_phuCap(), hd.getPvv_trangThai());
    }

    // Lấy hợp đồng theo ID
    public PvvHopDong getHopDongById(int id) {
        String sql = "SELECT * FROM pvv_HopDong WHERE pvv_MaHopDong=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(PvvHopDong.class));
    }

    // Cập nhật hợp đồng
    public int update(PvvHopDong hd) {
        String sql = "UPDATE pvv_HopDong SET pvv_MaNhanVien=?, pvv_LoaiHopDong=?, pvv_NgayBatDau=?, pvv_NgayKetThuc=?, pvv_LuongCoBan=?, pvv_PhuCap=?, pvv_TrangThai=? " +
                     "WHERE pvv_MaHopDong=?";
        return template.update(sql, hd.getPvv_maNhanVien(), hd.getPvv_loaiHopDong(), hd.getPvv_ngayBatDau(), 
                               hd.getPvv_ngayKetThuc(), hd.getPvv_luongCoBan(), hd.getPvv_phuCap(), hd.getPvv_trangThai(), hd.getPvv_maHopDong());
    }

    // Xóa hợp đồng
    public int delete(int id) {
        String sql = "DELETE FROM pvv_HopDong WHERE pvv_MaHopDong=?";
        return template.update(sql, id);
    }
}
