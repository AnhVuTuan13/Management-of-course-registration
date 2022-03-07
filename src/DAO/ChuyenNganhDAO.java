/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.ArrayList;
import CACDULIEU.ChuyenNganh;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ADMIN
 */
public class ChuyenNganhDAO extends AbstractTableModel{
    public String Name[] = {"Mã Chuyên Ngành","Tên Chuyên Ngành","Mã Khoa"};
    public Class classess[] = {String.class,String.class,String.class};
    
    ArrayList<ChuyenNganh> ds = new ArrayList<ChuyenNganh>();
    
    public ChuyenNganhDAO(ArrayList<ChuyenNganh> cn){
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
                return ds.get(rowIndex).getMaCN();
            case 1 :
                return ds.get(rowIndex).getTenCN();
            case 2 :
                return ds.get(rowIndex).getMaKhoa();
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
