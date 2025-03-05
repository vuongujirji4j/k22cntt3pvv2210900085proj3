package com.springmvc.beans;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class ChamCong {
    private int maChamCong;
    private int maNhanVien;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Định dạng ngày tháng
    private Date ngay;
    
    private String gioVao;
    private String gioRa;

    public ChamCong() {
        super();
    }

    // Getters & Setters
    public int getMaChamCong() { return maChamCong; }
    public void setMaChamCong(int maChamCong) { this.maChamCong = maChamCong; }

    public int getMaNhanVien() { return maNhanVien; }
    public void setMaNhanVien(int maNhanVien) { this.maNhanVien = maNhanVien; }

    public Date getNgay() { return ngay; }
    public void setNgay(Date ngay) { this.ngay = ngay; }

    public String getGioVao() { return gioVao; }
    public void setGioVao(String gioVao) { this.gioVao = gioVao; }

    public String getGioRa() { return gioRa; }
    public void setGioRa(String gioRa) { this.gioRa = gioRa; }
}
