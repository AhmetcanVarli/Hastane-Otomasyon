package giris;

import database.DbConnection;
import database.IBilgiKontrol;
import database.transactions.DoktorGiris;
import database.transactions.HesapBilgileri;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.Dialogs;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.butonAyar;
import giris.ayarlar.textAyar;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public final class DoktorEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol{

    private DoktorGiris doktorGirisObject = null;
    
    private final String KIMLIK_TEXT_ORIGINAL = "T.C.NO";
    private final String SIFRE_TEXT_ORIGINAL = "*********";
    
    public DoktorEkranı() {
        initComponents();
        Duzenle(); 
        DbConnection dbConnection = new DbConnection();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoktorGirişPanel = new javax.swing.JPanel();
        DoktorGirisLabel = new javax.swing.JLabel();
        DoktorKimlikLabel = new javax.swing.JLabel();
        DoktorSifreLabel = new javax.swing.JLabel();
        DoktorKimlikText = new javax.swing.JTextField();
        DoktorSifreText = new javax.swing.JPasswordField();
        DoktorGirisButon = new javax.swing.JButton();
        geriOkLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doktor Girişi");

        DoktorGirişPanel.setBackground(new java.awt.Color(0, 153, 153));

        DoktorGirisLabel.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N
        DoktorGirisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoktorGirisLabel.setText("DOKTOR GİRİŞİ");

        DoktorKimlikLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        DoktorKimlikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DoktorKimlikLabel.setText("T.C. KİMLİK NO :");

        DoktorSifreLabel.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        DoktorSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DoktorSifreLabel.setText("ŞİFRE :");

        DoktorKimlikText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DoktorKimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DoktorKimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DoktorKimlikTextFocusLost(evt);
            }
        });

        DoktorSifreText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DoktorSifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DoktorSifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DoktorSifreTextFocusLost(evt);
            }
        });

        DoktorGirisButon.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DoktorGirisButon.setText("GİRİŞ");
        DoktorGirisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoktorGirisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoktorGirisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoktorGirisButonMouseExited(evt);
            }
        });
        DoktorGirisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoktorGirisButonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout DoktorGirişPanelLayout = new javax.swing.GroupLayout(DoktorGirişPanel);
        DoktorGirişPanel.setLayout(DoktorGirişPanelLayout);
        DoktorGirişPanelLayout.setHorizontalGroup(
            DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoktorGirişPanelLayout.createSequentialGroup()
                .addGroup(DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DoktorGirişPanelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(DoktorGirisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DoktorGirişPanelLayout.createSequentialGroup()
                        .addGroup(DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DoktorGirişPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(DoktorSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DoktorGirişPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(DoktorKimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoktorKimlikText)
                            .addComponent(DoktorSifreText))))
                .addGap(31, 163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoktorGirişPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoktorGirişPanelLayout.createSequentialGroup()
                        .addComponent(DoktorGirisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoktorGirişPanelLayout.createSequentialGroup()
                        .addComponent(geriOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        DoktorGirişPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DoktorKimlikLabel, DoktorSifreLabel});

        DoktorGirişPanelLayout.setVerticalGroup(
            DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoktorGirişPanelLayout.createSequentialGroup()
                .addComponent(DoktorGirisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geriOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoktorKimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DoktorGirişPanelLayout.createSequentialGroup()
                        .addComponent(DoktorKimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(DoktorGirişPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DoktorSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DoktorGirişPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DoktorSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(DoktorGirisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 139, Short.MAX_VALUE))
        );

        DoktorGirişPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DoktorKimlikLabel, DoktorSifreLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoktorGirişPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoktorGirişPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        DoktorGirişPanel.setFocusable(true);
        DoktorKimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        DoktorSifreText.setText(SIFRE_TEXT_ORIGINAL);
        textAyar.sayıAyarla(DoktorKimlikText);
        
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.DoktorKimlikText.getText().equals(this.KIMLIK_TEXT_ORIGINAL)
                || String.valueOf(this.DoktorSifreText.getPassword()).equals(this.SIFRE_TEXT_ORIGINAL));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public DoktorGiris getDoktorGirisObject() {
        if(doktorGirisObject == null){
            doktorGirisObject = new DoktorGiris();
        }
        return doktorGirisObject;
    }
    
    
    
    private void DoktorGirisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorGirisButonMouseEntered
        butonAyar.setBgFg(DoktorGirisButon, Color.BLUE, Color.yellow);
    }//GEN-LAST:event_DoktorGirisButonMouseEntered

    private void DoktorGirisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorGirisButonMouseExited
        butonAyar.setOriginalBgFg(DoktorGirisButon);
    }//GEN-LAST:event_DoktorGirisButonMouseExited

    private void DoktorKimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoktorKimlikTextFocusGained
        textAyar.metinKontrol(DoktorKimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_DoktorKimlikTextFocusGained

    private void DoktorKimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoktorKimlikTextFocusLost
        textAyar.metinBos(DoktorKimlikText);
    }//GEN-LAST:event_DoktorKimlikTextFocusLost

    private void DoktorSifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoktorSifreTextFocusGained
        textAyar.metinKontrol(DoktorSifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_DoktorSifreTextFocusGained

    private void DoktorSifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DoktorSifreTextFocusLost
        textAyar.metinBos(DoktorSifreText);
    }//GEN-LAST:event_DoktorSifreTextFocusLost

    private void geriOkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseClicked
        ActionAyarları.setVisible(this, new girisekran());
    }//GEN-LAST:event_geriOkLabelMouseClicked

    private void geriOkLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseEntered
        IconAyarları.IconDegis(geriOkLabel, "geriOk2");
    }//GEN-LAST:event_geriOkLabelMouseEntered

    private void geriOkLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseExited
        IconAyarları.originalIcon(geriOkLabel);
    }//GEN-LAST:event_geriOkLabelMouseExited

    private void DoktorGirisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoktorGirisButonActionPerformed
       if(this.bilgilerGecerliMi()){
           String doktorKimlik = this.DoktorKimlikText.getText().trim();
           String sifre = String.valueOf(this.DoktorSifreText.getPassword());
           this.girisYap(doktorKimlik, sifre);
       }else{
           Dialogs.bosOlamazMesajGoster(this);
       }
       
       
    }//GEN-LAST:event_DoktorGirisButonActionPerformed

    private void girisYap(String doktorKimlik, String sifre){
        this.getDoktorGirisObject().setDoktorKimlik(doktorKimlik);
        this.getDoktorGirisObject().setSifre(sifre);
        if (getDoktorGirisObject().girisBilgileriGecerliMi()) {
            ActionAyarları.setVisible(this, new DoktorKontrolPaneli());
        }else{
            Dialogs.ozelMesajGoster(this, "Giriş Bilgileri Doğru Değil");
        }
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
            java.util.logging.Logger.getLogger(DoktorEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorEkranı().setVisible(true);
            }
        });
    }

    public JTextField getDoktorKimlikText() {
        return DoktorKimlikText;
    }

    public void setDoktorKimlikText(JTextField DoktorKimlikText) {
        this.DoktorKimlikText = DoktorKimlikText;
    }

    public JPasswordField getDoktorSifreText() {
        return DoktorSifreText;
    }

    public void setDoktorSifreText(JPasswordField DoktorSifreText) {
        this.DoktorSifreText = DoktorSifreText;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoktorGirisButon;
    private javax.swing.JLabel DoktorGirisLabel;
    private javax.swing.JPanel DoktorGirişPanel;
    private javax.swing.JLabel DoktorKimlikLabel;
    private javax.swing.JTextField DoktorKimlikText;
    private javax.swing.JLabel DoktorSifreLabel;
    private javax.swing.JPasswordField DoktorSifreText;
    private javax.swing.JLabel geriOkLabel;
    // End of variables declaration//GEN-END:variables
}
