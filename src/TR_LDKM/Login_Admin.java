/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TR_LDKM;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login_Admin extends javax.swing.JFrame {
    DBConnection konn = new DBConnection();
    Connection koneksi = konn.getConn();
    
    public Login_Admin() {
        initComponents();
        jTUsername.setText("username");
        jPPassword.setText("password");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTUsername = new javax.swing.JTextField();
        jPPassword = new javax.swing.JPasswordField();
        jBBuatAkun = new javax.swing.JButton();
        jBLogin = new javax.swing.JButton();
        jBBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(228, 241, 254));
        setMaximumSize(new java.awt.Dimension(290, 270));
        setMinimumSize(new java.awt.Dimension(290, 270));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTUsername.setText("username");
        jTUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsernameMouseClicked(evt);
            }
        });
        jTUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTUsernameActionPerformed(evt);
            }
        });
        jTUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTUsernameKeyPressed(evt);
            }
        });
        getContentPane().add(jTUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, 30));

        jPPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPPassword.setText("password");
        jPPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPPasswordMouseClicked(evt);
            }
        });
        jPPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 30));

        jBBuatAkun.setBackground(new java.awt.Color(255, 255, 255));
        jBBuatAkun.setText("Buat Akun");
        jBBuatAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuatAkunActionPerformed(evt);
            }
        });
        getContentPane().add(jBBuatAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        jBLogin.setBackground(new java.awt.Color(255, 255, 255));
        jBLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Login.png"))); // NOI18N
        jBLogin.setText(" Login");
        jBLogin.setAutoscrolls(true);
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 90, 30));

        jBBack.setBackground(new java.awt.Color(255, 255, 255));
        jBBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/BackK.png"))); // NOI18N
        jBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 50, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/LoginAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPPasswordActionPerformed

    private void jBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackActionPerformed
        Home pindah = new Home();
        pindah.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jBBackActionPerformed

    private void jTUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsernameActionPerformed

    private void jBBuatAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuatAkunActionPerformed
        Buat_Akun pindah = new Buat_Akun();
        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBBuatAkunActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        if (jTUsername.getText().trim().equals("")||jPPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Isi ID dan Password!", "LOGIN", JOptionPane.WARNING_MESSAGE);
        } else {                
            try {
                java.sql.Statement stat;
                stat = koneksi.createStatement();
                ResultSet rs = stat.executeQuery("SELECT * FROM tb_akun WHERE username='" + jTUsername.getText() + "' AND password='"+jPPassword.getText()+"'");
                if (rs.next()){
                    if (jTUsername.getText().equals(rs.getString("username"))&&jPPassword.getText().equals(rs.getString("password"))){
                        JOptionPane.showMessageDialog(null, "Login Berhasil \nWELCOME : " +jTUsername.getText().toUpperCase(), "LOGIN", JOptionPane.INFORMATION_MESSAGE);
                        Menu_Admin pindah = new Menu_Admin();
                        pindah.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Username/Password Salah", "LOGIN", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username/Password Salah", "LOGIN", JOptionPane.WARNING_MESSAGE);
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error : " +e, "Login Admin", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_jBLoginActionPerformed

    private void jTUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTUsernameMouseClicked
        jTUsername.setText("");
    }//GEN-LAST:event_jTUsernameMouseClicked

    private void jPPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPPasswordMouseClicked
        jPPassword.setText("");
    }//GEN-LAST:event_jPPasswordMouseClicked

    private void jTUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTUsernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTUsernameKeyPressed

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
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBack;
    private javax.swing.JButton jBBuatAkun;
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPPassword;
    private javax.swing.JTextField jTUsername;
    // End of variables declaration//GEN-END:variables
}