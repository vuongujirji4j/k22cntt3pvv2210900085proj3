package com.springmvc.beans;

public class Luong {
    private int maLuong;
    private int maNhanVien;
    private int thang;
    private int nam;
    private double luongCoBan;
    private double phuCap;
    private double khauTru;
    private double luongThucNhan;

    public Luong() {}

    // Getters & Setters
    public int getMaLuong() { return maLuong; }
    public void setMaLuong(int maLuong) { this.maLuong = maLuong; }

    public int getMaNhanVien() { return maNhanVien; }
    public void setMaNhanVien(int maNhanVien) { this.maNhanVien = maNhanVien; }

    public int getThang() { return thang; }
    public void setThang(int thang) { this.thang = thang; }

    public int getNam() { return nam; }
    public void setNam(int nam) { this.nam = nam; }

    public double getLuongCoBan() { return luongCoBan; }
    public void setLuongCoBan(double luongCoBan) { this.luongCoBan = luongCoBan; }

    public double getPhuCap() { return phuCap; }
    public void setPhuCap(double phuCap) { this.phuCap = phuCap; }

    public double getKhauTru() { return khauTru; }
    public void setKhauTru(double khauTru) { this.khauTru = khauTru; }

    public double getLuongThucNhan() { return luongThucNhan; }
    public void setLuongThucNhan(double luongThucNhan) { this.luongThucNhan = luongThucNhan; }
}
