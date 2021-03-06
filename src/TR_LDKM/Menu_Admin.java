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

public class Menu_Admin extends javax.swing.JFrame {

    DBConnection konn = new DBConnection();
    Connection koneksi = konn.getConn();
 
    public Menu_Admin() {
        initComponents();
        Tampil_Data();
        Jumlah();
        jTSearchNIM.setText("Search/Update/Delete : NIM");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGGender = new javax.swing.ButtonGroup();
        jBListAdmin = new javax.swing.JButton();
        jBHome = new javax.swing.JButton();
        jTSearchNIM = new javax.swing.JTextField();
        jBSearch = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();
        jBUpdate = new javax.swing.JButton();
        jBRefresh = new javax.swing.JButton();
        jBDelete = new javax.swing.JButton();
        jTPenyakit = new javax.swing.JTextField();
        jTNoHP = new javax.swing.JTextField();
        rBLelaki = new javax.swing.JRadioButton();
        rBPerempuan = new javax.swing.JRadioButton();
        jTNIM = new javax.swing.JTextField();
        jTNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDaftarPeserta = new javax.swing.JTable();
        jTJmlhPendaftar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(680, 510));
        setMinimumSize(new java.awt.Dimension(680, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(680, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBListAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jBListAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBListAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/AdminK.png"))); // NOI18N
        jBListAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jBListAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 50, 40));

        jBHome.setBackground(new java.awt.Color(255, 255, 255));
        jBHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Home.png"))); // NOI18N
        jBHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHomeActionPerformed(evt);
            }
        });
        getContentPane().add(jBHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 50, 40));

        jTSearchNIM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTSearchNIM.setText("Search/Update/Delete : NIM");
        jTSearchNIM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSearchNIMMouseClicked(evt);
            }
        });
        jTSearchNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSearchNIMActionPerformed(evt);
            }
        });
        jTSearchNIM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTSearchNIMKeyPressed(evt);
            }
        });
        getContentPane().add(jTSearchNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 220, 30));

        jBSearch.setBackground(new java.awt.Color(255, 255, 255));
        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/SearchK.png"))); // NOI18N
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 40, 30));

        jBSave.setBackground(new java.awt.Color(255, 255, 255));
        jBSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Save.png"))); // NOI18N
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jBSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 61, 50));

        jBUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jBUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Edit.png"))); // NOI18N
        jBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jBUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 61, 50));

        jBRefresh.setBackground(new java.awt.Color(255, 255, 255));
        jBRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Refresh.png"))); // NOI18N
        jBRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(jBRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 61, 50));

        jBDelete.setBackground(new java.awt.Color(255, 255, 255));
        jBDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Delete.png"))); // NOI18N
        jBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jBDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 61, 50));
        getContentPane().add(jTPenyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, -1));
        getContentPane().add(jTNoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 170, -1));

        bGGender.add(rBLelaki);
        rBLelaki.setForeground(new java.awt.Color(255, 255, 255));
        rBLelaki.setText("Laki - Laki");
        rBLelaki.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rBLelakiItemStateChanged(evt);
            }
        });
        rBLelaki.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                rBLelakiComponentHidden(evt);
            }
        });
        getContentPane().add(rBLelaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 81, 30));

        bGGender.add(rBPerempuan);
        rBPerempuan.setForeground(new java.awt.Color(255, 255, 255));
        rBPerempuan.setText("Perempuan");
        rBPerempuan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rBPerempuanItemStateChanged(evt);
            }
        });
        rBPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBPerempuanActionPerformed(evt);
            }
        });
        getContentPane().add(rBPerempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, 30));
        getContentPane().add(jTNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, -1));
        getContentPane().add(jTNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 170, -1));

        jTDaftarPeserta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "No.Telp", "Penyakit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTDaftarPeserta.setEnabled(false);
        jScrollPane1.setViewportView(jTDaftarPeserta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 580, 210));

        jTJmlhPendaftar.setEditable(false);
        jTJmlhPendaftar.setBackground(new java.awt.Color(255, 255, 255));
        jTJmlhPendaftar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTJmlhPendaftar.setForeground(new java.awt.Color(255, 0, 0));
        jTJmlhPendaftar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTJmlhPendaftar.setText("999 Peserta");
        jTJmlhPendaftar.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jTJmlhPendaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTJmlhPendaftarActionPerformed(evt);
            }
        });
        getContentPane().add(jTJmlhPendaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 75, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NIM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 75, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. HP");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 75, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Penyakit");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 75, 10));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Peserta LDKM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 32, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/MenuAdmin.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rBPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPerempuanActionPerformed

    private void rBPerempuanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rBPerempuanItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rBPerempuanItemStateChanged

    private void rBLelakiComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_rBLelakiComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_rBLelakiComponentHidden

    private void rBLelakiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rBLelakiItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rBLelakiItemStateChanged

    private void jBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteActionPerformed
        if (jTSearchNIM.getText().equals("Search/Update/Delete : NIM")){
            JOptionPane.showMessageDialog(null, "Isi Kolom Search : NIM", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                try {
                    Statement stat;
                    stat = koneksi.createStatement();
                    ResultSet data = stat.executeQuery("SELECT * FROM tb_peserta WHERE " + "NIM ='" + jTSearchNIM.getText() + "'");
                    DefaultTableModel model = new DefaultTableModel();
                    model.addColumn("Nama");
                    model.addColumn("NIM");
                    model.addColumn("Jenis Kelamin");
                    model.addColumn("No.Telp");
                    model.addColumn("Penyakit");
                    jTDaftarPeserta.setModel(model);
                    if (data.next()) {
                        model.addRow(new Object[]{
                            data.getString("NIM"),
                            data.getString("nama"),
                            data.getString("jenis_kelamin"),
                            data.getString("No_hp"),
                            data.getString("penyakit"),
                        });
                        jTDaftarPeserta.setModel(model);
                        try {
                            stat = koneksi.createStatement();
                            stat.executeUpdate("DELETE FROM tb_peserta WHERE NIM ='" + jTSearchNIM.getText() + "'");
                            JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                            stat.close();
                            Tampil_Data();
                            ClearData();
                            jTSearchNIM.setText("Search/Update/Delete : NIM");
                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error : " +e, "Delete", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Data yang ingin dihapus tidak ada", "Perhatian", JOptionPane.WARNING_MESSAGE);
                        Tampil_Data();
                        jTSearchNIM.setText("Search/Update/Delete : NIM");
                    }
                    stat.close();
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error : " +e, "Search Delete", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        Jumlah();
    }//GEN-LAST:event_jBDeleteActionPerformed

    private void jBRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefreshActionPerformed
        Tampil_Data();
        ClearData();
        jTSearchNIM.setText("Search/Update/Delete : NIM");
    }//GEN-LAST:event_jBRefreshActionPerformed

    private void jBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateActionPerformed
        String JK = null;
        if (rBLelaki.isSelected()) {
            JK = "Laki-Laki";
        } if (rBPerempuan.isSelected()) {
            JK = "Perempuan";
        }

        if (jTSearchNIM.getText().equals("Search/Update/Delete : NIM")){
            JOptionPane.showMessageDialog(null, "Isi Kolom Search : NIM", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else if (jTNama.getText().trim().equals("")
            || jTNIM.getText().trim().equals("")
            || JK == null
            || jTNoHP.getText().trim().equals("")
            || jTPenyakit.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Data Belum Lengkap!", "UPDATE", JOptionPane.WARNING_MESSAGE);
            jTSearchNIM.requestFocus();
        } else {
            int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin mengubah data ini?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION); 
            if (ok == 0) {
                String update = "UPDATE tb_peserta SET nama ='" + jTNama.getText()
                + "',jenis_kelamin ='" + JK
                + "',No_hp ='" + jTNoHP.getText()
                + "',Penyakit ='" + jTPenyakit.getText()
                + "' where NIM ='" + jTNIM.getText() + "'";
                try {
                    Statement stat;
                    stat = koneksi.createStatement();
                    stat.executeUpdate(update);
                    JOptionPane.showMessageDialog(null, "Data Berhasil di Update", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
                    stat.close();
                    Tampil_Data();
                    ClearData();
                    jTSearchNIM.setText("Search/Update/Delete : NIM");
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error : " +e, "Update", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                Tampil_Data();
            }
        }
        Jumlah();
    }//GEN-LAST:event_jBUpdateActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        String JK = null;
        if (rBLelaki.isSelected()) {
            JK = "Laki-Laki";
        } if (rBPerempuan.isSelected()) {
            JK = "Perempuan";
        }

        if (jTNama.getText().trim().equals("")
            || jTNIM.getText().trim().equals("")
            || JK == null
            || jTNoHP.getText().trim().equals("")
            || jTPenyakit.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Data Tidak Lengkap", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Statement Stat;
                Stat = koneksi.createStatement();
                ResultSet data = Stat.executeQuery("SELECT * FROM tb_peserta WHERE NIM ='" + jTNIM.getText() + "'");
                if (data.next()) {
                    JOptionPane.showMessageDialog(null, "NIM Sudah Terdaftar", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
                    jTNIM.requestFocus();
                } else {
                    String sql = "INSERT INTO tb_peserta VALUES('" + jTNIM.getText() + "'"
                    + ",'" + jTNama.getText() + "'"
                    + ",'" + JK + "'"
                    + ",'" + jTNoHP.getText()+ "'"
                    + ",'" + jTPenyakit.getText() + "')";
                    Stat.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Di Simpan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                    Tampil_Data();
                    ClearData();
                }
                Stat.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error : " +e, "Save", JOptionPane.WARNING_MESSAGE);
            }
        }
        Jumlah();
    }//GEN-LAST:event_jBSaveActionPerformed

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        if (jTSearchNIM.getText().equals("Search/Update/Delete : NIM")){
            JOptionPane.showMessageDialog(null, "Isi Kolom Search : NIM", "PERHATIAN", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Statement stat;
                stat = koneksi.createStatement();
                ResultSet data = stat.executeQuery("SELECT * FROM tb_peserta WHERE " + "NIM ='" + jTSearchNIM.getText() + "'");
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Nama");
                model.addColumn("NIM");
                model.addColumn("Jenis Kelamin");
                model.addColumn("No.Telp");
                model.addColumn("Penyakit");
                jTDaftarPeserta.setModel(model);
                if (data.next()) {
                    model.addRow(new Object[]{
                        data.getString("NIM"),
                        data.getString("nama"),
                        data.getString("jenis_kelamin"),
                        data.getString("No_hp"),
                        data.getString("penyakit"),
                    });
                    jTDaftarPeserta.setModel(model);
                    jTNIM.setText(data.getString("NIM"));
                    jTNama.setText(data.getString("nama"));
                    jTNoHP.setText(data.getString("No_hp"));
                    jTPenyakit.setText(data.getString("penyakit"));
                    if (data.getString("jenis_kelamin").equals("Laki-Laki")){
                            rBLelaki.setSelected(true);
                    } if (data.getString("jenis_kelamin").equals("Perempuan")){
                        rBPerempuan.setSelected(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan", "Perhatian", JOptionPane.WARNING_MESSAGE);
                    Tampil_Data();
                    jTSearchNIM.setText("Search/Update/Delete : NIM");
                }
                stat.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error : " +e, "Search", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBSearchActionPerformed

    private void jTSearchNIMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTSearchNIMKeyPressed

    }//GEN-LAST:event_jTSearchNIMKeyPressed

    private void jTSearchNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSearchNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSearchNIMActionPerformed

    private void jTSearchNIMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSearchNIMMouseClicked
        jTSearchNIM.setText("");
    }//GEN-LAST:event_jTSearchNIMMouseClicked

    private void jBHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHomeActionPerformed
        Home pindah = new Home();
        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBHomeActionPerformed

    private void jBListAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListAdminActionPerformed
        List_Admin pindah = new List_Admin();
        pindah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBListAdminActionPerformed

    private void jTJmlhPendaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTJmlhPendaftarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTJmlhPendaftarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGGender;
    private javax.swing.JButton jBDelete;
    private javax.swing.JButton jBHome;
    private javax.swing.JButton jBListAdmin;
    private javax.swing.JButton jBRefresh;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTDaftarPeserta;
    private javax.swing.JTextField jTJmlhPendaftar;
    public javax.swing.JTextField jTNIM;
    public javax.swing.JTextField jTNama;
    public javax.swing.JTextField jTNoHP;
    public javax.swing.JTextField jTPenyakit;
    private javax.swing.JTextField jTSearchNIM;
    public javax.swing.JRadioButton rBLelaki;
    public javax.swing.JRadioButton rBPerempuan;
    // End of variables declaration//GEN-END:variables
   
    private void ClearData(){
        jTNama.setText("");
        jTNIM.setText("");
        jTNoHP.setText("");
        jTPenyakit.setText("");
        bGGender.clearSelection();
    }
    
    private void Jumlah() {
        Daftar_Peserta daf = new Daftar_Peserta();
        int jmlh = daf.jTDaftarPeserta.getRowCount();
        jTJmlhPendaftar.setText(""+jmlh+" Peserta");
    }
    
    private void Tampil_Data(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("NIM");
            model.addColumn("Nama");
            model.addColumn("Jenis Kelamin");
            model.addColumn("No.Telp");
            model.addColumn("Penyakit");
        jTDaftarPeserta.setModel(model);
        try {
            Statement stat = koneksi.createStatement();
            ResultSet data = stat.executeQuery("SELECT * FROM tb_peserta");
            while (data.next()) {
                model.addRow(new Object[]{
                    data.getString("NIM"),
                    data.getString("nama"),
                    data.getString("jenis_kelamin"),
                    data.getString("No_hp"),
                    data.getString("penyakit")
                });
                jTDaftarPeserta.setModel(model);
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error : " +e, "Tampil Data", JOptionPane.WARNING_MESSAGE);
        }        
        TableColumnModel modelKolom = jTDaftarPeserta.getColumnModel();
        for (int kol = 0; kol < modelKolom.getColumnCount(); kol++) {
            int lebarKolomMax = 0;
            for (int baris = 0; baris < jTDaftarPeserta.getRowCount(); baris++) {
                TableCellRenderer rend = jTDaftarPeserta.getCellRenderer(baris, kol);
                Object nilaiTablel = jTDaftarPeserta.getValueAt(baris, kol);
                Component comp = rend.getTableCellRendererComponent(jTDaftarPeserta, nilaiTablel, false, false, baris, kol);
                lebarKolomMax = Math.max(comp.getPreferredSize().width, lebarKolomMax);
            }
            TableColumn kolom = modelKolom.getColumn(kol);
            kolom.setPreferredWidth(lebarKolomMax);
        }
    }
}
