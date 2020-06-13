package giris;

import java.sql.*;
import javax.swing.*;
import database.DbConnection;
import database.DbVeriMerkezi;
import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import database.transactions.RandevuAl;
import database.transactions.RandevuAl;
import giris.HastaKontrolPanel;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class RandevuGecmisi extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    private RandevuAl randevuAlObject = null;

    public RandevuGecmisi() {
        initComponents();
        Duzenle();
       
    }

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        RandevuGecmisiPanel.setFocusable(true);
    }

    public RandevuAl getRandevuAlObject() {
        if (randevuAlObject == null) {
            randevuAlObject = new RandevuAl();
        }
        return randevuAlObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RandevuGecmisiPanel = new javax.swing.JPanel();
        geriOkLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        randevuTablo = new javax.swing.JTable();
        ListeleButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Randevu Geçmişi");
        setResizable(false);

        RandevuGecmisiPanel.setBackground(new java.awt.Color(0, 153, 153));

        geriOkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/geriOk.png"))); // NOI18N
        geriOkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriOkLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                geriOkLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                geriOkLabelMouseExited(evt);
            }
        });

        randevuTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Klinik", "Doktor", "Title 3", "Title 4"
            }
        ));
        randevuTablo.setBackground(new java.awt.Color(0, 204, 204));
        randevuTablo.setToolTipText("");
        jScrollPane1.setViewportView(randevuTablo);

        ListeleButon.setText("Randevuları Görüntüle");
        ListeleButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ListeleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListeleButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RandevuGecmisiPanelLayout = new javax.swing.GroupLayout(RandevuGecmisiPanel);
        RandevuGecmisiPanel.setLayout(RandevuGecmisiPanelLayout);
        RandevuGecmisiPanelLayout.setHorizontalGroup(
            RandevuGecmisiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RandevuGecmisiPanelLayout.createSequentialGroup()
                .addGroup(RandevuGecmisiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RandevuGecmisiPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RandevuGecmisiPanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(ListeleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        RandevuGecmisiPanelLayout.setVerticalGroup(
            RandevuGecmisiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RandevuGecmisiPanelLayout.createSequentialGroup()
                .addGroup(RandevuGecmisiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RandevuGecmisiPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(geriOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RandevuGecmisiPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
                .addComponent(ListeleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(523, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RandevuGecmisiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RandevuGecmisiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void geriOkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseClicked
        ActionAyarları.setVisible(this, new HastaKontrolPanel());
    }//GEN-LAST:event_geriOkLabelMouseClicked

    private void geriOkLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseEntered
        IconAyarları.IconDegis(geriOkLabel, "geriOk2");
    }//GEN-LAST:event_geriOkLabelMouseEntered

    private void geriOkLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseExited
        IconAyarları.originalIcon(geriOkLabel);
    }//GEN-LAST:event_geriOkLabelMouseExited

    private void ListeleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListeleButonActionPerformed
        Connection con;
        DbConnection dcon = new DbConnection();
        con = dcon.returnConnection();
        String query = "SELECT klinik,doktor_ad_soyad,tarih,saat FROM randevular WHERE hasta_tc_no = '" + getHesapBilgileri().getTcNo() + "'";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(query);
            randevuTablo.setModel(DbUtils.resultSetToTableModel(rs));
            // model = (DefaultTableModel)randevuTablo.getModel(); 
        } catch (SQLException ex) {
            Logger.getLogger(RandevuGecmisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ListeleButonActionPerformed

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
            java.util.logging.Logger.getLogger(RandevuGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandevuGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandevuGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandevuGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandevuGecmisi().setVisible(true);
            }
        });
    }

    public JTable getRandevuTablo() {
        return randevuTablo;
    }

    public void setRandevuTablo(JTable randevuTablo) {
        this.randevuTablo = randevuTablo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListeleButon;
    private javax.swing.JPanel RandevuGecmisiPanel;
    private javax.swing.JLabel geriOkLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable randevuTablo;
    // End of variables declaration//GEN-END:variables
}
