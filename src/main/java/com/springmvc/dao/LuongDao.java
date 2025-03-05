package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.springmvc.beans.Luong;

public class LuongDao {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm lương
    public int save(Luong l) {
        String sql = "INSERT INTO Luong (MaNhanVien, Thang, Nam, LuongCoBan, PhuCap, KhauTru, LuongThucNhan) VALUES (?, ?, ?, ?, ?, ?, ?)";
        return template.update(sql, l.getMaNhanVien(), l.getThang(), l.getNam(), l.getLuongCoBan(), l.getPhuCap(), l.getKhauTru(), l.getLuongThucNhan());
    }

    // Cập nhật lương
    public int update(Luong l) {
        String sql = "UPDATE Luong SET MaNhanVien=?, Thang=?, Nam=?, LuongCoBan=?, PhuCap=?, KhauTru=?, LuongThucNhan=? WHERE MaLuong=?";
        return template.update(sql, l.getMaNhanVien(), l.getThang(), l.getNam(), l.getLuongCoBan(), l.getPhuCap(), l.getKhauTru(), l.getLuongThucNhan(), l.getMaLuong());
    }

    // Xóa lương
    public int delete(int id) {
        String sql = "DELETE FROM Luong WHERE MaLuong=?";
        return template.update(sql, id);
    }

    // Lấy danh sách lương
    public List<Luong> getAllLuong() {
        return template.query("SELECT * FROM Luong", new RowMapper<Luong>() {
            public Luong mapRow(ResultSet rs, int rowNum) throws SQLException {
                Luong l = new Luong();
                l.setMaLuong(rs.getInt("MaLuong"));
                l.setMaNhanVien(rs.getInt("MaNhanVien"));
                l.setThang(rs.getInt("Thang"));
                l.setNam(rs.getInt("Nam"));
                l.setLuongCoBan(rs.getDouble("LuongCoBan"));
                l.setPhuCap(rs.getDouble("PhuCap"));
                l.setKhauTru(rs.getDouble("KhauTru"));
                l.setLuongThucNhan(rs.getDouble("LuongThucNhan"));
                return l;
            }
        });
    }

    // Lấy lương theo ID
    public Luong getLuongById(int id) {
        String sql = "SELECT * FROM Luong WHERE MaLuong=?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Luong.class));
    }
}
