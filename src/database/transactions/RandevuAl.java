package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RandevuAl extends DbConnection implements IBilgiKontrol {
 
    private String hastaTc = null, hastaAd = null, hastaSoyad = null;
    private String klinik = null, tarih = null, saat = null, doktorAd = null;

   
    ResultSet rs = null;
    PreparedStatement pst = null;
    public boolean randevuyuOnayla() {
        if (this.bilgilerGecerliMi()) {
            this.randevuaKaydet();
            return true;
        } else {
            return false;
        }
    }

    private void randevuaKaydet() {
        String query = "INSERT INTO randevular(HastaTcNo,HastaAd,HastaSoyad,Klinik,DoktorAdSoyad,Tarih,Saat)"
                + " VALUES("
                + "'" + this.hastaTc + "',"
                + "'" + this.hastaAd + "',"
                + "'" + this.hastaSoyad + "',"
                + "'" + this.klinik + "',"
                + "'" + this.doktorAd + "',"
                + "'" + this.tarih + "',"
                + "'" + this.saat + "'"
                + ")";
       
        try {
            super.statement = super.connection.createStatement();
            
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(RandevuAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.hastaTc == null
                || this.hastaAd == null
                || this.hastaSoyad == null
                || this.klinik == null
                || this.doktorAd == null
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

    public String getKlinik() {
        return klinik;
    }

    public void setKlinik(String klinik) {
        this.klinik = klinik;
    }

    public String getDoktorAd() {
        return doktorAd;
    }

    public void setDoktorAd(String doktorAd) {
        this.doktorAd = doktorAd;
    }  
}
