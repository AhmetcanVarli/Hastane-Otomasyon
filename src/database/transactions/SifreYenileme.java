package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SifreYenileme extends DbConnection implements IBilgiKontrol{

    private String tcNo = null;
    private String telNo = null;
    private String guvenlikCevap = null;
    private String eskiSifre = null;
    private String yeniSifre = null;

    
    public boolean SifreYenilendiMi(){
        if(bilgilerGecerliMi()){
                String query = "UPDATE hastalar SET Sifre = '" + this.yeniSifre + "'"
                        +"WHERE TcNo = '" + this.tcNo + "' AND Telefon = '" + this.telNo + "'"
                        +"AND GuvenlikCevap = '" + this.guvenlikCevap + "'";
                if(this.eskiSifre != null){
                    query += "AND Sifre = '" + this.eskiSifre + "'";
                }
            try{    
                super.statement = super.connection.createStatement();
                return statement.executeUpdate(query) == 1;
            } catch (SQLException ex) {
                Logger.getLogger(SifreYenileme.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }else{
            return false;
        }
        
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.tcNo == null || this.telNo == null || this.guvenlikCevap == null || this.yeniSifre == null);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
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

    public String getGuvenlikCevap() {
        return guvenlikCevap;
    }

    public void setGuvenlikCevap(String guvenlikCevap) {
        this.guvenlikCevap = guvenlikCevap;
    }

    public String getEskiSifre() {
        return eskiSifre;
    }

    public void setEskiSifre(String eskiSifre) {
        this.eskiSifre = eskiSifre;
    }

    public String getYeniSifre() {
        return yeniSifre;
    }

    public void setYeniSifre(String yeniSifre) {
        this.yeniSifre = yeniSifre;
    }
     
}
