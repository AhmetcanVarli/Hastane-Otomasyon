package database.transactions;

import database.DbVeriMerkezi;
import database.IBilgiKontrol;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HesapBilgileri extends DbVeriMerkezi implements IBilgiKontrol{
    
    private static HesapBilgileri hesapBilgileri = null;
    
    public static HesapBilgileri getInstance(){
        if(hesapBilgileri == null){
            hesapBilgileri = new HesapBilgileri();
        }
        return hesapBilgileri;
    }  
    public void hastaGirisYap(String hastaKimlik){
        this.hastayiAl(hastaKimlik);
    }
    public void doktorGirisYap(String doktorKimlik){
        this.doktoruAl(doktorKimlik);
    }
    
    private void hastayiAl(String hastaKimlik){
        String query = "SELECT * FROM hastalar WHERE "
                + " TcNo = '" + hastaKimlik + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                super.tcNo = rs.getNString("TcNo");
                super.ad = rs.getNString("Ad");
                super.soyad = rs.getNString("Soyad");
                super.telNo = rs.getNString("Telefon");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void doktoruAl(String doktorKimlik){
        String query = "SELECT * FROM doktorlar WHERE TcNo = '" + doktorKimlik + "'";
                        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                super.DoktorTcNO = rs.getNString("TcNo");
                super.DoktorAd = rs.getNString("Ad");
                super.DoktorSoyad = rs.getNString("Soyad");
            }
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean bilgilerGecerliMi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }          
}
