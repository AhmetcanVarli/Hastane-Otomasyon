package giris;

import database.DbConnection;
import database.IBilgiKontrol;
import database.transactions.HesapBilgileri;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

public class Randevular extends javax.swing.JFrame implements IBilgiKontrol{

    public Randevular() {
        initComponents();
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

        RandevularPanel = new javax.swing.JPanel();
        RandevularLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        randevular = new javax.swing.JTable();
        goruntuleButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Randevularım");
        setResizable(false);

        RandevularPanel.setBackground(new java.awt.Color(0, 153, 153));

        RandevularLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RandevularLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RandevularLabel.setText("RANDEVULARIM");

        randevular.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(randevular);

        goruntuleButon.setText("Randevuları Görüntüle");
        goruntuleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goruntuleButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RandevularPanelLayout = new javax.swing.GroupLayout(RandevularPanel);
        RandevularPanel.setLayout(RandevularPanelLayout);
        RandevularPanelLayout.setHorizontalGroup(
            RandevularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RandevularPanelLayout.createSequentialGroup()
                .addGroup(RandevularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RandevularPanelLayout.createSequentialGroup()
                        .addGroup(RandevularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RandevularPanelLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(RandevularLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RandevularPanelLayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(goruntuleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 222, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        RandevularPanelLayout.setVerticalGroup(
            RandevularPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RandevularPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(RandevularLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(goruntuleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RandevularPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RandevularPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goruntuleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goruntuleButonActionPerformed
        Connection con;
        DbConnection dcon = new DbConnection();
        con = dcon.returnConnection();
        String query = "SELECT HastaAd,HastaSoyad,HastaTcNo,Klinik,Tarih,Saat FROM randevular WHERE DoktorAdSoyad = '" + getHesapBilgileri().getDoktorAd() + " " + getHesapBilgileri().getDoktorSoyad() + "'";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(query);
            randevular.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(RandevuGecmisi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_goruntuleButonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Randevular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RandevularLabel;
    private javax.swing.JPanel RandevularPanel;
    private javax.swing.JButton goruntuleButon;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable randevular;
    // End of variables declaration//GEN-END:variables
}
