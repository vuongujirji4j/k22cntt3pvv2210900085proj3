package com.springmvc.beans;

public class PhongBan {
    private int maPhongBan;
    private String tenPhongBan;
    private String moTa;
    private int truongPhong;

    // Constructors
    public PhongBan() {}

    public PhongBan(int maPhongBan, String tenPhongBan, String moTa, int truongPhong) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.moTa = moTa;
        this.truongPhong = truongPhong;
    }

    // Getters và Setters
    public int getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(int truongPhong) {
        this.truongPhong = truongPhong;
    }
}
