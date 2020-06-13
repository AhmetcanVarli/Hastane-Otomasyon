
package database;


public class DbVeriMerkezi extends DbConnection{
    
    protected String ad, soyad, telNo, tcNo;
    protected String DoktorAd, DoktorSoyad, DoktorTcNO;

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

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getDoktorAd() {
        return DoktorAd;
    }

    public void setDoktorAd(String DoktorAd) {
        this.DoktorAd = DoktorAd;
    }

    public String getDoktorSoyad() {
        return DoktorSoyad;
    }

    public void setDoktorSoyad(String DoktorSoyad) {
        this.DoktorSoyad = DoktorSoyad;
    }

    public String getDoktorTcNO() {
        return DoktorTcNO;
    }

    public void setDoktorTcNO(String DoktorTcNO) {
        this.DoktorTcNO = DoktorTcNO;
    }

  
    
    
}
