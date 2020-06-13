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

public class ReceteGecmisiEkranı extends javax.swing.JFrame implements IBilgiKontrol{

    public ReceteGecmisiEkranı() {
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

        HastalarPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReceteTable = new javax.swing.JTable();
        ReceteLabel = new javax.swing.JLabel();
        ReceteGoruntuleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hastalar");
        setResizable(false);

        HastalarPanel.setBackground(new java.awt.Color(0, 153, 153));

        ReceteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ReceteTable);

        ReceteLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ReceteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReceteLabel.setText("REÇETELER");

        ReceteGoruntuleButton.setText("REÇETELERİ GÖRÜNTÜLE");
        ReceteGoruntuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceteGoruntuleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HastalarPanelLayout = new javax.swing.GroupLayout(HastalarPanel);
        HastalarPanel.setLayout(HastalarPanelLayout);
        HastalarPanelLayout.setHorizontalGroup(
            HastalarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HastalarPanelLayout.createSequentialGroup()
                .addGroup(HastalarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HastalarPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(ReceteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HastalarPanelLayout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(ReceteGoruntuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );
        HastalarPanelLayout.setVerticalGroup(
            HastalarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HastalarPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ReceteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(ReceteGoruntuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HastalarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HastalarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceteGoruntuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceteGoruntuleButtonActionPerformed
        Connection con;
        DbConnection dcon = new DbConnection();
        con = dcon.returnConnection();
        String query = "SELECT HastaTc,HastaAdı,HastaSoyad,DoktorAdı,Recete,ReceteTarihi,ReceteSaati FROM recete WHERE DoktorAdı= '" + getHesapBilgileri().getDoktorAd() + " " + getHesapBilgileri().getDoktorSoyad() + "'";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(query);
            ReceteTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(RandevuGecmisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReceteGoruntuleButtonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceteGecmisiEkranı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HastalarPanel;
    private javax.swing.JButton ReceteGoruntuleButton;
    private javax.swing.JLabel ReceteLabel;
    private javax.swing.JTable ReceteTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
