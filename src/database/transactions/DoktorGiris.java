package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import giris.DoktorEkranı;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoktorGiris extends DbConnection implements IBilgiKontrol {

    DoktorEkranı doktorEkranıObject = new DoktorEkranı();

    private String doktorKimlik = doktorEkranıObject.getDoktorKimlikText().getText();
    private String sifre = String.valueOf(doktorEkranıObject.getDoktorSifreText().getPassword());

    
    public boolean girisBilgileriGecerliMi(){
        if(bilgilerGecerliMi()){
            if(girisDBasarilimi()){
                this.getHesapBilgileri().doktorGirisYap(doktorKimlik);
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.doktorKimlik == null
                || this.sifre == null);
    }

    private boolean girisDBasarilimi() {
        String query = "SELECT tc_no,sifre FROM doktorlar WHERE tc_no = '" + this.doktorKimlik + "'" + "AND sifre = '" + this.sifre + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoktorGiris.class.getName()).log(Level.SEVERE, null, ex);
           // System.out.println("Yanlış");
        }
        return false;
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public DoktorEkranı getDoktorEkranıObject() {
        return doktorEkranıObject;
    }

    public void setDoktorEkranıObject(DoktorEkranı doktorEkranıObject) {
        this.doktorEkranıObject = doktorEkranıObject;
    }

    public String getDoktorKimlik() {
        return doktorKimlik;
    }

    public void setDoktorKimlik(String doktorKimlik) {
        this.doktorKimlik = doktorKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    
    
}
