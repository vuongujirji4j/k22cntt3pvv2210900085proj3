package com.springmvc.beans;

import java.util.Date;

public class PvvDonNghiPhep {
    private Integer pvv_MaDon;
    private Integer pvv_MaNhanVien;
    private Date pvv_NgayBatDau;
    private Date pvv_NgayKetThuc;
    private String pvv_LyDo;
    private String pvv_TrangThai;

    public PvvDonNghiPhep() {}

    public Integer getPvv_MaDon() { return pvv_MaDon; }
    public void setPvv_MaDon(Integer pvv_MaDon) { this.pvv_MaDon = pvv_MaDon; }

    public Integer getPvv_MaNhanVien() { return pvv_MaNhanVien; }
    public void setPvv_MaNhanVien(Integer pvv_MaNhanVien) { this.pvv_MaNhanVien = pvv_MaNhanVien; }

    public Date getPvv_NgayBatDau() { return pvv_NgayBatDau; }
    public void setPvv_NgayBatDau(Date pvv_NgayBatDau) { this.pvv_NgayBatDau = pvv_NgayBatDau; }

    public Date getPvv_NgayKetThuc() { return pvv_NgayKetThuc; }
    public void setPvv_NgayKetThuc(Date pvv_NgayKetThuc) { this.pvv_NgayKetThuc = pvv_NgayKetThuc; }

    public String getPvv_LyDo() { return pvv_LyDo; }
    public void setPvv_LyDo(String pvv_LyDo) { this.pvv_LyDo = pvv_LyDo; }

    public String getPvv_TrangThai() { return pvv_TrangThai; }
    public void setPvv_TrangThai(String pvv_TrangThai) { this.pvv_TrangThai = pvv_TrangThai; }
}
