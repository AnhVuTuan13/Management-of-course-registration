/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import CACDULIEU.GiangVien;
/**
 *
 * @author ADMIN
 */
public class GiangVienDAO extends AbstractTableModel{
    public String Name[] = {"Mã Giảng Viên","Tên Giảng Viên"};
    public Class classess[] = {String.class,String.class};
    ArrayList<GiangVien> ds = new ArrayList<GiangVien>();
    
    public GiangVienDAO(ArrayList<GiangVien> cn){
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
                return ds.get(rowIndex).getMaGiangVien();
            case 1 :
                return ds.get(rowIndex).getTenGiangVien();
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
