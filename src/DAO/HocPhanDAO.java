/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import javax.swing.table.AbstractTableModel;
import CACDULIEU.HocPhan;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class HocPhanDAO extends AbstractTableModel{
    public String Name[] = {"Mã Học Phần","Tên Học Phần","Số Tín Chỉ Lý Thuyết","Số Tín Chỉ Thực Hành","Đơn Giá Một Tín Chỉ"};
    public Class classess[] = {String.class,String.class,Integer.class,Integer.class,Integer.class};
    ArrayList<HocPhan> ds = new ArrayList<HocPhan>();
    
    public HocPhanDAO(ArrayList<HocPhan> cn){
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
                return ds.get(rowIndex).getMaHocPhan();
            case 1 :
                return ds.get(rowIndex).getTenHocPhan();
            case 2 :
                return ds.get(rowIndex).getSoTCLT();
            case 3 :
                return ds.get(rowIndex).getSoTCTH();
            case 4 :
                return ds.get(rowIndex).getDonGiaTinChi();
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
