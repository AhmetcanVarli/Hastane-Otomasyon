package giris;

import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.butonAyar;
import java.awt.Color;

public class DoktorKontrolPaneli extends javax.swing.JFrame implements IDuzenleyici,IBilgiKontrol{

    
    public DoktorKontrolPaneli() {
        initComponents();
        Duzenle();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoktorKontrolPaneli = new javax.swing.JPanel();
        HastalarLabel = new javax.swing.JLabel();
        RandevuLabel = new javax.swing.JLabel();
        ReceteYazLabel = new javax.swing.JLabel();
        ReceteGoruntuleLabel = new javax.swing.JLabel();
        CıkısLabel = new javax.swing.JLabel();
        DoktorAyarLabel = new javax.swing.JLabel();
        HastalarButon = new javax.swing.JButton();
        RandevularButon = new javax.swing.JButton();
        ReceteYazButon = new javax.swing.JButton();
        ReceteGoruntuleButon = new javax.swing.JButton();
        HosgeldinLabel = new javax.swing.JLabel();
        DoktorAdSoyadLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doktor Kontrol Paneli");
        setResizable(false);

        DoktorKontrolPaneli.setBackground(new java.awt.Color(0, 153, 153));

        HastalarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/Hastalar.png"))); // NOI18N

        RandevuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/DoktorRandevu.png"))); // NOI18N

        ReceteYazLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/ReçeteYaz.png"))); // NOI18N

        ReceteGoruntuleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/ReçeteGörüntüle.png"))); // NOI18N

        CıkısLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/Cıkıs.png"))); // NOI18N
        CıkısLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CıkısLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CıkısLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CıkısLabelMouseExited(evt);
            }
        });

        DoktorAyarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/DoktorAyar.png"))); // NOI18N
        DoktorAyarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoktorAyarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoktorAyarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoktorAyarLabelMouseExited(evt);
            }
        });

        HastalarButon.setText("HASTALAR");
        HastalarButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HastalarButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HastalarButonMouseExited(evt);
            }
        });
        HastalarButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastalarButonActionPerformed(evt);
            }
        });

        RandevularButon.setText("RANDEVULAR");
        RandevularButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RandevularButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RandevularButonMouseExited(evt);
            }
        });
        RandevularButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandevularButonActionPerformed(evt);
            }
        });

        ReceteYazButon.setText("REÇETE YAZ");
        ReceteYazButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReceteYazButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReceteYazButonMouseExited(evt);
            }
        });
        ReceteYazButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceteYazButonActionPerformed(evt);
            }
        });

        ReceteGoruntuleButon.setText("REÇETE GÖRÜNTÜLE");
        ReceteGoruntuleButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReceteGoruntuleButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReceteGoruntuleButonMouseExited(evt);
            }
        });
        ReceteGoruntuleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceteGoruntuleButonActionPerformed(evt);
            }
        });

        HosgeldinLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HosgeldinLabel.setForeground(new java.awt.Color(0, 204, 204));
        HosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HosgeldinLabel.setText("HOŞGELDİN");

        DoktorAdSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        DoktorAdSoyadLabel.setForeground(new java.awt.Color(0, 204, 204));
        DoktorAdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoktorAdSoyadLabel.setText("[DOKTOR ADI SOYADI]");

        javax.swing.GroupLayout DoktorKontrolPaneliLayout = new javax.swing.GroupLayout(DoktorKontrolPaneli);
        DoktorKontrolPaneli.setLayout(DoktorKontrolPaneliLayout);
        DoktorKontrolPaneliLayout.setHorizontalGroup(
            DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                .addGroup(DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                        .addComponent(CıkısLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(HosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(DoktorAyarLabel))
                    .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DoktorAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HastalarButon, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HastalarLabel))
                        .addGap(61, 61, 61)
                        .addGroup(DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(RandevuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RandevularButon, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                                .addComponent(ReceteYazLabel)
                                .addGap(69, 69, 69)
                                .addComponent(ReceteGoruntuleLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoktorKontrolPaneliLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ReceteYazButon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(ReceteGoruntuleButon)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        DoktorKontrolPaneliLayout.setVerticalGroup(
            DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                .addGroup(DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CıkısLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(HosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DoktorAyarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DoktorKontrolPaneliLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(DoktorAdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastalarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RandevuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceteYazLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReceteGoruntuleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DoktorKontrolPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HastalarButon)
                    .addComponent(RandevularButon)
                    .addComponent(ReceteYazButon)
                    .addComponent(ReceteGoruntuleButon))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoktorKontrolPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoktorKontrolPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        DoktorKontrolPaneli.setFocusable(true);
        this.DoktorAdSoyadLabel.setText(getHesapBilgileri().getDoktorAd()+ " " + getHesapBilgileri().getDoktorSoyad());
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    
    
    private void HastalarButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastalarButonMouseEntered
        butonAyar.setBgFg(HastalarButon, Color.black, Color.yellow);
        IconAyarları.IconDegis(HastalarLabel, "Hastalar2");
    }//GEN-LAST:event_HastalarButonMouseEntered

    private void HastalarButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastalarButonMouseExited
        butonAyar.setOriginalBgFg(HastalarButon);
        IconAyarları.originalIcon(HastalarLabel);
    }//GEN-LAST:event_HastalarButonMouseExited

    private void RandevularButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandevularButonMouseEntered
        butonAyar.setBgFg(RandevularButon, Color.black, Color.yellow);
        IconAyarları.IconDegis(RandevuLabel, "DoktorRandevu2");
    }//GEN-LAST:event_RandevularButonMouseEntered

    private void RandevularButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandevularButonMouseExited
        butonAyar.setOriginalBgFg(RandevularButon);
        IconAyarları.originalIcon(RandevuLabel);
    }//GEN-LAST:event_RandevularButonMouseExited

    private void ReceteYazButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceteYazButonMouseEntered
        butonAyar.setBgFg(ReceteYazButon, Color.black, Color.yellow);
        IconAyarları.IconDegis(ReceteYazLabel, "ReçeteYaz2");
    }//GEN-LAST:event_ReceteYazButonMouseEntered

    private void ReceteYazButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceteYazButonMouseExited
        butonAyar.setOriginalBgFg(ReceteYazButon);
        IconAyarları.originalIcon(ReceteYazLabel);
    }//GEN-LAST:event_ReceteYazButonMouseExited

    private void ReceteGoruntuleButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceteGoruntuleButonMouseEntered
        butonAyar.setBgFg(ReceteGoruntuleButon, Color.black, Color.yellow);
        IconAyarları.IconDegis(ReceteGoruntuleLabel, "ReçeteGörüntüle2");
    }//GEN-LAST:event_ReceteGoruntuleButonMouseEntered

    private void ReceteGoruntuleButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceteGoruntuleButonMouseExited
        butonAyar.setOriginalBgFg(ReceteGoruntuleButon);
        IconAyarları.originalIcon(ReceteGoruntuleLabel);
    }//GEN-LAST:event_ReceteGoruntuleButonMouseExited

    private void CıkısLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CıkısLabelMouseClicked
        ActionAyarları.setVisible(this, new girisekran());
    }//GEN-LAST:event_CıkısLabelMouseClicked

    private void CıkısLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CıkısLabelMouseEntered
        IconAyarları.IconDegis(CıkısLabel, "Cıkıs2");
    }//GEN-LAST:event_CıkısLabelMouseEntered

    private void CıkısLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CıkısLabelMouseExited
        IconAyarları.originalIcon(CıkısLabel);
    }//GEN-LAST:event_CıkısLabelMouseExited

    private void DoktorAyarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorAyarLabelMouseClicked
        ActionAyarları.setVisible(this, new DoktorAyarlari());
    }//GEN-LAST:event_DoktorAyarLabelMouseClicked

    private void DoktorAyarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorAyarLabelMouseEntered
        IconAyarları.IconDegis(DoktorAyarLabel, "DoktorAyar2");
    }//GEN-LAST:event_DoktorAyarLabelMouseEntered

    private void DoktorAyarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorAyarLabelMouseExited
        IconAyarları.originalIcon(DoktorAyarLabel);
    }//GEN-LAST:event_DoktorAyarLabelMouseExited

    private void HastalarButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastalarButonActionPerformed
        new HastalarimEkrani().setVisible(true);
    }//GEN-LAST:event_HastalarButonActionPerformed

    private void RandevularButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandevularButonActionPerformed
        new Randevular().setVisible(true);
    }//GEN-LAST:event_RandevularButonActionPerformed

    private void ReceteYazButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceteYazButonActionPerformed
        new ReceteYazEkran().setVisible(true);
    }//GEN-LAST:event_ReceteYazButonActionPerformed

    private void ReceteGoruntuleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceteGoruntuleButonActionPerformed
        new ReceteGecmisiEkranı().setVisible(true);
    }//GEN-LAST:event_ReceteGoruntuleButonActionPerformed

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
            java.util.logging.Logger.getLogger(DoktorKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorKontrolPaneli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CıkısLabel;
    private javax.swing.JLabel DoktorAdSoyadLabel;
    private javax.swing.JLabel DoktorAyarLabel;
    private javax.swing.JPanel DoktorKontrolPaneli;
    private javax.swing.JButton HastalarButon;
    private javax.swing.JLabel HastalarLabel;
    private javax.swing.JLabel HosgeldinLabel;
    private javax.swing.JLabel RandevuLabel;
    private javax.swing.JButton RandevularButon;
    private javax.swing.JButton ReceteGoruntuleButon;
    private javax.swing.JLabel ReceteGoruntuleLabel;
    private javax.swing.JButton ReceteYazButon;
    private javax.swing.JLabel ReceteYazLabel;
    // End of variables declaration//GEN-END:variables
}
