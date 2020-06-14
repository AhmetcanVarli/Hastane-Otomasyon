package giris;

import database.DbConnection;
import giris.ayarlar.ActionAyarları;
import giris.ayarlar.IDuzenleyici;
import giris.ayarlar.IconAyarları;
import giris.ayarlar.butonAyar;
import java.awt.Color;


public class girisekran extends javax.swing.JFrame implements IDuzenleyici{

    public girisekran() {
        initComponents();
        Duzenle();
        new DbConnection();
    }

    @Override
    public void Duzenle() {
        this.setLocationRelativeTo(null);
        girisPanel.setFocusable(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisPanel = new javax.swing.JPanel();
        girisLabel = new javax.swing.JLabel();
        hasta_girisButon = new javax.swing.JButton();
        doktor_girisButon = new javax.swing.JButton();
        DoktorLabel = new javax.swing.JLabel();
        HastaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hastane Otomasyonu");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        girisPanel.setBackground(new java.awt.Color(0, 153, 153));

        girisLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        girisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        girisLabel.setText("HASTANE OTOMASYONU");

        hasta_girisButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hasta_girisButon.setText("HASTA GİRİŞİ");
        hasta_girisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hasta_girisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hasta_girisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hasta_girisButonMouseExited(evt);
            }
        });
        hasta_girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasta_girisButonActionPerformed(evt);
            }
        });

        doktor_girisButon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doktor_girisButon.setText("DOKTOR GİRİŞİ");
        doktor_girisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doktor_girisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doktor_girisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doktor_girisButonMouseExited(evt);
            }
        });
        doktor_girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doktor_girisButonActionPerformed(evt);
            }
        });

        DoktorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/DoktorGiris.png"))); // NOI18N

        HastaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/HastaGiris.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giris/iconlar/saglık_bakanlıgı.png"))); // NOI18N

        javax.swing.GroupLayout girisPanelLayout = new javax.swing.GroupLayout(girisPanel);
        girisPanel.setLayout(girisPanelLayout);
        girisPanelLayout.setHorizontalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPanelLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HastaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hasta_girisButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DoktorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doktor_girisButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68))
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addComponent(girisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(57, 57, 57))
        );
        girisPanelLayout.setVerticalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPanelLayout.createSequentialGroup()
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(girisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(DoktorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(doktor_girisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(HastaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(hasta_girisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        girisPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {doktor_girisButon, hasta_girisButon});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
    // BUTON RENKLENDİRME
    private void hasta_girisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hasta_girisButonMouseEntered
        butonAyar.setBgFg(hasta_girisButon, Color.BLUE,Color.RED);
        IconAyarları.IconDegis(HastaLabel, "HastaGiris2");
    }//GEN-LAST:event_hasta_girisButonMouseEntered

    private void hasta_girisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hasta_girisButonMouseExited
        butonAyar.setOriginalBgFg(hasta_girisButon);
        IconAyarları.originalIcon(HastaLabel);
    }//GEN-LAST:event_hasta_girisButonMouseExited

    private void doktor_girisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doktor_girisButonMouseEntered
        butonAyar.setBgFg(doktor_girisButon, Color.BLUE,Color.RED);
        IconAyarları.IconDegis(DoktorLabel, "DoktorGiris2");
    }//GEN-LAST:event_doktor_girisButonMouseEntered

    private void doktor_girisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doktor_girisButonMouseExited
        butonAyar.setOriginalBgFg(doktor_girisButon);
        IconAyarları.originalIcon(DoktorLabel);
    }//GEN-LAST:event_doktor_girisButonMouseExited

    private void hasta_girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasta_girisButonActionPerformed
        ActionAyarları.setVisible(this, new HastaEkranı());
    }//GEN-LAST:event_hasta_girisButonActionPerformed

    private void doktor_girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doktor_girisButonActionPerformed
        ActionAyarları.setVisible(this, new DoktorEkranı());
    }//GEN-LAST:event_doktor_girisButonActionPerformed

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
            java.util.logging.Logger.getLogger(girisekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(girisekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(girisekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(girisekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new girisekran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoktorLabel;
    private javax.swing.JLabel HastaLabel;
    private javax.swing.JButton doktor_girisButon;
    private javax.swing.JLabel girisLabel;
    private javax.swing.JPanel girisPanel;
    private javax.swing.JButton hasta_girisButon;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
