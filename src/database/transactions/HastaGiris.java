package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import giris.HastaEkranı;

public class HastaGiris extends DbConnection implements IBilgiKontrol {

    HastaEkranı hastaEkranıObject = new HastaEkranı();
    
    private String hastaKimlik = hastaEkranıObject.getKimlikText().getText();
    private String sifre = String.valueOf(hastaEkranıObject.getSifreText().getPassword());

    public boolean girisBilgileriDogruMu() {
        if (bilgilerGecerliMi()) {
            if (girisBasarilimi()) {
                this.getHesapBilgileri().hastaGirisYap(hastaKimlik);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.hastaKimlik == null
                || this.sifre == null);
    }

    private boolean girisBasarilimi() {
        String query = "SELECT TcNo,Sifre FROM hastalar WHERE TcNo = '" + this.hastaKimlik + "'" + " AND Sifre = '" + this.sifre + "'";

        try {
            super.statement = super.connection.createStatement();

            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HastaGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getHastaKimlik() {
        return hastaKimlik;
    }

    public void setHastaKimlik(String hastaKimlik) {
        this.hastaKimlik = hastaKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
