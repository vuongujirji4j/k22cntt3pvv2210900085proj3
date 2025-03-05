package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.DaoTao;

public class DaoTaoDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Lấy danh sách khóa học
    public List<DaoTao> getAllDaoTao() {
        return template.query("SELECT * FROM DaoTao", new RowMapper<DaoTao>() {
            public DaoTao mapRow(ResultSet rs, int rowNum) throws SQLException {
                DaoTao dt = new DaoTao();
                dt.setMaKhoaHoc(rs.getInt("MaKhoaHoc"));
                dt.setTenKhoaHoc(rs.getString("TenKhoaHoc"));
                dt.setNoiDung(rs.getString("NoiDung"));
                dt.setNgayBatDau(rs.getDate("NgayBatDau"));
                dt.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                return dt;
            }
        });
    }

    // Thêm khóa học
    public int save(DaoTao dt) {
        String sql = "INSERT INTO DaoTao (TenKhoaHoc, NoiDung, NgayBatDau, NgayKetThuc) VALUES (?, ?, ?, ?)";
        return template.update(sql, dt.getTenKhoaHoc(), dt.getNoiDung(), dt.getNgayBatDau(), dt.getNgayKetThuc());
    }

    // Cập nhật khóa học
    public int update(DaoTao dt) {
        String sql = "UPDATE DaoTao SET TenKhoaHoc=?, NoiDung=?, NgayBatDau=?, NgayKetThuc=? WHERE MaKhoaHoc=?";
        return template.update(sql, dt.getTenKhoaHoc(), dt.getNoiDung(), dt.getNgayBatDau(), dt.getNgayKetThuc(), dt.getMaKhoaHoc());
    }

    // Xóa khóa học
    public int delete(int id) {
        String sql = "DELETE FROM DaoTao WHERE MaKhoaHoc=?";
        return template.update(sql, id);
    }

    // Lấy khóa học theo ID
    public DaoTao getDaoTaoById(int id) {
        String sql = "SELECT * FROM DaoTao WHERE MaKhoaHoc=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(DaoTao.class));
    }
}
