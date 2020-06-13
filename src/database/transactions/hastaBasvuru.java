package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import giris.ayarlar.textAyar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class hastaBasvuru extends DbConnection  implements IBilgiKontrol{

    private String ad = null, soyad = null, tcNo = null, telNo = null, cinsiyet = null;
    private String guvenlikSorusu = null, guvenlikCevap = null, sifre = null, sifreTekrar = null;

    
    public boolean kayıtOnaylandiMi(){
        if(this.bilgilerGecerliMi()){
            if(this.tcNoTablodaVarMi()){
                return false;
            }else{
                this.kaydıOnayla();
                return true;
            }
        }else{
            return false;
        }
    }
    
    private boolean tcNoTablodaVarMi(){
        String query = "SELECT tc_no FROM hastalar WHERE tc_no = '" + this.tcNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(hastaBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private void kaydıOnayla(){
        String query = "INSERT INTO hastalar(tc_no,ad,soyad,cinsiyet,telefon,sifre,sifre_tekrar,guvenlik_sorusu,guvenlik_cevap)"
                + " VALUES("
                + "'" + this.tcNo + "',"
                + "'" + this.ad + "',"
                + "'" + this.soyad + "',"
                + "'" + this.cinsiyet + "',"
                + "'" + this.telNo + "',"
                + "'" + this.sifre + "',"
                + "'" + this.sifreTekrar + "',"
                + "'" + this.guvenlikSorusu + "',"
                + "'" + this.guvenlikCevap + "'"
                + ")";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(hastaBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.ad == null
                || this.soyad == null
                || this.tcNo == null
                || this.telNo == null
                || this.sifre == null
                || this.sifreTekrar == null
                || this.guvenlikSorusu == null
                || this.guvenlikCevap == null
                || textAyar.uzunlukAyarı(11, this.tcNo)
                || textAyar.uzunlukAyarı(11, this.telNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
    

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlikSorusu() {
        return guvenlikSorusu;
    }

    public void setGuvenlikSorusu(String guvenlikSorusu) {
        this.guvenlikSorusu = guvenlikSorusu;
    }

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getSifreTekrar() {
        return sifreTekrar;
    }

    public void setSifreTekrar(String sifreTekrar) {
        this.sifreTekrar = sifreTekrar;
    }
    
    
}
