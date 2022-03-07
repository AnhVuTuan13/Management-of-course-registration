/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CACDULIEU.DangKy;
import CACDULIEU.HocPhan;
import CACDULIEU.LopHocPhan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class XemLichHocDAO extends AbstractTableModel{
    public String Name[] = {"Mã Lớp Học Phần","Tên Học Phân","Tiết Học ","Thứ","Ngày Bắt Đầu","Địa Điểm"};
    public Class classess[] = {String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<DangKy> dsdk = new ArrayList<DangKy>();
    ArrayList<LopHocPhan> dsLhp = new ArrayList<LopHocPhan>();
    ArrayList<HocPhan> dshp = new ArrayList<HocPhan>();
    
    public XemLichHocDAO(ArrayList<LopHocPhan> lhp,ArrayList<HocPhan> hp, ArrayList<DangKy> dk){
        this.dsLhp=lhp;
        this.dsdk=dk;
        this.dshp=hp;
    } 

    @Override
    public int getRowCount() {
        return dsdk.size();
    }

    @Override
    public int getColumnCount() {
       return Name.length;
    }
    
    String TenHP(String mahp){
        String kq="";
        for(var it: dshp){
            if(it.getMaHocPhan().equals(mahp)){
                kq=it.getTenHocPhan();
            }
        }
        return kq;
    }
    String TietHoc(String malhp){
        String kq="";
        for(var it: dsLhp){
            if(it.getMaLopHocPhan().equals(malhp)){
                kq=it.getTietDay();
            }
        }
        return kq;
    }
    String Thu(String malhp){
        String kq="";
        for(var it: dsLhp){
            if(it.getMaLopHocPhan().equals(malhp)){
                kq=it.getNgayHoc();
            }
        }
        return kq;
    }
    String NgayBD(String malhp){
        String kq="";
        for(var it: dsLhp){
            if(it.getMaLopHocPhan().equals(malhp)){
                kq=it.getNgayBatDau();
            }
        }
        return kq;
    }
    String Diad(String malhp){
        String kq="";
        for(var it: dsLhp){
            if(it.getMaLopHocPhan().equals(malhp)){
                kq=it.getDiaDiem();
            }
        }
        return kq;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :
                return dsdk.get(rowIndex).getMaLopHocPhan();
            case 1 :
                return TenHP(dsdk.get(rowIndex).getMaHocPhan());
            case 2 :
                return TietHoc(dsdk.get(rowIndex).getMaLopHocPhan());
            case 3 :
                return Thu(dsdk.get(rowIndex).getMaLopHocPhan());
            case 4 :
                return NgayBD(dsdk.get(rowIndex).getMaLopHocPhan());
            case 5 :
                return Diad(dsdk.get(rowIndex).getMaLopHocPhan());
             default: return null;
        }
    }
    @Override
    public Class getColumnClass(int ColumnIndex){
           return classess[ColumnIndex];
    }
    @Override
     public String getColumnName(int Column){
           return Name[Column];
    }
}
