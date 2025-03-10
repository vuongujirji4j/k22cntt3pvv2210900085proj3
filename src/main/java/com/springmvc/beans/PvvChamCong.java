package com.springmvc.beans;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class PvvChamCong {
    private int pvv_maChamCong;
    private int pvv_maNhanVien;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd") // Định dạng ngày tháng
    private Date pvv_ngay;
    
    private String pvv_gioVao;
    private String pvv_gioRa;

    public PvvChamCong() {
        super();
    }

	/**
	 * @return the pvv_maChamCong
	 */
	public int getPvv_maChamCong() {
		return pvv_maChamCong;
	}

	/**
	 * @param pvv_maChamCong the pvv_maChamCong to set
	 */
	public void setPvv_maChamCong(int pvv_maChamCong) {
		this.pvv_maChamCong = pvv_maChamCong;
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
	 * @return the pvv_ngay
	 */
	public Date getPvv_ngay() {
		return pvv_ngay;
	}

	/**
	 * @param pvv_ngay the pvv_ngay to set
	 */
	public void setPvv_ngay(Date pvv_ngay) {
		this.pvv_ngay = pvv_ngay;
	}

	/**
	 * @return the pvv_gioVao
	 */
	public String getPvv_gioVao() {
		return pvv_gioVao;
	}

	/**
	 * @param pvv_gioVao the pvv_gioVao to set
	 */
	public void setPvv_gioVao(String pvv_gioVao) {
		this.pvv_gioVao = pvv_gioVao;
	}

	/**
	 * @return the pvv_gioRa
	 */
	public String getPvv_gioRa() {
		return pvv_gioRa;
	}

	/**
	 * @param pvv_gioRa the pvv_gioRa to set
	 */
	public void setPvv_gioRa(String pvv_gioRa) {
		this.pvv_gioRa = pvv_gioRa;
	}

    // Getters & Setters
   
}