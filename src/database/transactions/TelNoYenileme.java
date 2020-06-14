package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import giris.ayarlar.textAyar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelNoYenileme extends DbConnection implements IBilgiKontrol{
    
    private String telNo = null;

    public boolean telNoYenilendiMi(){
        if(bilgilerGecerliMi()){
            String query = "UPDATE hastalar SET telefon = '" + this.telNo + "'WHERE TcNo = '" + getHesapBilgileri().getTcNo() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
                getHesapBilgileri().setTelNo(this.telNo);
            } catch (SQLException ex) {
                Logger.getLogger(TelNoYenileme.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.telNo == null
                || textAyar.uzunlukAyarı(11, telNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
