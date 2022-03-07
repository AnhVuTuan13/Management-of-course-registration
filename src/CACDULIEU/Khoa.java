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
public class Khoa implements Serializable {
    private String MaKhoa;
    private String TenKhoa;

    public Khoa() {
    }

    public Khoa(String MaKhoa, String TenKhoa) {
        this.MaKhoa = MaKhoa;
        this.TenKhoa = TenKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }
    
    
}
