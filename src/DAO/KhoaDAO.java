/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CACDULIEU.Khoa;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class KhoaDAO extends AbstractTableModel{
    public String Name[] = {"Mã Khoa","Tên Khoa"};
    public Class classess[] = {String.class,String.class};
    
    ArrayList<Khoa> ds = new ArrayList<Khoa>();
    public KhoaDAO(ArrayList<Khoa> cn){
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
                return ds.get(rowIndex).getMaKhoa();
            case 1 :
                return ds.get(rowIndex).getTenKhoa();
            
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
