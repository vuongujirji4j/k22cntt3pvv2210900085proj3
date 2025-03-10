package com.springmvc.beans;
import java.util.Date; 
//import java.sql.Date;


public class PvvNhanVien {
	  private int pvv_maNhanVien;
	    private String pvv_hoTen;
	    private Date pvv_ngaySinh; // Đổi từ java.sql.Date sang java.util.Date
	    private String pvv_gioiTinh;
	    private String pvv_diaChi;
	    private String pvv_soDienThoai;
	    private String pvv_email;
	    private int pvv_maPhongBan;
	    private String pvv_chucVu;
	    private Date pvv_ngayVaoLam; // Đổi từ java.sql.Date sang java.util.Date

    // Constructors
    public PvvNhanVien() {
        super();
    }

	/**
	 * @param pvv_hoTen
	 * @param pvv_ngaySinh
	 * @param pvv_gioiTinh
	 * @param pvv_diaChi
	 * @param pvv_soDienThoai
	 * @param pvv_email
	 * @param pvv_maPhongBan
	 * @param pvv_chucVu
	 * @param pvv_ngayVaoLam
	 */
	public PvvNhanVien(String pvv_hoTen, Date pvv_ngaySinh, String pvv_gioiTinh, String pvv_diaChi,
			String pvv_soDienThoai, String pvv_email, int pvv_maPhongBan, String pvv_chucVu, Date pvv_ngayVaoLam) {
		this.pvv_hoTen = pvv_hoTen;
		this.pvv_ngaySinh = pvv_ngaySinh;
		this.pvv_gioiTinh = pvv_gioiTinh;
		this.pvv_diaChi = pvv_diaChi;
		this.pvv_soDienThoai = pvv_soDienThoai;
		this.pvv_email = pvv_email;
		this.pvv_maPhongBan = pvv_maPhongBan;
		this.pvv_chucVu = pvv_chucVu;
		this.pvv_ngayVaoLam = pvv_ngayVaoLam;
	}

	/**
	 * @return the pvv_maNhanVien
	 */
	public int getPvv_maNhanVien() {
		return pvv_maNhanVien;
	}

	/**
	 * @param pvv_maNhanVien the pvv_maNhanVien to set
	 */
	public void setPvv_maNhanVien(int pvv_maNhanVien) {
		this.pvv_maNhanVien = pvv_maNhanVien;
	}

	/**
	 * @return the pvv_hoTen
	 */
	public String getPvv_hoTen() {
		return pvv_hoTen;
	}

	/**
	 * @param pvv_hoTen the pvv_hoTen to set
	 */
	public void setPvv_hoTen(String pvv_hoTen) {
		this.pvv_hoTen = pvv_hoTen;
	}

	/**
	 * @return the pvv_ngaySinh
	 */
	public Date getPvv_ngaySinh() {
		return pvv_ngaySinh;
	}

	/**
	 * @param pvv_ngaySinh the pvv_ngaySinh to set
	 */
	public void setPvv_ngaySinh(Date pvv_ngaySinh) {
		this.pvv_ngaySinh = pvv_ngaySinh;
	}

	/**
	 * @return the pvv_gioiTinh
	 */
	public String getPvv_gioiTinh() {
		return pvv_gioiTinh;
	}

	/**
	 * @param pvv_gioiTinh the pvv_gioiTinh to set
	 */
	public void setPvv_gioiTinh(String pvv_gioiTinh) {
		this.pvv_gioiTinh = pvv_gioiTinh;
	}

	/**
	 * @return the pvv_diaChi
	 */
	public String getPvv_diaChi() {
		return pvv_diaChi;
	}

	/**
	 * @param pvv_diaChi the pvv_diaChi to set
	 */
	public void setPvv_diaChi(String pvv_diaChi) {
		this.pvv_diaChi = pvv_diaChi;
	}

	/**
	 * @return the pvv_soDienThoai
	 */
	public String getPvv_soDienThoai() {
		return pvv_soDienThoai;
	}

	/**
	 * @param pvv_soDienThoai the pvv_soDienThoai to set
	 */
	public void setPvv_soDienThoai(String pvv_soDienThoai) {
		this.pvv_soDienThoai = pvv_soDienThoai;
	}

	/**
	 * @return the pvv_email
	 */
	public String getPvv_email() {
		return pvv_email;
	}

	/**
	 * @param pvv_email the pvv_email to set
	 */
	public void setPvv_email(String pvv_email) {
		this.pvv_email = pvv_email;
	}

	/**
	 * @return the pvv_maPhongBan
	 */
	public int getPvv_maPhongBan() {
		return pvv_maPhongBan;
	}

	/**
	 * @param pvv_maPhongBan the pvv_maPhongBan to set
	 */
	public void setPvv_maPhongBan(int pvv_maPhongBan) {
		this.pvv_maPhongBan = pvv_maPhongBan;
	}

	/**
	 * @return the pvv_chucVu
	 */
	public String getPvv_chucVu() {
		return pvv_chucVu;
	}

	/**
	 * @param pvv_chucVu the pvv_chucVu to set
	 */
	public void setPvv_chucVu(String pvv_chucVu) {
		this.pvv_chucVu = pvv_chucVu;
	}

	/**
	 * @return the pvv_ngayVaoLam
	 */
	public Date getPvv_ngayVaoLam() {
		return pvv_ngayVaoLam;
	}

	/**
	 * @param pvv_ngayVaoLam the pvv_ngayVaoLam to set
	 */
	public void setPvv_ngayVaoLam(Date pvv_ngayVaoLam) {
		this.pvv_ngayVaoLam = pvv_ngayVaoLam;
	}

    
}