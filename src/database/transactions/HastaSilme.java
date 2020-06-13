package database.transactions;

import database.DbConnection;
import database.IBilgiKontrol;
import giris.KullanıcıAyarları;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HastaSilme extends DbConnection implements IBilgiKontrol{
    
    KullanıcıAyarları kullanıcıAyarlarıObject = new KullanıcıAyarları();
    
    private String hasta = kullanıcıAyarlarıObject.getTcKimlikText().getText();
    
    public boolean kayıtSil(){
        if(bilgilerGecerliMi()){
           String query = "DELETE FROM hastalar WHERE tc_no = '" + this.hasta + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.execute(query); 
            } catch (SQLException ex) {
                Logger.getLogger(HastaSilme.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }else{
            return false;
        }  
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.hasta == null);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
}
