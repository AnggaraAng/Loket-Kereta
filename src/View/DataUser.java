/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DataDiri;
import controler.Connector;
import controler.DAODataUser;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.Highlighter;

public class DataUser extends javax.swing.JFrame {

    public DataUser() {
        setUndecorated(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jL_Title = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_namalengkap = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_email = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_no_id = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_no_telp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(28, 38, 45));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DELY ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 200, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Satisfaction is My Wealth");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 72)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DELY EXPRESS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 770));

        jPanel2.setBackground(new java.awt.Color(62, 82, 96));

        jL_Title.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jL_Title.setForeground(new java.awt.Color(255, 255, 255));
        jL_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Title.setText("RESERVASI TIKET");

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MASUKAN DATA DIRI YANG DI PERLUKAN");

        txt_namalengkap.setBackground(new java.awt.Color(62, 82, 96));
        txt_namalengkap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_namalengkap.setForeground(new java.awt.Color(255, 255, 255));
        txt_namalengkap.setText("NAMA ANDA");
        txt_namalengkap.setBorder(null);
        txt_namalengkap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_namalengkapFocusGained(evt);
            }
        });
        txt_namalengkap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_namalengkapMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        txt_email.setBackground(new java.awt.Color(62, 82, 96));
        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(255, 255, 255));
        txt_email.setText("EMAIL");
        txt_email.setBorder(null);
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        txt_no_id.setBackground(new java.awt.Color(62, 82, 96));
        txt_no_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_no_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_no_id.setText("NO IDENTITAS");
        txt_no_id.setBorder(null);
        txt_no_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_no_idFocusGained(evt);
            }
        });
        txt_no_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_idActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        txt_no_telp.setBackground(new java.awt.Color(62, 82, 96));
        txt_no_telp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_no_telp.setForeground(new java.awt.Color(255, 255, 255));
        txt_no_telp.setText("NO TELEPHONE");
        txt_no_telp.setBorder(null);
        txt_no_telp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_no_telpFocusGained(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        txt_alamat.setBackground(new java.awt.Color(62, 82, 96));
        txt_alamat.setColumns(20);
        txt_alamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_alamat.setForeground(new java.awt.Color(255, 255, 255));
        txt_alamat.setRows(5);
        txt_alamat.setText("ALAMAT");
        txt_alamat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        txt_alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_alamatFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txt_alamat);

        jPanel3.setBackground(new java.awt.Color(28, 38, 45));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SELESAI");
        jLabel6.setToolTipText("");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jL_Title)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_no_telp)
                            .addComponent(txt_namalengkap)
                            .addComponent(jSeparator1)
                            .addComponent(txt_email)
                            .addComponent(jSeparator2)
                            .addComponent(txt_no_id)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jL_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(70, 70, 70)
                .addComponent(txt_namalengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txt_no_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txt_no_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 690, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_no_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_idActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        DataDiri data = new DataDiri();

        data.setNo_identitas(txt_no_id.getText());
        data.setNama_user(txt_namalengkap.getText());
        data.setAlamat(txt_alamat.getText());
        data.setNo_hp(txt_no_telp.getText());
        data.setEmail(txt_email.getText());
        try {
            if (new DAODataUser(new Connector().getConn()).insertUser(data)) {
                JOptionPane.showMessageDialog(this, "Silakan Tentukan Tujuan Anda");
                new PencarianJadwal(data).show();
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Silakan Lengkapi Data Diri Anda");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataUser.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered

    }//GEN-LAST:event_jLabel6MouseEntered

    private void txt_namalengkapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_namalengkapFocusGained

    }//GEN-LAST:event_txt_namalengkapFocusGained

    private void txt_namalengkapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_namalengkapMouseClicked
        txt_namalengkap.setText(null);
    }//GEN-LAST:event_txt_namalengkapMouseClicked

    private void txt_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusGained
        txt_email.setText(null);
    }//GEN-LAST:event_txt_emailFocusGained

    private void txt_no_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_no_idFocusGained
        txt_no_id.setText(null);
    }//GEN-LAST:event_txt_no_idFocusGained

    private void txt_no_telpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_no_telpFocusGained
        txt_no_telp.setText(null);
    }//GEN-LAST:event_txt_no_telpFocusGained

    private void txt_alamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_alamatFocusGained
        txt_alamat.setText(null);
    }//GEN-LAST:event_txt_alamatFocusGained

    /**
     * DataDiri data = new DataDiri();
     *
     * data.setNo_identitas(txt_no_id.getText());
     * data.setNama_user(txt_namalengkap.getText());
     * data.setAlamat(txt_alamat.getText());
     * data.setNo_hp(txt_no_telp.getText()); data.setEmail(txt_email.getText());
     * try { if (new DAODataUser(new Connector().getConn()).insertUser(data)) {
     * JOptionPane.showMessageDialog(this, "Silahkan Tentukan Tujuan Anda!!");
     * new PencarianJadwal(data).show(); dispose();
     *
     * } else { JOptionPane.showMessageDialog(this, "Silahkan Lengkapi Data Diri
     * Anda"); } } catch (SQLException ex) {
     * Logger.getLogger(DataUser.class.getName()).log(Level.SEVERE, null, ex);
     * System.out.println(ex); }
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
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataUser().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_namalengkap;
    private javax.swing.JTextField txt_no_id;
    private javax.swing.JTextField txt_no_telp;
    // End of variables declaration//GEN-END:variables
}
