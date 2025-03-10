package com.springmvc.beans;

public class PvvPhongBan {
    private int pvv_maPhongBan;
    private String pvv_tenPhongBan;
    private String pvv_moTa;
    private int pvv_truongPhong;

    // Constructors

    /**
	 * 
	 */
	public PvvPhongBan() {
		super();
	}


	/**
	 * @param pvv_maPhongBan
	 * @param pvv_tenPhongBan
	 * @param pvv_moTa
	 * @param pvv_truongPhong
	 */
	public PvvPhongBan(int pvv_maPhongBan, String pvv_tenPhongBan, String pvv_moTa, int pvv_truongPhong) {
		this.pvv_maPhongBan = pvv_maPhongBan;
		this.pvv_tenPhongBan = pvv_tenPhongBan;
		this.pvv_moTa = pvv_moTa;
		this.pvv_truongPhong = pvv_truongPhong;
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
	 * @return the pvv_tenPhongBan
	 */
	public String getPvv_tenPhongBan() {
		return pvv_tenPhongBan;
	}


	/**
	 * @param pvv_tenPhongBan the pvv_tenPhongBan to set
	 */
	public void setPvv_tenPhongBan(String pvv_tenPhongBan) {
		this.pvv_tenPhongBan = pvv_tenPhongBan;
	}


	/**
	 * @return the pvv_moTa
	 */
	public String getPvv_moTa() {
		return pvv_moTa;
	}


	/**
	 * @param pvv_moTa the pvv_moTa to set
	 */
	public void setPvv_moTa(String pvv_moTa) {
		this.pvv_moTa = pvv_moTa;
	}


	/**
	 * @return the pvv_truongPhong
	 */
	public int getPvv_truongPhong() {
		return pvv_truongPhong;
	}


	/**
	 * @param pvv_truongPhong the pvv_truongPhong to set
	 */
	public void setPvv_truongPhong(int pvv_truongPhong) {
		this.pvv_truongPhong = pvv_truongPhong;
	}




   
  
}
