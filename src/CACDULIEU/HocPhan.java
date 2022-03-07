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
public class HocPhan implements Serializable{
    private String MaHocPhan;
    private String TenHocPhan;
    private int SoTCLT;
    private int SoTCTH;
    private int DonGiaTinChi;

    public HocPhan() {
    }

    public HocPhan(String MaHocPhan, String TenHocPhan, int SoTCLT, int SoTCTH, int DonGiaTinChi) {
        this.MaHocPhan = MaHocPhan;
        this.TenHocPhan = TenHocPhan;
        this.SoTCLT = SoTCLT;
        this.SoTCTH = SoTCTH;
        this.DonGiaTinChi = DonGiaTinChi;
    }

    public void setMaHocPhan(String MaHocPhan) {
        this.MaHocPhan = MaHocPhan;
    }

    public void setTenHocPhan(String TenHocPhan) {
        this.TenHocPhan = TenHocPhan;
    }

    public void setSoTCLT(int SoTCLT) {
        this.SoTCLT = SoTCLT;
    }

    public void setSoTCTH(int SoTCTH) {
        this.SoTCTH = SoTCTH;
    }

    public void setDonGiaTinChi(int DonGiaTinChi) {
        this.DonGiaTinChi = DonGiaTinChi;
    }

    public String getMaHocPhan() {
        return MaHocPhan;
    }

    public String getTenHocPhan() {
        return TenHocPhan;
    }

    public int getSoTCLT() {
        return SoTCLT;
    }

    public int getSoTCTH() {
        return SoTCTH;
    }

    public int getDonGiaTinChi() {
        return DonGiaTinChi;
    }
    
}
