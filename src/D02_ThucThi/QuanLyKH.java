/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D02_ThucThi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QuanLyKH extends QuanLy {
    static int index;
    
    
    public String getMaCuoi(){
        String result ="";
        try {
            Connection conn = LoginRun.con;
//            WHERE XOA = 0
            CallableStatement cstmt = conn.prepareCall("SELECT TOP 1 MAKH FROM KHACHHANG ORDER BY MAKH DESC");
            ResultSet rs = cstmt.executeQuery();
//            System.out.println(rs);
//            System.out.println(rs.next());
            rs.next();
            result = rs.getString(1);  
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
//        System.out.println(result);
        return result;
    }
    @Override
    public DefaultTableModel taiTT(){
        DefaultTableModel table = new DefaultTableModel();
        try {
            Connection conn = LoginRun.con;
            CallableStatement cstmt = conn.prepareCall("SELECT * from KHACHHANG WHERE XOA = 0");
            ResultSet rs = cstmt.executeQuery();
    
            String []colsName = {"STT", "Mã KH", "Họ và tên", "Địa chỉ", "Số ĐT", "Sinh nhật", "Ngày ĐK", "Doanh số", "Loại KH" };
            table.setColumnIdentifiers(colsName);
            index = 1;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            try {
            while(rs.next()){ // nếu còn đọc tiếp được một dòng dữ liệu
                String rows[] = new String[9];
                rows[0] = Integer.toString(index);
                rows[1] = rs.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã ) 
                rows[2] = rs.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên
                rows[3] = rs.getString(3);
                rows[4] = rs.getString(4);
                rows[5] = df.format(rs.getDate(5));
                rows[6] = df.format(rs.getDate(6));
                rows[7] = rs.getString(7);
                rows[8] = rs.getString(8);
                
                table.addRow(rows); // đưa dòng dữ liệu vào tableModel để hiện thị lên jtable
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update lại trên frame
                index++;
            }
            } catch (SQLException e) {
            }
         
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
        return table;
    }
    
    @Override
    public DefaultTableModel xoaDong(int i, DefaultTableModel table, int count){
        System.out.println("row = " + i);
        table.removeRow(i);
        int j = i;
        for(  ; j <(index-count-1); j++ ){
            table.setValueAt(j+1, j, 0);
        }
        return table;
    }
    @Override
    public void xoaDongTrenSQL(int i){
        try {
            Connection conn = LoginRun.con;
            CallableStatement cstmt = conn.prepareCall("SELECT MAKH from KHACHHANG WHERE XOA = 0");
            ResultSet rs = cstmt.executeQuery();
            int temp = 0; String makh="";
            try {
                while(rs.next()&&temp<=i){
                    if(temp == i){
                        makh = rs.getString("MAKH");
                        System.out.println(makh);
                    }
                    temp++;
                }
            } catch (SQLException e) {
                System.out.println("loi oy");
            }
//            cstmt = conn.prepareCall("DELETE from KHACHHANG where MAKH = '" + makh + "'"); 
            cstmt = conn.prepareCall("UPDATE KHACHHANG SET XOA =" + 1 + " WHERE MAKH='" + makh + "'");
            cstmt.execute();
            
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
    }
    public boolean them(String MaKH, String HoTenKH, String DiaChiKH, String SoDTKH, Date SinhNhatKH, Date NgDKKH, short loai) {
        try {
            Connection conn = LoginRun.con;
            String loaiKH;
            switch (loai) {
                case 1:
                    loaiKH = "Vang lai";
                    break;
                case 2:
                    loaiKH = "Thuong xuyen";
                    break;
                case 3:
                    loaiKH = "Vip";
                    break;
                default:
                    loaiKH = "";
                    break;
            }

            CallableStatement cstmt = conn.prepareCall("INSERT INTO KHACHHANG VALUES ('" + MaKH + "', '" + HoTenKH + "', '"
                    + DiaChiKH + "', '" + SoDTKH + "', '" + new java.sql.Date(SinhNhatKH.getTime()) + "', '"   
                    + new java.sql.Date(NgDKKH.getTime()) + "', '" + 1 + "', '" + loaiKH 
                    + "', '" + 0 + "')");
            cstmt.execute();
            return true;
            
        } catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
            return false;
        }
        
    }

}
