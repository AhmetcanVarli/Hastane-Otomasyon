package giris;

import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import database.transactions.ReceteYaz;
import giris.ayarlar.Dialogs;
import giris.ayarlar.textAyar;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class ReceteYazEkran extends javax.swing.JFrame implements IBilgiKontrol{

    private ReceteYaz receteYazObject = null;
    
    public ReceteYazEkran() {
        initComponents();
        textAyar.sayıAyarla(HastaTcNoText);
        textAyar.limitAyar(HastaTcNoText, 11);
        textAyar.ReceteAyar(receteText);
    }
    

    public ReceteYaz getReceteYazObject() {
        if(receteYazObject == null){
            receteYazObject = new ReceteYaz();
        }
        return receteYazObject;
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return textAyar.textAlanlariDolumu(ReceteYazPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReceteYazPanel = new javax.swing.JPanel();
        HastaSoyadiLabel = new javax.swing.JLabel();
        TarihLabel = new javax.swing.JLabel();
        ReceteLabel = new javax.swing.JLabel();
        HastaTcNoText = new javax.swing.JTextField();
        ReceteYazButon = new javax.swing.JButton();
        ReceteText = new javax.swing.JScrollPane();
        receteText = new javax.swing.JTextPane();
        SaatLabel = new javax.swing.JLabel();
        TarihComboBox = new javax.swing.JComboBox<>();
        SaatComboBox = new javax.swing.JComboBox<>();
        HastaTcNoLabel = new javax.swing.JLabel();
        HastaAdiLabel = new javax.swing.JLabel();
        HastaAdText = new javax.swing.JTextField();
        HastaSoyadText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reçete Yaz");
        setResizable(false);

        ReceteYazPanel.setBackground(new java.awt.Color(0, 153, 153));

        HastaSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HastaSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HastaSoyadiLabel.setText("HASTA SOYADI:");

        TarihLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TarihLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TarihLabel.setText("TARİH:");

        ReceteLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ReceteLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ReceteLabel.setText("REÇETE:");

        ReceteYazButon.setText("YAZ");
        ReceteYazButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceteYazButonActionPerformed(evt);
            }
        });

        ReceteText.setViewportView(receteText);

        SaatLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SaatLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SaatLabel.setText("SAAT:");

        TarihComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma" }));

        SaatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16.00", "16:30", "17:00" }));

        HastaTcNoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HastaTcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HastaTcNoLabel.setText("HASTA T.C. NO:");

        HastaAdiLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HastaAdiLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HastaAdiLabel.setText("HASTA ADI:");

        javax.swing.GroupLayout ReceteYazPanelLayout = new javax.swing.GroupLayout(ReceteYazPanel);
        ReceteYazPanel.setLayout(ReceteYazPanelLayout);
        ReceteYazPanelLayout.setHorizontalGroup(
            ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                        .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(HastaTcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HastaSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HastaAdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HastaAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HastaTcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HastaSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                                .addComponent(SaatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SaatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TarihComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TarihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                                .addComponent(ReceteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(ReceteYazButon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ReceteText, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        ReceteYazPanelLayout.setVerticalGroup(
            ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HastaTcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaTcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HastaAdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HastaSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TarihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TarihComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ReceteYazPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ReceteYazPanelLayout.createSequentialGroup()
                        .addComponent(ReceteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ReceteText, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(ReceteYazButon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReceteYazPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReceteYazPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceteYazButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceteYazButonActionPerformed
        if(bilgilerGecerliMi()){
            this.receteOlustur();
        }else{
            Dialogs.bosOlamazMesajGoster(this);
        }
    }//GEN-LAST:event_ReceteYazButonActionPerformed
    
    public void receteOlustur(){
        this.getReceteYazObject().setHastaTc(this.HastaTcNoText.getText().trim());
        this.getReceteYazObject().setHastaAd(this.HastaAdText.getText().trim());
        this.getReceteYazObject().setHastaSoyad(this.HastaSoyadText.getText().trim());
        this.getReceteYazObject().setTarih(String.valueOf(this.TarihComboBox.getSelectedItem()));
        this.getReceteYazObject().setSaat(String.valueOf(this.SaatComboBox.getSelectedItem()));
        this.getReceteYazObject().setRecete(this.receteText.getText());
        this.getReceteYazObject().setDoktorAd(getHesapBilgileri().getDoktorAd() + " " + getHesapBilgileri().getDoktorSoyad());
        
        
        if(receteYazObject.receteYaz()){
            Dialogs.ozelMesajGoster(this, "Reçete Yazıldı.");
        }else{
            Dialogs.ozelMesajGoster(this, "Reçete Yazılamadı.");
        }
    }
    
    public JTextField getHastaTcNoText() {
        return HastaTcNoText;
    }

    public void setHastaTcNoText(JTextField HastaTcNoText) {
        this.HastaTcNoText = HastaTcNoText;
    }

    public JTextPane getReceteText() {
        return receteText;
    }

    public void setReceteText(JTextPane receteText) {
        this.receteText = receteText;
    }

    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceteYazEkran().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HastaAdText;
    private javax.swing.JLabel HastaAdiLabel;
    private javax.swing.JTextField HastaSoyadText;
    private javax.swing.JLabel HastaSoyadiLabel;
    private javax.swing.JLabel HastaTcNoLabel;
    private javax.swing.JTextField HastaTcNoText;
    private javax.swing.JLabel ReceteLabel;
    private javax.swing.JScrollPane ReceteText;
    private javax.swing.JButton ReceteYazButon;
    private javax.swing.JPanel ReceteYazPanel;
    private javax.swing.JComboBox<String> SaatComboBox;
    private javax.swing.JLabel SaatLabel;
    private javax.swing.JComboBox<String> TarihComboBox;
    private javax.swing.JLabel TarihLabel;
    private javax.swing.JTextPane receteText;
    // End of variables declaration//GEN-END:variables
}


