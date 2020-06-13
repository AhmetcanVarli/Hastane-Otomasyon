package giris;

import database.DbConnection;
import database.IBilgiKontrol;
import database.transactions.HastaGiris;
import database.transactions.HesapBilgileri;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.Dialogs;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.butonAyar;
import giris.ayarlar.textAyar;
import java.awt.Color;
import giris.kayıtekran;
import java.awt.Dialog;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public final class HastaEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    private HastaGiris hastaGirisObject = null;

    private final String KIMLIK_TEXT_ORIGINAL = "T.C.NO";
    private final String SIFRE_TEXT_ORIGINAL = "*********";

    public HastaEkranı() {
        initComponents();
        Duzenle();
        DbConnection dbConnection = new DbConnection();
    }

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        hastaEkranıPanel.setFocusable(true);
        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        sifreText.setText(SIFRE_TEXT_ORIGINAL);
        textAyar.sayıAyarla(kimlikText);

    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.kimlikText.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.sifreText.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public HastaGiris getHastaGirisObject() {
        if (this.hastaGirisObject == null) {
            hastaGirisObject = new HastaGiris();
        }
        return hastaGirisObject;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hastaEkranıPanel = new javax.swing.JPanel();
        girisLabel = new javax.swing.JLabel();
        kimlikLabel = new javax.swing.JLabel();
        sifreLabel = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        girisButon = new javax.swing.JButton();
        kayıtButon = new javax.swing.JButton();
        geriLabel = new javax.swing.JLabel();
        SifrenimiUnuttunLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasta Girişi");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        hastaEkranıPanel.setBackground(new java.awt.Color(0, 153, 153));

        girisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        girisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        girisLabel.setText("HASTA GİRİŞİ");

        kimlikLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kimlikLabel.setText("TC KİMLİK NO:");

        sifreLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sifreLabel.setText("ŞİFRE:");

        kimlikText.setBackground(new java.awt.Color(153, 153, 153));
        kimlikText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kimlikText.setToolTipText("");
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        sifreText.setBackground(new java.awt.Color(153, 153, 153));
        sifreText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });

        girisButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        girisButon.setText("GİRİŞ");
        girisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisButonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButonMouseExited(evt);
            }
        });
        girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButonActionPerformed(evt);
            }
        });

        kayıtButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kayıtButon.setText("KAYIT OL");
        kayıtButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kayıtButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kayıtButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kayıtButonMouseExited(evt);
            }
        });
        kayıtButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayıtButonActionPerformed(evt);
            }
        });

        geriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/geriOk.png"))); // NOI18N
        geriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                geriLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                geriLabelMouseExited(evt);
            }
        });

        SifrenimiUnuttunLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SifrenimiUnuttunLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SifrenimiUnuttunLabel.setText("ŞİFRENİ Mİ UNUTTUN?");
        SifrenimiUnuttunLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SifrenimiUnuttunLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SifrenimiUnuttunLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hastaEkranıPanelLayout = new javax.swing.GroupLayout(hastaEkranıPanel);
        hastaEkranıPanel.setLayout(hastaEkranıPanelLayout);
        hastaEkranıPanelLayout.setHorizontalGroup(
            hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                .addGroup(hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(girisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(kayıtButon, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                                .addComponent(kimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                                .addComponent(sifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(girisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hastaEkranıPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SifrenimiUnuttunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );

        hastaEkranıPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimlikLabel, sifreLabel});

        hastaEkranıPanelLayout.setVerticalGroup(
            hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                .addGroup(hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(girisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hastaEkranıPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(geriLabel)))
                .addGap(30, 30, 30)
                .addGroup(hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(hastaEkranıPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayıtButon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(SifrenimiUnuttunLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        hastaEkranıPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {kimlikLabel, sifreLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hastaEkranıPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hastaEkranıPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SifrenimiUnuttunLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifrenimiUnuttunLabelMouseClicked
        SifremiUnuttumEkranı sifremiUnuttumEkranı = new SifremiUnuttumEkranı();
        ActionAyarları.setVisible(this, sifremiUnuttumEkranı);
        sifremiUnuttumEkranı.getEskiSifreText().setEnabled(false);
    }//GEN-LAST:event_SifrenimiUnuttunLabelMouseClicked

    private void geriLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriLabelMouseExited
        IconAyarları.originalIcon(geriLabel);
    }//GEN-LAST:event_geriLabelMouseExited

    private void geriLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriLabelMouseEntered
        IconAyarları.IconDegis(geriLabel, "geriOk2");
    }//GEN-LAST:event_geriLabelMouseEntered

    private void geriLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriLabelMouseClicked
        ActionAyarları.setVisible(this, new girisekran());
    }//GEN-LAST:event_geriLabelMouseClicked

    private void kayıtButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayıtButonActionPerformed
        ActionAyarları.setVisible(this, new kayıtekran());
    }//GEN-LAST:event_kayıtButonActionPerformed

    private void kayıtButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayıtButonMouseExited
        butonAyar.setOriginalBgFg(kayıtButon);
    }//GEN-LAST:event_kayıtButonMouseExited

    private void kayıtButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kayıtButonMouseEntered
        butonAyar.setBgFg(kayıtButon, Color.GREEN, Color.yellow);
    }//GEN-LAST:event_kayıtButonMouseEntered

    private void girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButonActionPerformed
        if (this.bilgilerGecerliMi()) {
            String hastaKimlik = this.kimlikText.getText().trim();
            String sifre = String.valueOf(this.sifreText.getPassword());
            textAyar.LimitAyari(kimlikText);
            this.girisYap(hastaKimlik, sifre);
        } else {
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_girisButonActionPerformed

    private void girisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseExited
        butonAyar.setOriginalBgFg(girisButon);
    }//GEN-LAST:event_girisButonMouseExited

    private void girisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseEntered
        butonAyar.setBgFg(girisButon, Color.GREEN, Color.yellow);
    }//GEN-LAST:event_girisButonMouseEntered

    private void girisButonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseClicked

    }//GEN-LAST:event_girisButonMouseClicked

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        textAyar.metinBos(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
        textAyar.metinKontrol(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        textAyar.metinBos(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        textAyar.metinKontrol(kimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void girisYap(String hastaKimlik, String sifre) {
        this.getHastaGirisObject().setHastaKimlik(hastaKimlik);
        this.getHastaGirisObject().setSifre(sifre);
        if (getHastaGirisObject().girisBilgileriDogruMu()) {
            ActionAyarları.setVisible(this, new HastaKontrolPanel());
        } else {
            Dialogs.ozelMesajGoster(this, "Giriş Bilgiler Doğru Değil.\n"
                    + "Bilgileri Kontrol Ediniz.");
        }
    }

    public void kontrol() {
        String tckimlikno = kimlikText.getText();
        char[] sifre = sifreText.getPassword();
        String sifreText = new String(sifre);

    }

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
            java.util.logging.Logger.getLogger(HastaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaEkranı().setVisible(true);
            }
        });
    }

    public JTextField getKimlikText() {
        return kimlikText;
    }

    public void setKimlikText(JTextField kimlikText) {
        this.kimlikText = kimlikText;
    }

    public JPasswordField getSifreText() {
        return sifreText;
    }

    public void setSifreText(JPasswordField sifreText) {
        this.sifreText = sifreText;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SifrenimiUnuttunLabel;
    private javax.swing.JLabel geriLabel;
    private javax.swing.JButton girisButon;
    private javax.swing.JLabel girisLabel;
    private javax.swing.JPanel hastaEkranıPanel;
    private javax.swing.JButton kayıtButon;
    private javax.swing.JLabel kimlikLabel;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JPasswordField sifreText;
    // End of variables declaration//GEN-END:variables
}
