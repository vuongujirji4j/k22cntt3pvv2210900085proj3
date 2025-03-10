package com.springmvc.beans;

import java.util.Date;

public class PvvHopDong {
    private Integer pvv_maHopDong;
    private Integer pvv_maNhanVien;
    private String pvv_loaiHopDong;
    private Date pvv_ngayBatDau;
    private Date pvv_ngayKetThuc;
    private Double pvv_luongCoBan;
    private Double pvv_phuCap;
    private String pvv_trangThai;

    public PvvHopDong() {
        super();
    }

	public Integer getPvv_maHopDong() {
		return pvv_maHopDong;
	}

	public void setPvv_maHopDong(Integer pvv_maHopDong) {
		this.pvv_maHopDong = pvv_maHopDong;
	}

	public Integer getPvv_maNhanVien() {
		return pvv_maNhanVien;
	}

	public void setPvv_maNhanVien(Integer pvv_maNhanVien) {
		this.pvv_maNhanVien = pvv_maNhanVien;
	}

	public String getPvv_loaiHopDong() {
		return pvv_loaiHopDong;
	}

	public void setPvv_loaiHopDong(String pvv_loaiHopDong) {
		this.pvv_loaiHopDong = pvv_loaiHopDong;
	}

	public Date getPvv_ngayBatDau() {
		return pvv_ngayBatDau;
	}

	public void setPvv_ngayBatDau(Date pvv_ngayBatDau) {
		this.pvv_ngayBatDau = pvv_ngayBatDau;
	}

	public Date getPvv_ngayKetThuc() {
		return pvv_ngayKetThuc;
	}

	public void setPvv_ngayKetThuc(Date pvv_ngayKetThuc) {
		this.pvv_ngayKetThuc = pvv_ngayKetThuc;
	}

	public Double getPvv_luongCoBan() {
		return pvv_luongCoBan;
	}

	public void setPvv_luongCoBan(Double pvv_luongCoBan) {
		this.pvv_luongCoBan = pvv_luongCoBan;
	}

	public Double getPvv_phuCap() {
		return pvv_phuCap;
	}

	public void setPvv_phuCap(Double pvv_phuCap) {
		this.pvv_phuCap = pvv_phuCap;
	}

	public String getPvv_trangThai() {
		return pvv_trangThai;
	}

	public void setPvv_trangThai(String pvv_trangThai) {
		this.pvv_trangThai = pvv_trangThai;
	}

    // ✅ Sửa getMaHopDong() để trả về Integer

}
