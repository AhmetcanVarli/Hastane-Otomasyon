package giris;


import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import database.transactions.hastaBasvuru;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.Dialogs;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.butonAyar;
import giris.ayarlar.textAyar;
import java.awt.Color;

public class kayıtekran extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol {

    private hastaBasvuru hastaBasvuruObject = null;

    public kayıtekran() {
        initComponents();
        Duzenle();
    }

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        textAyar.sayıAyarla(KimlikText);
        textAyar.sayıAyarla(telefonText);
        textAyar.harfAyarla(AdText);
        textAyar.limitAyar(KimlikText, 11);
        textAyar.limitAyar(telefonText, 11);
        
    }

    public hastaBasvuru getHastaBasvuruObject() {
        if (hastaBasvuruObject == null) {
            hastaBasvuruObject = new hastaBasvuru();
        }
        return hastaBasvuruObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return textAyar.textAlanlariDolumu(kayıtPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kayıtPanel = new javax.swing.JPanel();
        kimlikLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        cinsiyetLabel = new javax.swing.JLabel();
        TelefonLabel = new javax.swing.JLabel();
        KimlikText = new javax.swing.JTextField();
        AdText = new javax.swing.JTextField();
        cinsiyetBox = new javax.swing.JComboBox<>();
        telefonText = new javax.swing.JTextField();
        sifreLabel = new javax.swing.JLabel();
        sifretekrarLabel = new javax.swing.JLabel();
        güvenliksoruLabel = new javax.swing.JLabel();
        sifreText = new javax.swing.JPasswordField();
        sifretekrarText = new javax.swing.JPasswordField();
        güvenliksoruBox = new javax.swing.JComboBox<>();
        güvenlikcevapLabel = new javax.swing.JLabel();
        güvenlikcevapText = new javax.swing.JTextField();
        KayıtOlButon = new javax.swing.JButton();
        geriOkLabel = new javax.swing.JLabel();
        SoyadText = new javax.swing.JTextField();
        soyadLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt Ol");
        setResizable(false);

        kayıtPanel.setBackground(new java.awt.Color(0, 153, 153));

        kimlikLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        kimlikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kimlikLabel.setText("T.C. KİMLİK NO:");

        adLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        adLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adLabel.setText("AD:");

        cinsiyetLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cinsiyetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cinsiyetLabel.setText("CİNSİYET:");

        TelefonLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TelefonLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TelefonLabel.setText("TELEFON:");

        cinsiyetBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ERKEK", "KADIN ", " " }));

        sifreLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreLabel.setText("ŞİFRE:");

        sifretekrarLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        sifretekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifretekrarLabel.setText("ŞİFRE TEKRAR:");

        güvenliksoruLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        güvenliksoruLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        güvenliksoruLabel.setText("GÜVENLİK SORUSU:");

        güvenliksoruBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Evcil hayvanınızın adı nedir?", "En sevdiğiniz renk?", "İlkokul öğretmeninizin adı nedir?", "Ya da rastgale cümle giriniz(önerilir)." }));

        güvenlikcevapLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        güvenlikcevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        güvenlikcevapLabel.setText("CEVAP:");

        KayıtOlButon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        KayıtOlButon.setText("KAYIT OL");
        KayıtOlButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KayıtOlButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KayıtOlButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KayıtOlButonMouseExited(evt);
            }
        });
        KayıtOlButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KayıtOlButonActionPerformed(evt);
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

        soyadLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        soyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soyadLabel.setText("SOYAD:");

        javax.swing.GroupLayout kayıtPanelLayout = new javax.swing.GroupLayout(kayıtPanel);
        kayıtPanel.setLayout(kayıtPanelLayout);
        kayıtPanelLayout.setHorizontalGroup(
            kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayıtPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(kayıtPanelLayout.createSequentialGroup()
                            .addComponent(soyadLabel)
                            .addGap(18, 18, 18)
                            .addComponent(SoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kayıtPanelLayout.createSequentialGroup()
                                .addComponent(kimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(KimlikText))
                            .addGroup(kayıtPanelLayout.createSequentialGroup()
                                .addComponent(adLabel)
                                .addGap(18, 18, 18)
                                .addComponent(AdText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayıtPanelLayout.createSequentialGroup()
                                .addComponent(TelefonLabel)
                                .addGap(18, 18, 18)
                                .addComponent(telefonText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayıtPanelLayout.createSequentialGroup()
                                .addComponent(sifreLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sifreText))
                            .addGroup(kayıtPanelLayout.createSequentialGroup()
                                .addComponent(sifretekrarLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sifretekrarText))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayıtPanelLayout.createSequentialGroup()
                                .addComponent(güvenliksoruLabel)
                                .addGap(18, 18, 18)
                                .addComponent(güvenliksoruBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayıtPanelLayout.createSequentialGroup()
                                .addComponent(güvenlikcevapLabel)
                                .addGap(18, 18, 18)
                                .addComponent(güvenlikcevapText))
                            .addGroup(kayıtPanelLayout.createSequentialGroup()
                                .addComponent(cinsiyetLabel)
                                .addGap(18, 18, 18)
                                .addComponent(cinsiyetBox, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kayıtPanelLayout.createSequentialGroup()
                        .addComponent(KayıtOlButon, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)))
                .addGap(40, 40, 40)
                .addComponent(geriOkLabel)
                .addGap(19, 19, 19))
        );

        kayıtPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TelefonLabel, adLabel, cinsiyetLabel, güvenlikcevapLabel, güvenliksoruLabel, kimlikLabel, sifreLabel, sifretekrarLabel});

        kayıtPanelLayout.setVerticalGroup(
            kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kayıtPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(geriOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kayıtPanelLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kimlikLabel)
                    .addComponent(KimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adLabel))
                .addGap(12, 12, 12)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinsiyetLabel)
                    .addComponent(cinsiyetBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonLabel)
                    .addComponent(telefonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreLabel)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifretekrarLabel)
                    .addComponent(sifretekrarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(güvenliksoruLabel)
                    .addComponent(güvenliksoruBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kayıtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(güvenlikcevapLabel)
                    .addComponent(güvenlikcevapText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(KayıtOlButon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kayıtPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdText, KimlikText, TelefonLabel, adLabel, cinsiyetBox, cinsiyetLabel, güvenlikcevapLabel, güvenlikcevapText, güvenliksoruBox, güvenliksoruLabel, kimlikLabel, sifreLabel, sifreText, sifretekrarLabel, sifretekrarText, telefonText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kayıtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kayıtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KayıtOlButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KayıtOlButonMouseEntered
        butonAyar.setBgFg(KayıtOlButon, Color.ORANGE, Color.yellow);
    }//GEN-LAST:event_KayıtOlButonMouseEntered

    private void KayıtOlButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KayıtOlButonMouseExited
        butonAyar.setOriginalBgFg(KayıtOlButon);
    }//GEN-LAST:event_KayıtOlButonMouseExited

    private void KayıtOlButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KayıtOlButonActionPerformed
        if (this.bilgilerGecerliMi()) {
            this.kayıtOlustur();
        } else {
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_KayıtOlButonActionPerformed

    public void kayıtOlustur() {
      
        this.getHastaBasvuruObject().setAd(this.AdText.getText().trim());
        this.getHastaBasvuruObject().setSoyad(this.SoyadText.getText().trim());
        this.getHastaBasvuruObject().setTcNo(this.KimlikText.getText().trim());
        this.getHastaBasvuruObject().setTelNo(this.telefonText.getText().trim());
        this.getHastaBasvuruObject().setCinsiyet(String.valueOf(this.cinsiyetBox.getSelectedItem()));
        this.getHastaBasvuruObject().setSifre(String.valueOf(this.sifreText.getPassword()));
        this.getHastaBasvuruObject().setSifreTekrar(String.valueOf(this.sifretekrarText.getPassword()));
        this.getHastaBasvuruObject().setGuvenlikSorusu(String.valueOf(this.güvenliksoruBox.getSelectedItem()));
        this.getHastaBasvuruObject().setGuvenlikCevap(this.güvenlikcevapText.getText().trim());
       
        if(this.getHastaBasvuruObject().kayıtOnaylandiMi()){
        Dialogs.ozelMesajGoster(this, "Kayıt Oluşturuldu");
        ActionAyarları.setVisible(this, new HastaEkranı());
        }else{
            Dialogs.ozelMesajGoster(this, "Kayıt Oluşturulamadı.\n"
            +"Bilgileri Kontrol Ediniz.");
        }
    }


    private void geriOkLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseClicked
        ActionAyarları.setVisible(this, new HastaEkranı());
    }//GEN-LAST:event_geriOkLabelMouseClicked

    private void geriOkLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseEntered
        IconAyarları.IconDegis(geriOkLabel, "geriOk2");
    }//GEN-LAST:event_geriOkLabelMouseEntered

    private void geriOkLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriOkLabelMouseExited
        IconAyarları.originalIcon(geriOkLabel);
    }//GEN-LAST:event_geriOkLabelMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayıtekran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdText;
    private javax.swing.JButton KayıtOlButon;
    private javax.swing.JTextField KimlikText;
    private javax.swing.JTextField SoyadText;
    private javax.swing.JLabel TelefonLabel;
    private javax.swing.JLabel adLabel;
    private javax.swing.JComboBox<String> cinsiyetBox;
    private javax.swing.JLabel cinsiyetLabel;
    private javax.swing.JLabel geriOkLabel;
    private javax.swing.JLabel güvenlikcevapLabel;
    private javax.swing.JTextField güvenlikcevapText;
    private javax.swing.JComboBox<String> güvenliksoruBox;
    private javax.swing.JLabel güvenliksoruLabel;
    private javax.swing.JPanel kayıtPanel;
    private javax.swing.JLabel kimlikLabel;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel sifretekrarLabel;
    private javax.swing.JPasswordField sifretekrarText;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField telefonText;
    // End of variables declaration//GEN-END:variables
}
