/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.table.AbstractTableModel;
import CACDULIEU.SinhVien;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class SinhVienDAO extends AbstractTableModel{
    public String Name[] = {"Mã Sinh Viên","Họ Tên","Ngày Sinh","Giới Tính","Địa Chỉ","Hệ Đào Tạo"};
    public Class classess[] = {String.class,String.class,String.class,String.class,String.class,String.class};
    ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
    public SinhVienDAO(ArrayList<SinhVien> cn){
          ds = cn;
    } 

    @Override
    public int getRowCount() {
        return ds.size();
    }

    @Override
    public int getColumnCount() {
       return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :
                return ds.get(rowIndex).getMaSinhVien();
            case 1 :
                return ds.get(rowIndex).getHoTen();
            case 2 :
                return ds.get(rowIndex).getNgaySinh();
            case 3 :
                return ds.get(rowIndex).getGioiTinh();
            case 4 :
                return ds.get(rowIndex).getDiaChi();
            case 5 :
                return ds.get(rowIndex).getHeDaoTao();
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
