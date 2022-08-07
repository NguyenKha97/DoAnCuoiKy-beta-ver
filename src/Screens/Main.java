/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import D02_ThucThi.LoginRun;
import D02_ThucThi.QuanLy;
import D02_ThucThi.QuanLyHD;
import D02_ThucThi.QuanLyKH;
import D02_ThucThi.QuanLyNV;
import D02_ThucThi.QuanLySP;
import javax.swing.table.DefaultTableModel;
import D02_ThucThi.QuanLyHD;
import static Screens.NhapTTKH.txtmaKH;
import doancuoiky.DoAnCuoiKy;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import D02_ThucThi.QuanLyCTHD;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author HP
 */
public class Main extends javax.swing.JFrame {
    

    boolean taittkh, taittnv, taittsp, taitthd, taittCTHD;
    static QuanLyKH qlkh = new QuanLyKH();
    static QuanLyNV qlnv = new QuanLyNV();
    static QuanLySP qlsp = new QuanLySP();
    static QuanLyHD qlhd = new QuanLyHD();
    static DefaultTableModel tableKH = qlkh.taiTT();
    static DefaultTableModel tableNV = qlnv.taiTT();
    static DefaultTableModel tableSP = qlsp.taiTT();
    static DefaultTableModel tableHD = qlhd.taiTT();
    static int countButtonXoaKH = 1;
    static int countButtonXoaNV = 1;
    static int countButtonXoaSP = 1;
    static int countButtonXoaHD = 1;
    static QuanLyCTHD qlcthd = new QuanLyCTHD();
    static DefaultTableModel tableCTHD = qlcthd.taiTT();
    
    
    private boolean xoaAction(javax.swing.JTable table, boolean taitt, int countButton, javax.swing.JButton button, DefaultTableModel dfTable, QuanLy ql) {
        int i = table.getSelectedRow();
        if (i >= 0 && taitt) {
//            System.out.println(table.getSelectedRow());
            int choice = JOptionPane.showConfirmDialog(button, "Ban co chac chan muon xoa du lieu nay", "Thong bao", 0);
//        System.out.println(choice);
            if (choice == 0) {
//                int i = jTable1.getSelectedRow();
//                countButton++;
//                System.out.println(countButton);
                ql.xoaDong(i, dfTable, countButton);
                table.setModel(dfTable);
                ql.xoaDongTrenSQL(i);
                return true;
            }
        }
        return false;
    }
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        khachHang = new javax.swing.JTable();
        taiTTKH = new javax.swing.JButton();
        themKH = new javax.swing.JButton();
        capNhatKH = new javax.swing.JButton();
        xoaKH = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        nhanVien = new javax.swing.JTable();
        taiTTNV = new javax.swing.JButton();
        themNV = new javax.swing.JButton();
        capNhatNV = new javax.swing.JButton();
        xoaNV = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sanPham = new javax.swing.JTable();
        taiTTSP = new javax.swing.JButton();
        themSP = new javax.swing.JButton();
        capNhatSP = new javax.swing.JButton();
        xoaSP = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        HoaDon = new javax.swing.JTable();
        taiTTHD = new javax.swing.JButton();
        btnThemHD = new javax.swing.JButton();
        btnXemHD = new javax.swing.JButton();
        btnXoaHD = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CTHD = new javax.swing.JTable();
        btnTaiTTCTHD = new javax.swing.JButton();
        dangxuat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Màn hình chính");

        khachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã KH", "Họ và tên", "Địa chỉ", "Số ĐT", "Sinh nhật", "Ngày ĐK", "Doanh số", "Loại KH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        khachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        khachHang.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(khachHang);

        taiTTKH.setText("TẢI TT KH");
        taiTTKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taiTTKHActionPerformed(evt);
            }
        });

        themKH.setText("THÊM KH");
        themKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themKHActionPerformed(evt);
            }
        });

        capNhatKH.setText("CẬP NHẬT TT KH");

        xoaKH.setText("XÓA KH");
        xoaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(taiTTKH)
                .addGap(61, 61, 61)
                .addComponent(themKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(capNhatKH)
                .addGap(53, 53, 53)
                .addComponent(xoaKH)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xoaKH)
                    .addComponent(capNhatKH)
                    .addComponent(themKH)
                    .addComponent(taiTTKH))
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý khách hàng", jPanel1);

        nhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã NV", "Họ và tên", "Số ĐT", "Ngày vào làm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nhanVien.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(nhanVien);

        taiTTNV.setText("TẢI TT NV");
        taiTTNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taiTTNVActionPerformed(evt);
            }
        });

        themNV.setText("THÊM NV");
        themNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themNVActionPerformed(evt);
            }
        });

        capNhatNV.setText("CẬP NHẬT TT NV");

        xoaNV.setText("XÓA NV");
        xoaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(taiTTNV)
                .addGap(58, 58, 58)
                .addComponent(themNV)
                .addGap(51, 51, 51)
                .addComponent(capNhatNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xoaNV)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taiTTNV)
                    .addComponent(themNV)
                    .addComponent(capNhatNV)
                    .addComponent(xoaNV))
                .addGap(0, 275, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý nhân viên", jPanel2);

        sanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Đơn vị tính", "Nước sản xuất", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sanPham.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(sanPham);

        taiTTSP.setText("TẢI TT SP");
        taiTTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taiTTSPActionPerformed(evt);
            }
        });

        themSP.setText("THÊM SP");
        themSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themSPActionPerformed(evt);
            }
        });

        capNhatSP.setText("CẬP NHẬT TT SP");

        xoaSP.setText("XÓA SP");
        xoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(taiTTSP)
                .addGap(62, 62, 62)
                .addComponent(themSP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(capNhatSP)
                .addGap(67, 67, 67)
                .addComponent(xoaSP)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taiTTSP)
                    .addComponent(themSP)
                    .addComponent(capNhatSP)
                    .addComponent(xoaSP))
                .addGap(0, 277, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý sản phẩm", jPanel3);

        HoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Số HD", "Ngày Lập", "Mã Khách Hàng", "Mã Nhân Viên", "Trị Giá"
            }
        ));
        jScrollPane4.setViewportView(HoaDon);

        taiTTHD.setText("Tải TT HD");
        taiTTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taiTTHDActionPerformed(evt);
            }
        });

        btnThemHD.setText("Thêm HD");
        btnThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHDActionPerformed(evt);
            }
        });

        btnXemHD.setText("Xem chi tiết HD");
        btnXemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemHDActionPerformed(evt);
            }
        });

        btnXoaHD.setText("Xóa HD");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(taiTTHD)
                .addGap(55, 55, 55)
                .addComponent(btnThemHD)
                .addGap(88, 88, 88)
                .addComponent(btnXemHD)
                .addGap(69, 69, 69)
                .addComponent(btnXoaHD)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taiTTHD)
                    .addComponent(btnThemHD)
                    .addComponent(btnXemHD)
                    .addComponent(btnXoaHD))
                .addGap(0, 181, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý hóa đơn", jPanel4);

        CTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Số HD", "Mã Sản phẩm", "Số Lượng"
            }
        ));
        jScrollPane5.setViewportView(CTHD);

        btnTaiTTCTHD.setText("Tải TTCTHD");
        btnTaiTTCTHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiTTCTHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnTaiTTCTHD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnTaiTTCTHD)
                .addGap(0, 167, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý chi tiết hóa đơn", jPanel5);

        dangxuat.setText("Đăng xuất");
        dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangxuatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ỨNG DỤNG QUẢN LÝ BÁN HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(dangxuat)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dangxuat)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taiTTKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taiTTKHActionPerformed
         
        khachHang.setModel(tableKH);
        taittkh = true;
    }//GEN-LAST:event_taiTTKHActionPerformed

    private void dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangxuatActionPerformed
        try {
            // TODO add your handling code here:
            LoginRun.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Login.statusLogin = false;
        Login frmLogin = new Login();
        setVisible(false);    
        frmLogin.setVisible(true);
    }//GEN-LAST:event_dangxuatActionPerformed

    private void taiTTNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taiTTNVActionPerformed
        // TODO add your handling code here:
        nhanVien.setModel(tableNV);
        taittnv = true;
    }//GEN-LAST:event_taiTTNVActionPerformed

    private void taiTTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taiTTSPActionPerformed
        // TODO add your handling code here:
        sanPham.setModel(tableSP);
        taittsp = true;
    }//GEN-LAST:event_taiTTSPActionPerformed

    private void themSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themSPActionPerformed
        // TODO add your handling code here:
        NhapTTSP nhapttsp = new NhapTTSP();
        nhapttsp.setVisible(true);
    }//GEN-LAST:event_themSPActionPerformed

    private void xoaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaKHActionPerformed

/*        int i = khachHang.getSelectedRow();
        if(i>=0 && taittkh) {
            System.out.println(khachHang.getSelectedRow());
            int choice = JOptionPane.showConfirmDialog(xoaKH, "Ban co chac chan muon xoa du lieu nay", "Thong bao", 0);
//        System.out.println(choice);
            if (choice == 0) {
//                int i = jTable1.getSelectedRow();
                countButtonxoaKH++;
                qlkh.xoaDong(i, tableKH, countButtonxoaKH);
                khachHang.setModel(tableKH);
                qlkh.xoaDongTrenSQL(i);
            }
        }*/
        if(xoaAction(khachHang, taittkh, countButtonXoaKH, xoaKH, tableKH, qlkh))
            countButtonXoaKH++;
    }//GEN-LAST:event_xoaKHActionPerformed

    private void themKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themKHActionPerformed
        NhapTTKH nhapttkh = new NhapTTKH();
        nhapttkh.setVisible(true);
        nhapttkh.txtmaKH.setText(new DoAnCuoiKy().tangMa(qlkh.getMaCuoi()));
        nhapttkh.txtmaKH.setVisible(true);
    }//GEN-LAST:event_themKHActionPerformed

    private void xoaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaNVActionPerformed
        // TODO add your handling code here:
 /*       int i = nhanVien.getSelectedRow();
        if(i>=0 && taittnv) {
            System.out.println(nhanVien.getSelectedRow());
            int choice = JOptionPane.showConfirmDialog(xoaNV, "Ban co chac chan muon xoa du lieu nay", "Thong bao", 0);
//        System.out.println(choice);
            if (choice == 0) {
//                int i = jTable1.getSelectedRow();
                countButtonxoaNV++;
                qlnv.xoaDong(i, tableNV, countButtonxoaNV);
                nhanVien.setModel(tableNV);
                qlnv.xoaDongTrenSQL(i);
            }
        }*/
        
        if(xoaAction(nhanVien, taittnv, countButtonXoaNV, xoaNV, tableNV, qlnv))
            countButtonXoaNV++;
    }//GEN-LAST:event_xoaNVActionPerformed

    private void xoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaSPActionPerformed

        if(xoaAction(sanPham, taittsp, countButtonXoaSP, xoaSP, tableSP, qlsp))
            countButtonXoaSP++;
    }//GEN-LAST:event_xoaSPActionPerformed

    private void themNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themNVActionPerformed
        // TODO add your handling code here:
        NhapTTNV nhapttnv = new NhapTTNV();
        nhapttnv.setVisible(true);
        nhapttnv.txtmaNV.setText(new DoAnCuoiKy().tangMa(qlnv.getMaCuoi()));
        nhapttnv.txtmaNV.setVisible(true);
    }//GEN-LAST:event_themNVActionPerformed

    private void taiTTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taiTTHDActionPerformed
        // TODO add your handling code here:
        HoaDon.setModel(tableHD);
        taitthd = true;
    }//GEN-LAST:event_taiTTHDActionPerformed

    private void btnXemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemHDActionPerformed
        // TODO add your handling code here:
        CapNhatTTHD update = new CapNhatTTHD();
        int i = HoaDon.getSelectedRow();
        String mahd = HoaDon.getValueAt(i, 1).toString();
        DefaultTableModel tableCT = qlcthd.getCTTheoHD(mahd);
        update.tableCTHD.setModel(tableCT);
        taittCTHD = true;
        update.setVisible(true);
    }//GEN-LAST:event_btnXemHDActionPerformed

    private void btnThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHDActionPerformed
        // TODO add your handling code here:
        NhapTTHD nhaptthd = new NhapTTHD();
        DefaultComboBoxModel comboModels = qlsp.getListMaSP();
        nhaptthd.maSPComboBox.setModel(comboModels);
        nhaptthd.setVisible(true);
        
    }//GEN-LAST:event_btnThemHDActionPerformed

    private void btnTaiTTCTHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiTTCTHDActionPerformed
        // TODO add your handling code here:
        CTHD.setModel(tableCTHD);
        taittCTHD = true;
    }//GEN-LAST:event_btnTaiTTCTHDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable CTHD;
    public static javax.swing.JTable HoaDon;
    private javax.swing.JButton btnTaiTTCTHD;
    private javax.swing.JButton btnThemHD;
    private javax.swing.JButton btnXemHD;
    private javax.swing.JButton btnXoaHD;
    private javax.swing.JButton capNhatKH;
    private javax.swing.JButton capNhatNV;
    private javax.swing.JButton capNhatSP;
    private javax.swing.JButton dangxuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    static javax.swing.JTable khachHang;
    static javax.swing.JTable nhanVien;
    static javax.swing.JTable sanPham;
    private javax.swing.JButton taiTTHD;
    private javax.swing.JButton taiTTKH;
    private javax.swing.JButton taiTTNV;
    private javax.swing.JButton taiTTSP;
    private javax.swing.JButton themKH;
    private javax.swing.JButton themNV;
    private javax.swing.JButton themSP;
    private javax.swing.JButton xoaKH;
    private javax.swing.JButton xoaNV;
    private javax.swing.JButton xoaSP;
    // End of variables declaration//GEN-END:variables
}
