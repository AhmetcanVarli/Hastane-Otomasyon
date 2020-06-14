
package giris;

import database.IBilgiKontrol;
import database.transactions.HastaGiris;
import database.transactions.HesapBilgileri;
import database.transactions.SifreYenileme;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.Dialogs;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.butonAyar;
import giris.ayarlar.textAyar;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class SifremiUnuttumEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol{

    
    private SifreYenileme sifreYenilemeObject = null;
    
    public SifremiUnuttumEkranı() {
        initComponents();
        Duzenle();
    }
    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        SifreUnuttumPanel.setFocusable(true);
        textAyar.sayıAyarla(TCnoText);
        textAyar.sayıAyarla(telefonNoText);
        textAyar.limitAyar(TCnoText, 11);
        textAyar.limitAyar(telefonNoText, 11);
        
    }

    public JPasswordField getEskiSifreText() {
        return EskiSifreText;
    }

    private boolean EskiSifreAktifmi(){
        return this.getEskiSifreText().isEnabled();
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return textAyar.textAlanlariDolumu(this.SifreUnuttumPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreYenilemeObject() {
        if(this.sifreYenilemeObject == null){
            sifreYenilemeObject = new SifreYenileme();
        }
        return sifreYenilemeObject;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SifreUnuttumPanel = new javax.swing.JPanel();
        CevapLabel = new javax.swing.JLabel();
        YeniSifreLabel = new javax.swing.JLabel();
        SifreTekrarLabel = new javax.swing.JLabel();
        YeniŞifreText = new javax.swing.JPasswordField();
        SifreTekrarText = new javax.swing.JPasswordField();
        SifreYenileButon = new javax.swing.JButton();
        geriLabel = new javax.swing.JLabel();
        TCnoLabel = new javax.swing.JLabel();
        TCnoText = new javax.swing.JTextField();
        EskiSifreLabel = new javax.swing.JLabel();
        EskiSifreText = new javax.swing.JPasswordField();
        CevapText = new javax.swing.JTextField();
        telefonNoText = new javax.swing.JTextField();
        telefonNoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Şifremi Unuttum");

        SifreUnuttumPanel.setBackground(new java.awt.Color(0, 153, 153));

        CevapLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CevapLabel.setText("GÜVENLİK CEVAP:");

        YeniSifreLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        YeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        YeniSifreLabel.setText("YENİ ŞİFRE:");

        SifreTekrarLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SifreTekrarLabel.setText("YENİ ŞİFRE TEKRAR:");

        SifreYenileButon.setText("ŞİFRE YENİLE");
        SifreYenileButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SifreYenileButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SifreYenileButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SifreYenileButonMouseExited(evt);
            }
        });
        SifreYenileButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifreYenileButonActionPerformed(evt);
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

        TCnoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TCnoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TCnoLabel.setText("T.C KİMLİK NO:");

        TCnoText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        EskiSifreLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EskiSifreLabel.setText("ESKİ ŞİFRE:");

        telefonNoText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        telefonNoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        telefonNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telefonNoLabel.setText("TELEFON NO:");

        javax.swing.GroupLayout SifreUnuttumPanelLayout = new javax.swing.GroupLayout(SifreUnuttumPanel);
        SifreUnuttumPanel.setLayout(SifreUnuttumPanelLayout);
        SifreUnuttumPanelLayout.setHorizontalGroup(
            SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SifreUnuttumPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriLabel)
                .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SifreUnuttumPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TCnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CevapText)
                            .addComponent(TCnoText)
                            .addComponent(EskiSifreText, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(YeniŞifreText)
                            .addComponent(SifreTekrarText)
                            .addComponent(telefonNoText)))
                    .addGroup(SifreUnuttumPanelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(SifreYenileButon, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        SifreUnuttumPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CevapText, EskiSifreText, SifreTekrarText, TCnoText, YeniŞifreText});

        SifreUnuttumPanelLayout.setVerticalGroup(
            SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SifreUnuttumPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(geriLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SifreUnuttumPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EskiSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YeniŞifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SifreUnuttumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SifreTekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(SifreYenileButon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SifreUnuttumPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CevapLabel, SifreTekrarLabel, YeniSifreLabel});

        SifreUnuttumPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CevapText, EskiSifreText, SifreTekrarText, TCnoText, YeniŞifreText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SifreUnuttumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SifreUnuttumPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriLabelMouseExited
        IconAyarları.originalIcon(geriLabel);
    }//GEN-LAST:event_geriLabelMouseExited

    private void geriLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriLabelMouseEntered
        IconAyarları.IconDegis(geriLabel, "geriOk2");
    }//GEN-LAST:event_geriLabelMouseEntered

    private void geriLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriLabelMouseClicked
        if(EskiSifreAktifmi()){
        ActionAyarları.setVisible(this, new KullanıcıAyarları());
        }
        else{
            ActionAyarları.setVisible(this,new HastaEkranı());
        }
    }//GEN-LAST:event_geriLabelMouseClicked

    private void SifreYenileButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifreYenileButonActionPerformed
        if(this.bilgilerGecerliMi()){
            this.SifreyiYenile();
        }else{
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_SifreYenileButonActionPerformed

    private void SifreyiYenile(){
        String yenisifre = String.valueOf(this.YeniŞifreText.getPassword());
        String yenisifretekrar = String.valueOf(this.SifreTekrarText.getPassword());
        
        if(yenisifre.equals(yenisifretekrar)){
            this.SifreyiOnayla();
        }else{
            Dialogs.ozelMesajGoster(this, "Şifreler Uyuşmuyor");
        }
    }
    
    private void SifreyiOnayla(){
        this.getSifreYenilemeObject().setTcNo(this.TCnoText.getText());
        this.getSifreYenilemeObject().setTelNo(this.telefonNoText.getText());
        this.getSifreYenilemeObject().setGuvenlikCevap(this.CevapText.getText());
        if(this.EskiSifreAktifmi()){
            this.getSifreYenilemeObject().setEskiSifre(String.valueOf(this.EskiSifreText.getPassword()));
        }
        this.getSifreYenilemeObject().setYeniSifre(String.valueOf(this.YeniŞifreText.getPassword()));
        if(this.getSifreYenilemeObject().SifreYenilendiMi()){
            Dialogs.ozelMesajGoster(this, "Şifreniz Yenilendi.");
            if(this.EskiSifreAktifmi()){
                ActionAyarları.setVisible(this, new HastaKontrolPanel());
            }else{
                ActionAyarları.setVisible(this, new girisekran());
            }
        }else{
            Dialogs.ozelMesajGoster(this, "Şifreniz Yenilenemedi\n Lütfen Bilgilerinizi Kontrol Ediniz.");
        }
    }
    
    private void SifreYenileButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreYenileButonMouseEntered
       butonAyar.setBgFg(SifreYenileButon, Color.black, Color.yellow);
    }//GEN-LAST:event_SifreYenileButonMouseEntered

    private void SifreYenileButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreYenileButonMouseExited
       butonAyar.setOriginalBgFg(SifreYenileButon);
    }//GEN-LAST:event_SifreYenileButonMouseExited

    

    
    
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
            java.util.logging.Logger.getLogger(SifremiUnuttumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifremiUnuttumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifremiUnuttumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifremiUnuttumEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifremiUnuttumEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CevapLabel;
    private javax.swing.JTextField CevapText;
    private javax.swing.JLabel EskiSifreLabel;
    private javax.swing.JPasswordField EskiSifreText;
    private javax.swing.JLabel SifreTekrarLabel;
    private javax.swing.JPasswordField SifreTekrarText;
    private javax.swing.JPanel SifreUnuttumPanel;
    private javax.swing.JButton SifreYenileButon;
    private javax.swing.JLabel TCnoLabel;
    private javax.swing.JTextField TCnoText;
    private javax.swing.JLabel YeniSifreLabel;
    private javax.swing.JPasswordField YeniŞifreText;
    private javax.swing.JLabel geriLabel;
    private javax.swing.JLabel telefonNoLabel;
    private javax.swing.JTextField telefonNoText;
    // End of variables declaration//GEN-END:variables
}
