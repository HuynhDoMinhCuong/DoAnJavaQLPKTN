/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HuongDanSuDung;

import javax.swing.JOptionPane;

/**
 *
 * @author Huỳnh Cường
 */

public class FrmHuongDanSuDung extends javax.swing.JFrame {

    /**
     * Creates new form FrmHuongDanSuDung
     */
    public FrmHuongDanSuDung() {
        initComponents();
        setLocationRelativeTo(null); // Đưa form ra giữa màn hình khi run 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHuongDanSuDung = new javax.swing.JLabel();
        lbHDSD1 = new javax.swing.JLabel();
        lbHDSD2 = new javax.swing.JLabel();
        lbHDSD3 = new javax.swing.JLabel();
        lbHDSD4 = new javax.swing.JLabel();
        lbHDSD5 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HUONG DAN SU DUNG");
        setResizable(false);

        lbHuongDanSuDung.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbHuongDanSuDung.setForeground(new java.awt.Color(255, 0, 0));
        lbHuongDanSuDung.setText("HƯỚNG DẪN SỬ DỤNG");

        lbHDSD1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHDSD1.setForeground(new java.awt.Color(0, 0, 255));
        lbHDSD1.setText("1/ Người dùng cần thực hiện trước các chức năng là thêm thông tin danh sách các bác sĩ, phòng khám, loại thuốc, bệnh nhân.");

        lbHDSD2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHDSD2.setForeground(new java.awt.Color(0, 0, 255));
        lbHDSD2.setText("2/ Muốn thêm thông tin 1 phiếu khám bệnh mới trước hết cần phải có thông tin danh sách bác sĩ, phòng khám, bệnh nhân.");

        lbHDSD3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHDSD3.setForeground(new java.awt.Color(0, 0, 255));
        lbHDSD3.setText("3/ Muốn thêm thông tin 1 kê đơn thuốc mới trước hết cần phải có thông tin phiếu khám bệnh và thông tin loại thuốc.  ");

        lbHDSD4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHDSD4.setForeground(new java.awt.Color(0, 0, 255));
        lbHDSD4.setText("4/ Người dùng được phép thực hiện các chức năng thêm, xoá, sửa, tìm kiếm, xuất ra excel.");

        lbHDSD5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHDSD5.setForeground(new java.awt.Color(0, 0, 255));
        lbHDSD5.setText("5/ Xem thông tin tác giả để liên hệ sớm nhất nếu có xảy ra sự cố phần mềm.");

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1118, 1118, 1118)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(lbHuongDanSuDung))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHDSD1)
                            .addComponent(lbHDSD2)
                            .addComponent(lbHDSD4)
                            .addComponent(lbHDSD5)
                            .addComponent(lbHDSD3))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbHuongDanSuDung)
                .addGap(38, 38, 38)
                .addComponent(lbHDSD1)
                .addGap(27, 27, 27)
                .addComponent(lbHDSD2)
                .addGap(27, 27, 27)
                .addComponent(lbHDSD3)
                .addGap(29, 29, 29)
                .addComponent(lbHDSD4)
                .addGap(33, 33, 33)
                .addComponent(lbHDSD5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát ?", "Thông báo",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
        dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHuongDanSuDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHuongDanSuDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHuongDanSuDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHuongDanSuDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHuongDanSuDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel lbHDSD1;
    private javax.swing.JLabel lbHDSD2;
    private javax.swing.JLabel lbHDSD3;
    private javax.swing.JLabel lbHDSD4;
    private javax.swing.JLabel lbHDSD5;
    private javax.swing.JLabel lbHuongDanSuDung;
    // End of variables declaration//GEN-END:variables
}
