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

public class TaiKhoan  implements Serializable {
    private String TK;
    private String MK;

    public TaiKhoan() {
    }

    public TaiKhoan(String TK, String MK) {
        this.TK = TK;
        this.MK = MK;
    }

    public String getTK() {
        return TK;
    }

    public String getMK() {
        return MK;
    }

    public void setTK(String TK) {
        this.TK = TK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }
}
