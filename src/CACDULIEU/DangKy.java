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
public class DangKy  implements Serializable{
    private String MaSinhVien;
    private String MaLopHocPhan;
    private String MaHocPhan;

    public DangKy(String MaSinhVien, String MaLopHocPhan, String MaHocPhan) {
        this.MaSinhVien = MaSinhVien;
        this.MaLopHocPhan = MaLopHocPhan;
        this.MaHocPhan = MaHocPhan;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public void setMaLopHocPhan(String MaLopHocPhan) {
        this.MaLopHocPhan = MaLopHocPhan;
    }

    public void setMaHocPhan(String MaHocPhan) {
        this.MaHocPhan = MaHocPhan;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public String getMaLopHocPhan() {
        return MaLopHocPhan;
    }

    public String getMaHocPhan() {
        return MaHocPhan;
    }

    public DangKy() {
    }
}
