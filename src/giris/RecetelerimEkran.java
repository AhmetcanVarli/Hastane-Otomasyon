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


public class RecetelerimEkran extends javax.swing.JFrame implements IBilgiKontrol{
  
    public RecetelerimEkran() {
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

        RecetelerimPanel = new javax.swing.JPanel();
        RecetelerimLabel = new javax.swing.JLabel();
        ReceteTablo = new javax.swing.JScrollPane();
        RecetelerimTable = new javax.swing.JTable();
        ReceteGoruntuleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reçetelerim");
        setResizable(false);

        RecetelerimPanel.setBackground(new java.awt.Color(0, 153, 153));

        RecetelerimLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RecetelerimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RecetelerimLabel.setText("REÇETELERİM");

        RecetelerimTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ReceteTablo.setViewportView(RecetelerimTable);

        ReceteGoruntuleButton.setText("REÇETELERİMİ GÖRÜNTÜLE");
        ReceteGoruntuleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceteGoruntuleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RecetelerimPanelLayout = new javax.swing.GroupLayout(RecetelerimPanel);
        RecetelerimPanel.setLayout(RecetelerimPanelLayout);
        RecetelerimPanelLayout.setHorizontalGroup(
            RecetelerimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecetelerimPanelLayout.createSequentialGroup()
                .addGroup(RecetelerimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RecetelerimPanelLayout.createSequentialGroup()
                        .addGroup(RecetelerimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RecetelerimPanelLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(RecetelerimLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RecetelerimPanelLayout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(ReceteGoruntuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 235, Short.MAX_VALUE))
                    .addComponent(ReceteTablo))
                .addContainerGap())
        );
        RecetelerimPanelLayout.setVerticalGroup(
            RecetelerimPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecetelerimPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RecetelerimLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReceteTablo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(ReceteGoruntuleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RecetelerimPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RecetelerimPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceteGoruntuleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceteGoruntuleButtonActionPerformed
        Connection con;
        DbConnection dcon = new DbConnection();
        con = dcon.returnConnection();
        String query = "SELECT DoktorAdı,Recete,ReceteTarihi,ReceteSaati FROM recete WHERE HastaTc= '" + getHesapBilgileri().getTcNo() + "'";
        Statement stmt;
        ResultSet rs;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(query);
            RecetelerimTable.setModel(DbUtils.resultSetToTableModel(rs)); 
        } catch (SQLException ex) {
            Logger.getLogger(RandevuGecmisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ReceteGoruntuleButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecetelerimEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReceteGoruntuleButton;
    private javax.swing.JScrollPane ReceteTablo;
    private javax.swing.JLabel RecetelerimLabel;
    private javax.swing.JPanel RecetelerimPanel;
    private javax.swing.JTable RecetelerimTable;
    // End of variables declaration//GEN-END:variables
}
