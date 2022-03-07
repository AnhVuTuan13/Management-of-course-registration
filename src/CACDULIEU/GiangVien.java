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
public class GiangVien  implements Serializable {
    private String MaGiangVien;
    private String TenGiangVien;

    public GiangVien(String MaGiangVien, String TenGiangVien) {
        this.MaGiangVien = MaGiangVien;
        this.TenGiangVien = TenGiangVien;
    }

    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public String getTenGiangVien() {
        return TenGiangVien;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public void setTenGiangVien(String TenGiangVien) {
        this.TenGiangVien = TenGiangVien;
    }

    public GiangVien() {
    }
    
    
}
