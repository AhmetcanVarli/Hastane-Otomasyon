
package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import giris.ReceteYazEkran;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReceteYaz extends DbConnection implements IBilgiKontrol{
    
    ReceteYazEkran receteYazEkranObject = new ReceteYazEkran();
    
    private String hastaTc = null, hastaAd = null, hastaSoyad = null;
    private String doktorAd = null, tarih = null, saat = null;
    private String recete = null;
    
    public boolean receteYaz(){
        if(this.bilgilerGecerliMi()){
            this.recete();
            return true;
        }else{
            return false;
        }
    }
    
    private void recete(){
        String query = "INSERT INTO recete(HastaTc,HastaAdı,HastaSoyad,DoktorAdı,Recete,ReceteTarihi,ReceteSaati)"
                + " VALUES("
                + "'" + this.hastaTc + "',"
                + "'" + this.hastaAd + "',"
                + "'" + this.hastaSoyad + "',"
                + "'" + this.doktorAd + "',"
                + "'" + this.recete + "',"
                + "'" + this.tarih + "',"
                + "'" + this.saat + "'"
                + ")";;
                
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ReceteYaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.doktorAd == null
                || this.hastaTc == null
                || this.hastaAd == null
                || this.hastaSoyad == null
                || this.recete == null
                || this.tarih == null
                || this.saat == null);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getHastaTc() {
        return hastaTc;
    }

    public void setHastaTc(String hastaTc) {
        this.hastaTc = hastaTc;
    }

    

    public String getDoktorAd() {
        return doktorAd;
    }

    public void setDoktorAd(String doktorAd) {
        this.doktorAd = doktorAd;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getRecete() {
        return recete;
    }

    public void setRecete(String recete) {
        this.recete = recete;
    }

    public String getHastaAd() {
        return hastaAd;
    }

    public void setHastaAd(String hastaAd) {
        this.hastaAd = hastaAd;
    }

    public String getHastaSoyad() {
        return hastaSoyad;
    }

    public void setHastaSoyad(String hastaSoyad) {
        this.hastaSoyad = hastaSoyad;
    }
    
    
    
    
    
}
