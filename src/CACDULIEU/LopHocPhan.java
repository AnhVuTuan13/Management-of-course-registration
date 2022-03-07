/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CACDULIEU;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class LopHocPhan implements Serializable{
    private String MaLopHocPhan;
    private String MaHocPhan;
    private String MaGiangVien;
    private String TietDay;
    private String NgayHoc;
    private String NgayBatDau;
    private String DiaDiem;

    public LopHocPhan() {
    }

    public LopHocPhan(String MaLopHocPhan, String MaHocPhan, String MaGiangVien, String TietDay, String NgayHoc, String NgayBatDau, String DiaDiem) {
        this.MaLopHocPhan = MaLopHocPhan;
        this.MaHocPhan = MaHocPhan;
        this.MaGiangVien = MaGiangVien;
        this.TietDay = TietDay;
        this.NgayHoc = NgayHoc;
        this.NgayBatDau = NgayBatDau;
        this.DiaDiem = DiaDiem;
    }

    public void setMaLopHocPhan(String MaLopHocPhan) {
        this.MaLopHocPhan = MaLopHocPhan;
    }

    public void setMaHocPhan(String MaHocPhan) {
        this.MaHocPhan = MaHocPhan;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public void setTietDay(String TietDay) {
        this.TietDay = TietDay;
    }

    public void setNgayHoc(String NgayHoc) {
        this.NgayHoc = NgayHoc;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public void setDiaDiem(String DiaDiem) {
        this.DiaDiem = DiaDiem;
    }

    public String getMaLopHocPhan() {
        return MaLopHocPhan;
    }

    public String getMaHocPhan() {
        return MaHocPhan;
    }

    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public String getTietDay() {
        return TietDay;
    }

    public String getNgayHoc() {
        return NgayHoc;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public String getDiaDiem() {
        return DiaDiem;
    }

    
    
}
