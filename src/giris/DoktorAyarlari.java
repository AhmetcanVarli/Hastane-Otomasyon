
package giris;

import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.textAyar;


public class DoktorAyarlari extends javax.swing.JFrame implements IDuzenleyici, IBilgiKontrol{

   
    public DoktorAyarlari() {
        initComponents();
        Duzenle();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DoktorAyarPanel = new javax.swing.JPanel();
        GeriLabel = new javax.swing.JLabel();
        tcKimlikLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        tcKimlikText = new javax.swing.JTextField();
        adText = new javax.swing.JTextField();
        soyadText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doktor Ayarları");

        DoktorAyarPanel.setBackground(new java.awt.Color(0, 153, 153));

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

        tcKimlikLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tcKimlikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcKimlikLabel.setText("T.C. KİMLİK NO:");

        adLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adLabel.setText("AD:");

        soyadLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        soyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        soyadLabel.setText("SOYAD:");

        tcKimlikText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        adText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        soyadText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout DoktorAyarPanelLayout = new javax.swing.GroupLayout(DoktorAyarPanel);
        DoktorAyarPanel.setLayout(DoktorAyarPanelLayout);
        DoktorAyarPanelLayout.setHorizontalGroup(
            DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoktorAyarPanelLayout.createSequentialGroup()
                .addGroup(DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DoktorAyarPanelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcKimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tcKimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DoktorAyarPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(GeriLabel)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        DoktorAyarPanelLayout.setVerticalGroup(
            DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoktorAyarPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(GeriLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcKimlikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcKimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DoktorAyarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoktorAyarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoktorAyarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        DoktorAyarPanel.setFocusable(true);
        this.tcKimlikText.setText(getHesapBilgileri().getDoktorTcNO());
        this.tcKimlikText.setEnabled(false);
        this.adText.setText(getHesapBilgileri().getDoktorAd());
        this.adText.setEnabled(false);
        this.soyadText.setText(getHesapBilgileri().getDoktorSoyad());
        this.soyadText.setEnabled(false);
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    
    
    private void GeriLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriLabelMouseClicked
        ActionAyarları.setVisible(this, new DoktorKontrolPaneli());
    }//GEN-LAST:event_GeriLabelMouseClicked

    private void GeriLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriLabelMouseEntered
        IconAyarları.IconDegis(GeriLabel, "geriOk2");
    }//GEN-LAST:event_GeriLabelMouseEntered

    private void GeriLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GeriLabelMouseExited
        IconAyarları.originalIcon(GeriLabel);
    }//GEN-LAST:event_GeriLabelMouseExited

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorAyarlari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DoktorAyarPanel;
    private javax.swing.JLabel GeriLabel;
    private javax.swing.JLabel adLabel;
    private javax.swing.JTextField adText;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JTextField soyadText;
    private javax.swing.JLabel tcKimlikLabel;
    private javax.swing.JTextField tcKimlikText;
    // End of variables declaration//GEN-END:variables
}
