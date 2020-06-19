/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TR_LDKM;

import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class List_Admin extends javax.swing.JFrame {

    DBConnection konn = new DBConnection();
    Connection koneksi = konn.getConn();
    
    public List_Admin() {
        initComponents();
        Tampil_Data();
        jTSearchUsername.setText("Search/Delete : Username");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBReset = new javax.swing.JButton();
        jBSearch = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();
        jTSearchUsername = new javax.swing.JTextField();
        jBHome = new javax.swing.JButton();
        jBBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListAdmin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(370, 370));
        setMinimumSize(new java.awt.Dimension(370, 370));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Daftar Admin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jBReset.setBackground(new java.awt.Color(255, 255, 255));
        jBReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Refresh.png"))); // NOI18N
        jBReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResetActionPerformed(evt);
            }
        });
        getContentPane().add(jBReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 70, 50));

        jBSearch.setBackground(new java.awt.Color(255, 255, 255));
        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/SearchK.png"))); // NOI18N
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 50, -1));

        jBDelete.setBackground(new java.awt.Color(255, 255, 255));
        jBDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Delete.png"))); // NOI18N
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jBDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 70, 50));

        jTSearchUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTSearchUsername.setText("Search/Delete : Username");
        jTSearchUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSearchUsernameMouseClicked(evt);
            }
        });
        jTSearchUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSearchUsernameActionPerformed(evt);
            }
        });
        jTSearchUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSearchUsernameKeyPressed(evt);
            }
        });
        getContentPane().add(jTSearchUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 230, 30));

        jBHome.setBackground(new java.awt.Color(255, 255, 255));
        jBHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Home.png"))); // NOI18N
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jBHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 50, 40));

        jBBack.setBackground(new java.awt.Color(255, 255, 255));
        jBBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/BackK.png"))); // NOI18N
        jBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 40, 30));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTListAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTListAdmin.setEnabled(false);
        jScrollPane1.setViewportView(jTListAdmin);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 290, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/ListAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResetActionPerformed
        jTSearchUsername.setText("Search/Delete : Username");
        Tampil_Data();
    }//GEN-LAST:event_jBResetActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        if (jTSearchUsername.getText().equals("Search/Delete : Username")){
            JOptionPane.showMessageDialog(null, "Isi Nama Usaha yang di cari", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Statement stat;
                stat = koneksi.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM tb_akun WHERE " + "username ='" + jTSearchUsername.getText() + "'");
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("USERNAME");
                model.addColumn("PASSWORD");
                jTListAdmin.setModel(model);

                if (data.next()) {
                    model.addRow(new Object[]{
                        data.getString("username"),
                        data.getString("password"),
                    });
                    jTListAdmin.setModel(model);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan", "Perhatian", JOptionPane.WARNING_MESSAGE);
                    Tampil_Data();
                }
                stat.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error : " +e, "Search", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteActionPerformed
        if (jTSearchUsername.getText().equals("Search/Delete : Username")){
            JOptionPane.showMessageDialog(null, "Isi Username yang akan di hapus", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                try {
                    Statement stat;
                    stat = koneksi.createStatement();
                    ResultSet data = stat.executeQuery("SELECT * FROM tb_akun WHERE " + "username ='" + jTSearchUsername.getText() + "'");
                    DefaultTableModel model = new DefaultTableModel();
                    model.addColumn("USERNAME");
                    model.addColumn("PASSWORD");
                    jTListAdmin.setModel(model);

                    if (data.next()) {
                        model.addRow(new Object[]{
                            data.getString("username"),
                            data.getString("password"),
                        });
                        jTListAdmin.setModel(model);
                        try {
                            stat.executeUpdate("DELETE FROM tb_akun WHERE username ='" + jTSearchUsername.getText().trim() + "'");
                            JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "Succses", JOptionPane.INFORMATION_MESSAGE);
                            stat.close();
                            jTSearchUsername.setText("Search/Delete : Username");
                            Tampil_Data();
                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error : " +e, "Delete", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Data yang ingin dihapus tidak ada", "Perhatian", JOptionPane.WARNING_MESSAGE);
                        Tampil_Data();
                    }
                    stat.close();
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error : " +e, "Search", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jBDeleteActionPerformed

    private void jTSearchUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSearchUsernameMouseClicked
        jTSearchUsername.setText("");
    }//GEN-LAST:event_jTSearchUsernameMouseClicked

    private void jTSearchUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSearchUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSearchUsernameActionPerformed

    private void jTSearchUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSearchUsernameKeyPressed

    }//GEN-LAST:event_jTSearchUsernameKeyPressed

    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
        Home pindah = new Home();
        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBHomeActionPerformed

    private void jBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackActionPerformed
        Menu_Admin pindah = new Menu_Admin();
        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBBackActionPerformed

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
            java.util.logging.Logger.getLogger(List_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBack;
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBHome;
    private javax.swing.JButton jBReset;
    private javax.swing.JButton jBSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListAdmin;
    private javax.swing.JTextField jTSearchUsername;
    // End of variables declaration//GEN-END:variables
    
    private void Tampil_Data (){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");
        jTListAdmin.setModel(model);

        try {
            java.sql.Statement stat = koneksi.createStatement();
            ResultSet data = stat.executeQuery("SELECT * FROM tb_akun");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("username"),
                    data.getString("password"),
                });
                jTListAdmin.setModel(model);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tampil Data Error : "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        TableColumnModel modelKolom = jTListAdmin.getColumnModel();
        for (int kol = 0; kol < modelKolom.getColumnCount(); kol++) {
            int lebarKolomMax = 0;
            for (int baris = 0; baris < jTListAdmin.getRowCount(); baris++) {
                TableCellRenderer rend = jTListAdmin.getCellRenderer(baris, kol);
                Object nilaiTablel = jTListAdmin.getValueAt(baris, kol);
                Component comp = rend.getTableCellRendererComponent(jTListAdmin, nilaiTablel, false, false, baris, kol);
                lebarKolomMax = Math.max(comp.getPreferredSize().width, lebarKolomMax);
            }
            TableColumn kolom = modelKolom.getColumn(kol);
            kolom.setPreferredWidth(lebarKolomMax);
        }
    }
}