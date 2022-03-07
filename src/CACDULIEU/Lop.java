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
public class Lop implements Serializable{
    private  String MaLop;
    private  String TenLop;
    private int Siso;
    private  String KhoaHoc;
    private  String MaChuyenNganh;

    public Lop() {
    }

    public Lop(String MaLop, String TenLop, int Siso, String KhoaHoc, String MaChuyenNganh) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.Siso = Siso;
        this.KhoaHoc = KhoaHoc;
        this.MaChuyenNganh = MaChuyenNganh;
    }

    public String getMaLop() {
        return MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public int getSiso() {
        return Siso;
    }

    public String getKhoaHoc() {
        return KhoaHoc;
    }

    public String getMaChuyenNganh() {
        return MaChuyenNganh;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public void setSiso(int Siso) {
        this.Siso = Siso;
    }

    public void setKhoaHoc(String KhoaHoc) {
        this.KhoaHoc = KhoaHoc;
    }

    public void setMaChuyenNganh(String MaChuyenNganh) {
        this.MaChuyenNganh = MaChuyenNganh;
    }

    
    
}
