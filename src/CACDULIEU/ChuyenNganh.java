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
public class ChuyenNganh implements Serializable{
    private String MaCN;
    private String TenCN;
    private String MaKhoa;

    public ChuyenNganh() {
    }

    public ChuyenNganh(String MaCN, String TenCN, String MaKhoa) {
        this.MaCN = MaCN;
        this.TenCN = TenCN;
        this.MaKhoa = MaKhoa;
    }

    public String getMaCN() {
        return MaCN;
    }

    public String getTenCN() {
        return TenCN;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaCN(String MaCN) {
        this.MaCN = MaCN;
    }

    public void setTenCN(String TenCN) {
        this.TenCN = TenCN;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
    
}
