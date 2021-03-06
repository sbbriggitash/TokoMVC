/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;
/**
 *
 * @author Briggita
 */
public class home extends javax.swing.JFrame
{
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
    }
    
    public JTextField getTxtKode(){
        return Kode;
    }
    public JTextField getTxtNama(){
        return Nama;
    }
    public JTextField getTxtHarga(){
        return Harga;
    }
    public JComboBox getCbKategori(){
        return Kategori;
    }
    public JComboBox getCbJenis(){
        return Jenis;
    }
    public JComboBox getCbCariKategori(){
        return CariKategori;
    }
    public JButton getButtonHapus(){
        return Hapus;
    }
    public JButton getButtonBersih(){
        return Bersih;
    }
    public JButton getButtonSimpan(){
        return Simpan;
    }
    public JButton getButtonUbah(){
        return Ubah;
    }
    public JButton getButtonKeluar(){
        return Keluar;
    }
    public JTable getTableData(){
        return Tabel;
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
        Admin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        Kode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jenis = new javax.swing.JComboBox<>();
        Kategori = new javax.swing.JComboBox<>();
        Keluar = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        Bersih = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        CariKategori = new javax.swing.JComboBox<>();
        Cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Admin Toko :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 30));

        jLabel2.setText("Data Barang di Toko");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel3.setText("Kode Barang");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel4.setText("Nama Barang");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        getContentPane().add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 310, 30));
        getContentPane().add(Kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 310, 30));

        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 310, 30));

        jLabel6.setText("Kategori Barang");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setText("Jenis Packaging");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        Jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack" }));
        getContentPane().add(Jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 310, 30));

        Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan" }));
        getContentPane().add(Kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 310, 30));

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 110, -1));

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 110, -1));

        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 110, -1));

        Bersih.setText("Bersihkan");
        Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BersihActionPerformed(evt);
            }
        });
        getContentPane().add(Bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 110, -1));

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 110, -1));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        jScrollPane1.setViewportView(Tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 470, 260));

        jLabel8.setText("Pencarian Berdasarkan Kategori Makanan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        CariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan" }));
        getContentPane().add(CariKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 120, -1));

        Cari.setText("Cari");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });
        getContentPane().add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_SimpanActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_UbahActionPerformed

    private void BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BersihActionPerformed
        // TODO add your handling code here:
        ctoko.Reset();
    }//GEN-LAST:event_BersihActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_HapusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_KeluarActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
        ctoko.CariKategori();
        ctoko.isiTable();
    }//GEN-LAST:event_CariActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Admin;
    private javax.swing.JButton Bersih;
    private javax.swing.JButton Cari;
    private javax.swing.JComboBox<String> CariKategori;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Harga;
    private javax.swing.JComboBox<String> Jenis;
    private javax.swing.JComboBox<String> Kategori;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Kode;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tabel;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
