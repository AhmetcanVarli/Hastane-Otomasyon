
package giris;

import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import database.transactions.RandevuAl;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.Dialogs;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.textAyar;


public class RandevuAlEkranı extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol{
    
    private RandevuAl randevuAlObject = null;
    
    public RandevuAlEkranı() {
        initComponents();
        Duzenle();
    }

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        RandevuAlPanel.setFocusable(true);
    }

    public RandevuAl getRandevuAlObject() {
        if(randevuAlObject == null){
            randevuAlObject = new RandevuAl();
        }
        return randevuAlObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return textAyar.textAlanlariDolumu(RandevuAlPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RandevuAlPanel = new javax.swing.JPanel();
        geriOkLabel = new javax.swing.JLabel();
        KlinikLabel = new javax.swing.JLabel();
        DoktorLabel = new javax.swing.JLabel();
        RandTarihiLabel = new javax.swing.JLabel();
        RandSaatiLabel = new javax.swing.JLabel();
        KlinikComboBox = new javax.swing.JComboBox<>();
        DoktorComboBox = new javax.swing.JComboBox<>();
        RandevuAlButon = new javax.swing.JButton();
        SaatComboBox = new javax.swing.JComboBox<>();
        TarihComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Randevu Al");
        setResizable(false);

        RandevuAlPanel.setBackground(new java.awt.Color(0, 153, 153));

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

        KlinikLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        KlinikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        KlinikLabel.setText("KLİNİK:");

        DoktorLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        DoktorLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DoktorLabel.setText("DOKTOR:");

        RandTarihiLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        RandTarihiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RandTarihiLabel.setText("RANDEVU TARİHİ:");

        RandSaatiLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        RandSaatiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        RandSaatiLabel.setText("RANDEVU SAATİ:");

        KlinikComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diş Hekimliği", "Göz Hastalıkları", "İç Hastalıkları(Dahiliye)", "Kalp Damar Cerrahisi", "Nörolaji", " " }));
        KlinikComboBox.setToolTipText("");
        KlinikComboBox.setBorder(null);
        KlinikComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DoktorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fatma Arslan", "Emine Çetin", "Mehmet Yılmaz" }));

        RandevuAlButon.setText("Randevu AL");
        RandevuAlButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandevuAlButonActionPerformed(evt);
            }
        });

        SaatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16.00", "16:30", "17:00" }));

        TarihComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", " " }));

        javax.swing.GroupLayout RandevuAlPanelLayout = new javax.swing.GroupLayout(RandevuAlPanel);
        RandevuAlPanel.setLayout(RandevuAlPanelLayout);
        RandevuAlPanelLayout.setHorizontalGroup(
            RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RandevuAlPanelLayout.createSequentialGroup()
                .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RandevuAlPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(geriOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DoktorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RandTarihiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RandSaatiLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(KlinikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(KlinikComboBox, 0, 272, Short.MAX_VALUE)
                            .addComponent(DoktorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SaatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TarihComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(RandevuAlPanelLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(RandevuAlButon, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        RandevuAlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DoktorLabel, KlinikLabel, RandSaatiLabel});

        RandevuAlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {DoktorComboBox, KlinikComboBox, SaatComboBox});

        RandevuAlPanelLayout.setVerticalGroup(
            RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RandevuAlPanelLayout.createSequentialGroup()
                .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RandevuAlPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(geriOkLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RandevuAlPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(KlinikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KlinikComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DoktorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoktorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RandTarihiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TarihComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(RandevuAlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RandSaatiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(RandevuAlButon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        RandevuAlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DoktorLabel, KlinikLabel, RandSaatiLabel, RandTarihiLabel});

        RandevuAlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {DoktorComboBox, KlinikComboBox, SaatComboBox, TarihComboBox});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RandevuAlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RandevuAlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void RandevuAlButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandevuAlButonActionPerformed
        if(this.bilgilerGecerliMi()){
            this.randevuOlustur();
        }else{
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_RandevuAlButonActionPerformed

    public void randevuOlustur(){
        
        this.getRandevuAlObject().setHastaTc(getHesapBilgileri().getTcNo());
        this.getRandevuAlObject().setHastaAd(getHesapBilgileri().getAd());
        this.getRandevuAlObject().setHastaSoyad(getHesapBilgileri().getSoyad());
        this.getRandevuAlObject().setKlinik(String.valueOf(this.KlinikComboBox.getSelectedItem()));
        this.getRandevuAlObject().setDoktorAd(String.valueOf(this.DoktorComboBox.getSelectedItem()));
        this.getRandevuAlObject().setTarih(String.valueOf(this.TarihComboBox.getSelectedItem()));
        this.getRandevuAlObject().setSaat(String.valueOf(this.SaatComboBox.getSelectedItem()));
        
        if(this.randevuAlObject.randevuyuOnayla()){
            Dialogs.ozelMesajGoster(this, "Randevu Alındı");
        }else{
            Dialogs.ozelMesajGoster(this, "Randevu Alınamadı\n Bilgileri kontrol ediniz");
        }
    }
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandevuAlEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DoktorComboBox;
    private javax.swing.JLabel DoktorLabel;
    private javax.swing.JComboBox<String> KlinikComboBox;
    private javax.swing.JLabel KlinikLabel;
    private javax.swing.JLabel RandSaatiLabel;
    private javax.swing.JLabel RandTarihiLabel;
    private javax.swing.JButton RandevuAlButon;
    private javax.swing.JPanel RandevuAlPanel;
    private javax.swing.JComboBox<String> SaatComboBox;
    private javax.swing.JComboBox<String> TarihComboBox;
    private javax.swing.JLabel geriOkLabel;
    // End of variables declaration//GEN-END:variables
}
