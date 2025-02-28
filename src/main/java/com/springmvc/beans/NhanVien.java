package com.springmvc.beans;
import java.util.Date; 
//import java.sql.Date;


public class NhanVien {
	  private int maNhanVien;
	    private String hoTen;
	    private Date ngaySinh; // Đổi từ java.sql.Date sang java.util.Date
	    private String gioiTinh;
	    private String diaChi;
	    private String soDienThoai;
	    private String email;
	    private int maPhongBan;
	    private String chucVu;
	    private Date ngayVaoLam; // Đổi từ java.sql.Date sang java.util.Date

    // Constructors
    public NhanVien() {
        super();
    }

    public NhanVien(String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String soDienThoai, 
                    String email, int maPhongBan, String chucVu, Date ngayVaoLam) {
        super();
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.maPhongBan = maPhongBan;
        this.chucVu = chucVu;
        this.ngayVaoLam = ngayVaoLam;
    }

    // Getters and Setters
    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
}
