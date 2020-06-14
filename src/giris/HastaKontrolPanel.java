package giris;

import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.butonAyar;
import java.awt.Color;
import java.util.Locale;


public class HastaKontrolPanel extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol{

    
    public HastaKontrolPanel() {
        initComponents();
        Duzenle();
    }
    
    
    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        HastaKonrtolPanelP.setFocusable(true);
        this.KullanıcıAdıSoyadıLabel.setText(getHesapBilgileri().getAd() + " " + getHesapBilgileri().getSoyad());
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

        HastaKonrtolPanelP = new javax.swing.JPanel();
        HosgeldinLabel = new javax.swing.JLabel();
        KullanıcıAdıSoyadıLabel = new javax.swing.JLabel();
        RandevuAlLabel = new javax.swing.JLabel();
        RandevuAlButon = new javax.swing.JButton();
        RandevuGecmisiButon = new javax.swing.JButton();
        RandevUGecmisiLabel = new javax.swing.JLabel();
        CıkısLabel = new javax.swing.JLabel();
        KullanıcıAyarlarıLabel = new javax.swing.JLabel();
        ReceteLabel = new javax.swing.JLabel();
        ReceteButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasta Kontol Paneli");
        setResizable(false);

        HastaKonrtolPanelP.setBackground(new java.awt.Color(102, 102, 102));

        HosgeldinLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HosgeldinLabel.setForeground(new java.awt.Color(0, 204, 204));
        HosgeldinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HosgeldinLabel.setText("HOŞGELDİN");

        KullanıcıAdıSoyadıLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        KullanıcıAdıSoyadıLabel.setForeground(new java.awt.Color(0, 204, 204));
        KullanıcıAdıSoyadıLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KullanıcıAdıSoyadıLabel.setText("[KULLANICI ADI SOYADI]");

        RandevuAlLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/RandevuAl.png"))); // NOI18N

        RandevuAlButon.setBackground(new java.awt.Color(0, 204, 255));
        RandevuAlButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RandevuAlButon.setText("RANDEVU AL");
        RandevuAlButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RandevuAlButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RandevuAlButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RandevuAlButonMouseExited(evt);
            }
        });
        RandevuAlButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandevuAlButonActionPerformed(evt);
            }
        });

        RandevuGecmisiButon.setBackground(new java.awt.Color(0, 204, 255));
        RandevuGecmisiButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RandevuGecmisiButon.setText("RANDEVU GEÇMİŞİ");
        RandevuGecmisiButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RandevuGecmisiButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RandevuGecmisiButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RandevuGecmisiButonMouseExited(evt);
            }
        });
        RandevuGecmisiButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandevuGecmisiButonActionPerformed(evt);
            }
        });

        RandevUGecmisiLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/RandevuGecmisi.png"))); // NOI18N

        CıkısLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/Cıkıs.png"))); // NOI18N
        CıkısLabel.setText("jLabel1");
        CıkısLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        KullanıcıAyarlarıLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/KullanıcıAyarları.png"))); // NOI18N
        KullanıcıAyarlarıLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KullanıcıAyarlarıLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KullanıcıAyarlarıLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KullanıcıAyarlarıLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KullanıcıAyarlarıLabelMouseExited(evt);
            }
        });

        ReceteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/Reçete.png"))); // NOI18N

        ReceteButon.setBackground(new java.awt.Color(0, 204, 255));
        ReceteButon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReceteButon.setText("REÇETELERİM");
        ReceteButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReceteButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReceteButonMouseExited(evt);
            }
        });
        ReceteButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceteButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HastaKonrtolPanelPLayout = new javax.swing.GroupLayout(HastaKonrtolPanelP);
        HastaKonrtolPanelP.setLayout(HastaKonrtolPanelPLayout);
        HastaKonrtolPanelPLayout.setHorizontalGroup(
            HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(HosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(KullanıcıAyarlarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CıkısLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KullanıcıAdıSoyadıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(RandevuAlLabel)
                        .addGap(105, 105, 105)
                        .addComponent(RandevUGecmisiLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReceteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addComponent(RandevuAlButon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(RandevuGecmisiButon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReceteButon, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        HastaKonrtolPanelPLayout.setVerticalGroup(
            HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(HosgeldinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(KullanıcıAyarlarıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CıkısLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(KullanıcıAdıSoyadıLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RandevuAlLabel)
                    .addComponent(RandevUGecmisiLabel)
                    .addComponent(ReceteLabel))
                .addGroup(HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(HastaKonrtolPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RandevuAlButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RandevuGecmisiButon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HastaKonrtolPanelPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ReceteButon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HastaKonrtolPanelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HastaKonrtolPanelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Buton Renklendirme icon değişimi
    private void RandevuAlButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandevuAlButonMouseEntered
        butonAyar.setBgFg(RandevuAlButon, Color.black, Color.yellow);
        IconAyarları.IconDegis(RandevuAlLabel, "RandevuAl2");
    }//GEN-LAST:event_RandevuAlButonMouseEntered

    private void RandevuAlButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandevuAlButonMouseExited
        butonAyar.setOriginalBgFg(RandevuAlButon);
        IconAyarları.originalIcon(RandevuAlLabel);
    }//GEN-LAST:event_RandevuAlButonMouseExited

    private void RandevuGecmisiButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandevuGecmisiButonMouseEntered
        butonAyar.setBgFg(RandevuGecmisiButon, Color.black, Color.yellow);
        IconAyarları.IconDegis(RandevUGecmisiLabel, "RandevuGecmisi2");
    }//GEN-LAST:event_RandevuGecmisiButonMouseEntered

    private void RandevuGecmisiButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandevuGecmisiButonMouseExited
        butonAyar.setOriginalBgFg(RandevuGecmisiButon);
        IconAyarları.originalIcon(RandevUGecmisiLabel);
    }//GEN-LAST:event_RandevuGecmisiButonMouseExited

    private void RandevuAlButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandevuAlButonActionPerformed
        ActionAyarları.setVisible(this, new RandevuAlEkranı());
    }//GEN-LAST:event_RandevuAlButonActionPerformed

    private void RandevuGecmisiButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandevuGecmisiButonActionPerformed
        ActionAyarları.setVisible(this, new RandevuGecmisi());
    }//GEN-LAST:event_RandevuGecmisiButonActionPerformed

    private void CıkısLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CıkısLabelMouseClicked
        ActionAyarları.setVisible(this, new girisekran());
    }//GEN-LAST:event_CıkısLabelMouseClicked

    private void KullanıcıAyarlarıLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KullanıcıAyarlarıLabelMouseClicked
        ActionAyarları.setVisible(this, new KullanıcıAyarları());
    }//GEN-LAST:event_KullanıcıAyarlarıLabelMouseClicked

    private void CıkısLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CıkısLabelMouseEntered
        IconAyarları.IconDegis(CıkısLabel, "Cıkıs2");
    }//GEN-LAST:event_CıkısLabelMouseEntered

    private void CıkısLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CıkısLabelMouseExited
        IconAyarları.originalIcon(CıkısLabel);
    }//GEN-LAST:event_CıkısLabelMouseExited

    private void KullanıcıAyarlarıLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KullanıcıAyarlarıLabelMouseEntered
        IconAyarları.IconDegis(KullanıcıAyarlarıLabel, "KullanıcıAyarları2");
    }//GEN-LAST:event_KullanıcıAyarlarıLabelMouseEntered

    private void KullanıcıAyarlarıLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KullanıcıAyarlarıLabelMouseExited
        IconAyarları.originalIcon(KullanıcıAyarlarıLabel);
    }//GEN-LAST:event_KullanıcıAyarlarıLabelMouseExited

    private void ReceteButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceteButonMouseEntered
        butonAyar.setBgFg(ReceteButon, Color.black, Color.yellow);
        IconAyarları.IconDegis(ReceteLabel, "Reçete2");
    }//GEN-LAST:event_ReceteButonMouseEntered

    private void ReceteButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReceteButonMouseExited
        butonAyar.setOriginalBgFg(ReceteButon);
        IconAyarları.originalIcon(ReceteLabel);
    }//GEN-LAST:event_ReceteButonMouseExited

    private void ReceteButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceteButonActionPerformed
        new RecetelerimEkran().setVisible(true);
    }//GEN-LAST:event_ReceteButonActionPerformed

    

    
    
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
            java.util.logging.Logger.getLogger(HastaKontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaKontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaKontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaKontrolPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaKontrolPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CıkısLabel;
    private javax.swing.JPanel HastaKonrtolPanelP;
    private javax.swing.JLabel HosgeldinLabel;
    private javax.swing.JLabel KullanıcıAdıSoyadıLabel;
    private javax.swing.JLabel KullanıcıAyarlarıLabel;
    private javax.swing.JLabel RandevUGecmisiLabel;
    private javax.swing.JButton RandevuAlButon;
    private javax.swing.JLabel RandevuAlLabel;
    private javax.swing.JButton RandevuGecmisiButon;
    private javax.swing.JButton ReceteButon;
    private javax.swing.JLabel ReceteLabel;
    // End of variables declaration//GEN-END:variables
}
