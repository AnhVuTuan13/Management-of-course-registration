/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CACDULIEU.HocPhan;
import CACDULIEU.LopHocPhan;
import CACDULIEU.GiangVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class DKHocPhanDAO extends AbstractTableModel{
    public String Name[] = {"Mã Lớp Học Phần","Tên Môn","Giảng Viên","Tiết","Thứ","Ngày Bắt Đầu","Địa Điểm","Học Phí"};
    public Class classess[] = {String.class,String.class,String.class,String.class,String.class,String.class,String.class,Float.class};
    
    ArrayList<LopHocPhan> dsLhp = new ArrayList<LopHocPhan>();
    ArrayList<HocPhan> dshp = new ArrayList<HocPhan>();
    ArrayList<GiangVien> dsGv = new ArrayList<GiangVien>();

    public DKHocPhanDAO(ArrayList<LopHocPhan> lhp,ArrayList<HocPhan> hp, ArrayList<GiangVien> gv) {
        this.dsLhp=lhp;
        this.dsGv=gv;
        this.dshp=hp;
    }
    
    

    @Override
    public int getRowCount() {
        return dsLhp.size();
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
    String TenGV(String gv){
        String kq="";
        for(var it: dsGv){
            if(it.getMaGiangVien().equals(gv)){
                kq=it.getTenGiangVien();
            }
        }
        return kq;
    }
    float HocPhi(String mahp){
       float kq=0;
      
       for(var it : dshp){
           if(it.getMaHocPhan().equals(mahp)){
                kq=(float) (it.getSoTCLT()+it.getSoTCTH())*it.getDonGiaTinChi();
            }
       }
       return kq;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :
                return dsLhp.get(rowIndex).getMaLopHocPhan();
            case 1 :
                return TenHP(dsLhp.get(rowIndex).getMaHocPhan());
            case 2 :
                return TenGV(dsLhp.get(rowIndex).getMaGiangVien());
            case 3 :
                return dsLhp.get(rowIndex).getTietDay();
            case 4 :
                return dsLhp.get(rowIndex).getNgayHoc();
            case 5 :
                return dsLhp.get(rowIndex).getNgayBatDau();
            case 6 :
                return dsLhp.get(rowIndex).getDiaDiem();
            case 7 :
                return HocPhi(dsLhp.get(rowIndex).getMaHocPhan());
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
