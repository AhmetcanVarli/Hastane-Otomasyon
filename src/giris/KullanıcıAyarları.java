
package giris;

import database.IBilgiKontrol;
import database.transactions.HastaSilme;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.Dialogs;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.textAyar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class KullanıcıAyarları extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol{

    private TelNoYenileme telNoYenilemeObject = null;
    private HastaSilme hastaSilmeObject = null;
    private String eskiTelNo = null;
    
    public KullanıcıAyarları() {
        initComponents();
        Duzenle();
    }
    
    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        KullanıcıAyarPanel.setFocusable(true);
        textAyar.limitAyar(telefonText, 11);
        this.adText.setText(getHesapBilgileri().getAd());
        this.soyadText.setText(getHesapBilgileri().getSoyad());
        this.tcKimlikText.setText(getHesapBilgileri().getTcNo());
        this.telefonText.setText(getHesapBilgileri().getTelNo());
        this.eskiTelNo = telefonText.getText();
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.telefonText.equals(" "));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelNoYenilemeObject() {
        if(this.telNoYenilemeObject == null){
            telNoYenilemeObject = new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }

    public HastaSilme getHastaSilmeObject() {
        if(this.hastaSilmeObject == null){
            hastaSilmeObject = new HastaSilme();
        }
        return hastaSilmeObject;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KullanıcıAyarPanel = new javax.swing.JPanel();
        tcKimlikLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        telefonLabel = new javax.swing.JLabel();
        tcKimlikText = new javax.swing.JTextField();
        adText = new javax.swing.JTextField();
        soyadText = new javax.swing.JTextField();
        telefonText = new javax.swing.JTextField();
        GeriLabel = new javax.swing.JLabel();
        SifreLabel = new javax.swing.JLabel();
        SifreText = new javax.swing.JTextField();
        TelGuncellemeLabel = new javax.swing.JLabel();
        SifreGuncellemeLabel = new javax.swing.JLabel();
        KayıtSilButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        KullanıcıAyarPanel.setBackground(new java.awt.Color(0, 153, 153));

        tcKimlikLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tcKimlikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcKimlikLabel.setText("T.C KİMLİK NO:");

        adLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adLabel.setText("AD:");

        soyadLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        soyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soyadLabel.setText("SOYAD:");

        telefonLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telefonLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonLabel.setText("TELEFON:");

        tcKimlikText.setEnabled(false);

        adText.setEnabled(false);

        soyadText.setEnabled(false);

        telefonText.setEnabled(false);

        GeriLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/geriOk.png"))); // NOI18N
        GeriLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GeriLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GeriLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GeriLabelMouseExited(evt);
            }
        });

        SifreLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SifreLabel.setText("ŞİFRE:");

        SifreText.setText("****************");
        SifreText.setEnabled(false);

        TelGuncellemeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/Güncelleme.png"))); // NOI18N
        TelGuncellemeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TelGuncellemeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelGuncellemeLabelMouseClicked(evt);
            }
        });

        SifreGuncellemeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/Güncelleme.png"))); // NOI18N
        SifreGuncellemeLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SifreGuncellemeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SifreGuncellemeLabelMouseClicked(evt);
            }
        });

        KayıtSilButon.setText("Kayıt Sil");
        KayıtSilButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KayıtSilButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KullanıcıAyarPanelLayout = new javax.swing.GroupLayout(KullanıcıAyarPanel);
        KullanıcıAyarPanel.setLayout(KullanıcıAyarPanelLayout);
        KullanıcıAyarPanelLayout.setHorizontalGroup(
            KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(GeriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                        .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcKimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcKimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                                .addComponent(telefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TelGuncellemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SifreGuncellemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                        .addComponent(SifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(SifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KullanıcıAyarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KayıtSilButon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );

        KullanıcıAyarPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SifreGuncellemeLabel, TelGuncellemeLabel});

        KullanıcıAyarPanelLayout.setVerticalGroup(
            KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(GeriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tcKimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tcKimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telefonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(telefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(KullanıcıAyarPanelLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(TelGuncellemeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SifreGuncellemeLabel)
                    .addGroup(KullanıcıAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(KayıtSilButon, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        KullanıcıAyarPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SifreGuncellemeLabel, TelGuncellemeLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KullanıcıAyarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(KullanıcıAyarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void GeriLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriLabelMouseClicked
        ActionAyarları.setVisible(this, new HastaKontrolPanel());
    }//GEN-LAST:event_GeriLabelMouseClicked

    private void GeriLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriLabelMouseEntered
        IconAyarları.IconDegis(GeriLabel, "geriOk2");
    }//GEN-LAST:event_GeriLabelMouseEntered

    private void GeriLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriLabelMouseExited
        IconAyarları.originalIcon(GeriLabel);
    }//GEN-LAST:event_GeriLabelMouseExited

    private int tiklamasay = 0;
    private void TelGuncellemeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelGuncellemeLabelMouseClicked
        if(tiklamasay == 0){// daha önce tıklanmadıysa
        telefonText.setEnabled(true);
        IconAyarları.IconDegis(TelGuncellemeLabel, "tick");
        tiklamasay++;
        }
        else{//daha önce tıklandıysa
            telefonText.setEnabled(false);
            this.telNoYenile();     
            IconAyarları.originalIcon(TelGuncellemeLabel);
            tiklamasay = 0;
        }
    }//GEN-LAST:event_TelGuncellemeLabelMouseClicked

    private void telNoYenile(){
        if(this.bilgilerGecerliMi()){
            String yeniTelNo = this.telefonText.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);
            if(getTelNoYenilemeObject().telNoYenilendiMi()){
                Dialogs.ozelMesajGoster(this, "Telefon numarası" + yeniTelNo + "olarak güncellendi.");
            }else{
                Dialogs.ozelMesajGoster(this, "Telefon numarası güncellenemedi tekrar deneyiniz.");
                this.telefonText.setText(this.eskiTelNo);
            }
        }else{
            Dialogs.bosOlamazMesajGoster(this);
            this.telefonText.setText(this.eskiTelNo);
        }
    }
    
    private void SifreGuncellemeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreGuncellemeLabelMouseClicked
        ActionAyarları.setVisible(this, new SifremiUnuttumEkranı());
    }//GEN-LAST:event_SifreGuncellemeLabelMouseClicked

    private void KayıtSilButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KayıtSilButonActionPerformed
        String Soru = "Kaydınız Siliniyor \n Onaylıyor musunuz?";
        if(Dialogs.onayMesajGoster(this, Soru) == 1){
            getHastaSilmeObject().kayıtSil();
            ActionAyarları.setVisible(this, new HastaEkranı());
        }else{
            
        }
        
    }//GEN-LAST:event_KayıtSilButonActionPerformed

   

    public JTextField getTcKimlikText() {
        return tcKimlikText;
    }

    public void setTcKimlikText(JTextField tcKimlikText) {
        this.tcKimlikText = tcKimlikText;
    }

    public JTextField getSifreText() {
        return SifreText;
    }

    public void setSifreText(JTextField SifreText) {
        this.SifreText = SifreText;
    }

    public JTextField getAdText() {
        return adText;
    }

    public void setAdText(JTextField adText) {
        this.adText = adText;
    }

    public JTextField getSoyadText() {
        return soyadText;
    }

    public void setSoyadText(JTextField soyadText) {
        this.soyadText = soyadText;
    }

    public JTextField getTelefonText() {
        return telefonText;
    }

    public void setTelefonText(JTextField telefonText) {
        this.telefonText = telefonText;
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
            java.util.logging.Logger.getLogger(KullanıcıAyarları.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullanıcıAyarları.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullanıcıAyarları.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullanıcıAyarları.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullanıcıAyarları().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GeriLabel;
    private javax.swing.JButton KayıtSilButon;
    private javax.swing.JPanel KullanıcıAyarPanel;
    private javax.swing.JLabel SifreGuncellemeLabel;
    private javax.swing.JLabel SifreLabel;
    private javax.swing.JTextField SifreText;
    private javax.swing.JLabel TelGuncellemeLabel;
    private javax.swing.JLabel adLabel;
    private javax.swing.JTextField adText;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField soyadText;
    private javax.swing.JLabel tcKimlikLabel;
    private javax.swing.JTextField tcKimlikText;
    private javax.swing.JLabel telefonLabel;
    private javax.swing.JTextField telefonText;
    // End of variables declaration//GEN-END:variables

    
}
