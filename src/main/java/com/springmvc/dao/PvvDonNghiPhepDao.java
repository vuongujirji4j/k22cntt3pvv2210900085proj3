package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.beans.PvvDonNghiPhep;

public class PvvDonNghiPhepDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(PvvDonNghiPhep don) {
        String sql = "INSERT INTO pvv_DonNghiPhep (pvv_MaNhanVien, pvv_NgayBatDau, pvv_NgayKetThuc, pvv_LyDo, pvv_TrangThai) " +
                     "VALUES (?, ?, ?, ?, ?)";
        return template.update(sql, don.getPvv_MaNhanVien(), don.getPvv_NgayBatDau(),
                don.getPvv_NgayKetThuc(), don.getPvv_LyDo(), don.getPvv_TrangThai());
    }

    public List<PvvDonNghiPhep> getAll() {
        return template.query("SELECT * FROM pvv_DonNghiPhep", new RowMapper<PvvDonNghiPhep>() {
            public PvvDonNghiPhep mapRow(ResultSet rs, int row) throws SQLException {
                PvvDonNghiPhep don = new PvvDonNghiPhep();
                don.setPvv_MaDon(rs.getInt(1));
                don.setPvv_MaNhanVien(rs.getInt(2));
                don.setPvv_NgayBatDau(rs.getDate(3));
                don.setPvv_NgayKetThuc(rs.getDate(4));
                don.setPvv_LyDo(rs.getString(5));
                don.setPvv_TrangThai(rs.getString(6));
                return don;
            }
        });
    }

    public int delete(int id) {
        String sql = "DELETE FROM pvv_DonNghiPhep WHERE pvv_MaDon=?";
        return template.update(sql, id);
    }
}
