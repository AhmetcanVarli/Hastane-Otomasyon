package database;

import database.transactions.HesapBilgileri;

public interface IBilgiKontrol {
    public boolean bilgilerGecerliMi();
    public HesapBilgileri getHesapBilgileri();  
}
