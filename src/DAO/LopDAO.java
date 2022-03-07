/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import CACDULIEU.Lop;
/**
 *
 * @author ADMIN
 */
public class LopDAO extends AbstractTableModel{
    public String Name[] = {"Mã Lớp","Tên Lớp","Sĩ Số","Khóa Học","Mã Chuyên Ngành"};
    public Class classess[] = {String.class,String.class,Integer.class,String.class,String.class};
    ArrayList<Lop> ds = new ArrayList<Lop>();
    
    public LopDAO(ArrayList<Lop> cn){
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
                return ds.get(rowIndex).getMaLop();
            case 1 :
                return ds.get(rowIndex).getTenLop();
            case 2 :
                return ds.get(rowIndex).getSiso();
            case 3 :
                return ds.get(rowIndex).getKhoaHoc();
            case 4 :
                return ds.get(rowIndex).getMaChuyenNganh();
            
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
