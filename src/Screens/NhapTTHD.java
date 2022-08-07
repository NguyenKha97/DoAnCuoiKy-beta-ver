/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import D02_ThucThi.QuanLyHD;
import javax.swing.JOptionPane;
import java.util.Date;
import D02_ThucThi.QuanLySP;
import D02_ThucThi.QuanLyCTHD;
import java.util.HashMap;

/**
 *
 * @author NEMO
 */
public class NhapTTHD extends javax.swing.JFrame {

    QuanLyHD qlhd = new QuanLyHD();
    QuanLySP qlsp = new QuanLySP();
    QuanLyCTHD qlcthd = new QuanLyCTHD();
    HashMap<String, String> sp_sl = new HashMap<String, String>();
    String hienThiSp_sl = "";
    Double trigia = 0.0;

    /**
     * Creates new form NhapTTHD
     */
    public NhapTTHD() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newMaKH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        newMaNV = new javax.swing.JTextField();
        newTriGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnThemHD = new javax.swing.JButton();
        btnHuyThemHD = new javax.swing.JButton();
        newNgayHD = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        maSPComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        textSL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnTinhTG = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hienThiSPChon = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnThemSP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("THÊM HÓA ĐƠN MỚI");

        jLabel2.setText("Mã Khách Hàng:");

        jLabel3.setText("Mã Nhân Viên:");

        newMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMaNVActionPerformed(evt);
            }
        });

        newTriGia.setEditable(false);
        newTriGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTriGiaActionPerformed(evt);
            }
        });

        jLabel5.setText("Ngày Lập:");

        btnThemHD.setText("Thêm Hóa Đơn");
        btnThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHDActionPerformed(evt);
            }
        });

        btnHuyThemHD.setText("Hủy");
        btnHuyThemHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyThemHDActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã Sản Phẩm:");

        maSPComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Số Lượng:");

        jLabel8.setText("VND");

        btnTinhTG.setText("Tính Trị Giá");
        btnTinhTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTGActionPerformed(evt);
            }
        });

        hienThiSPChon.setEditable(false);
        hienThiSPChon.setColumns(20);
        hienThiSPChon.setRows(5);
        jScrollPane1.setViewportView(hienThiSPChon);

        jLabel4.setText("Danh Sách sản phẩm đã chọn:");

        btnThemSP.setText("Thêm Sản Phẩm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnThemHD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuyThemHD)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(btnTinhTG))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newTriGia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newMaNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(newMaKH, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(newNgayHD, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textSL)
                            .addComponent(maSPComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnThemSP))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(maSPComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(textSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(newNgayHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemSP))
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTinhTG)
                            .addComponent(newTriGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemHD)
                            .addComponent(btnHuyThemHD))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(88, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newTriGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTriGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newTriGiaActionPerformed
    private double tinhTriGia(String masp, String sl) {
        double giaSP = qlsp.getGia(masp);
        System.out.println(giaSP);
        double trigiaTemp = Double.parseDouble(sl) * giaSP;
        return trigiaTemp;
    }
    private void btnThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHDActionPerformed
        // TODO add your handling code here:

        Date ngayMoi = newNgayHD.getDate();
        String maKhMoi = newMaKH.getText();
        String maNvMoi = newMaNV.getText();

        if (trigia == 0.0) {
            JOptionPane.showMessageDialog(null, "Hay tinh tri gia hoa don truoc khi tao!!!");
        } else {
            int newMahd = qlhd.getNewSoHD();
            boolean request1 = qlhd.themHD(newMahd, ngayMoi, maKhMoi, maNvMoi, trigia);

            if (request1) {
                sp_sl.forEach((sp, sl) -> {
                    qlcthd.themCTTD(newMahd, sp, sl);
                });
                Main.tableHD = Main.qlhd.taiTT();
                Main.HoaDon.setModel(Main.tableHD);
                Main.tableCTHD = Main.qlcthd.taiTT();
                Main.CTHD.setModel(Main.tableCTHD);
                JOptionPane.showMessageDialog(null, "Tao thanh cong!!! so hoa don: " + newMahd);
                setVisible(!request1);
                Main.countButtonXoaHD = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Khong thanh cong, vui long kiem tra lai");
            }
        }
    }//GEN-LAST:event_btnThemHDActionPerformed

    private void newMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newMaNVActionPerformed

    private void btnTinhTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTGActionPerformed
        // TODO add your handling code here:       
        sp_sl.forEach((sp, sl) -> {
            trigia += tinhTriGia(sp, sl);
        });
        newTriGia.setText(trigia.toString());
        newTriGia.setVisible(true);
    }//GEN-LAST:event_btnTinhTGActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // TODO add your handling code here:
        String maSp = maSPComboBox.getSelectedItem().toString();
        String soluong = textSL.getText();
        if (maSp.equals("") && soluong.equals("")) {
            JOptionPane.showMessageDialog(null, "Hay nhap day du thong tin ma san pham va so luong!!!");
        } else {
            sp_sl.put(maSp, soluong);
            hienThiSp_sl += maSp + "+" + soluong + ";";
            hienThiSPChon.setText(hienThiSp_sl);
            hienThiSPChon.setVisible(true);
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnHuyThemHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyThemHDActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnHuyThemHDActionPerformed

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
            java.util.logging.Logger.getLogger(NhapTTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapTTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapTTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapTTHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapTTHD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyThemHD;
    private javax.swing.JButton btnThemHD;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnTinhTG;
    public static javax.swing.JTextArea hienThiSPChon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JComboBox<String> maSPComboBox;
    private javax.swing.JTextField newMaKH;
    private javax.swing.JTextField newMaNV;
    private com.toedter.calendar.JDateChooser newNgayHD;
    public static javax.swing.JTextField newTriGia;
    private javax.swing.JTextField textSL;
    // End of variables declaration//GEN-END:variables
}
