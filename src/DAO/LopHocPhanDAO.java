/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import CACDULIEU.LopHocPhan;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class LopHocPhanDAO extends AbstractTableModel{
    public String Name[] = {"Mã Lớp Học Phần","Mã Học Phần","Mã Giảng Viên","Tiết Dạy","Ngày Học","Ngày Bắt Đầuu","Địa Điểm"};
    public Class classess[] = {String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    ArrayList<LopHocPhan> ds = new ArrayList<LopHocPhan>();
    
    public LopHocPhanDAO(ArrayList<LopHocPhan> cn){
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
                return ds.get(rowIndex).getMaLopHocPhan();
            case 1 :
                return ds.get(rowIndex).getMaHocPhan();
            case 2 :
                return ds.get(rowIndex).getMaGiangVien();
            case 3 :
                return ds.get(rowIndex).getTietDay();
            case 4 :
                return ds.get(rowIndex).getNgayHoc();
            case 5 :
                return ds.get(rowIndex).getNgayBatDau();
            case 6 :
                return ds.get(rowIndex).getDiaDiem();
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
