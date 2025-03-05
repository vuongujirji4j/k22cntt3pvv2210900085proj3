package com.springmvc.beans;

public class DanhGia {
    private int maDanhGia;
    private int maNhanVien;
    private String kyDanhGia;
    private int diemSo;
    private String nhanXet;

    /**
	 * 
	 */
	public DanhGia() {
		super();
	}
	// Getters & Setters
    public int getMaDanhGia() { return maDanhGia; }
    public void setMaDanhGia(int maDanhGia) { this.maDanhGia = maDanhGia; }

    public int getMaNhanVien() { return maNhanVien; }
    public void setMaNhanVien(int maNhanVien) { this.maNhanVien = maNhanVien; }

    public String getKyDanhGia() { return kyDanhGia; }
    public void setKyDanhGia(String kyDanhGia) { this.kyDanhGia = kyDanhGia; }

    public int getDiemSo() { return diemSo; }
    public void setDiemSo(int diemSo) { this.diemSo = diemSo; }

    public String getNhanXet() { return nhanXet; }
    public void setNhanXet(String nhanXet) { this.nhanXet = nhanXet; }
}
