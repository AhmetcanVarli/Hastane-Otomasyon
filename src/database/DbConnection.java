
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;


public class DbConnection {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DOMAIN_NAME = "localhost:3306";
    static final String DB_NAME = "hastaneotomasyonu?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    
    static final String USER = "root";
    static final String PASS = "1234";
    
    protected Connection connection = null;
    protected Statement statement = null;

    public DbConnection() {
        String DB_URL = "jdbc:mysql://" + DOMAIN_NAME + "/" + DB_NAME;
        
        
        try {
            this.connection = DriverManager.getConnection(DB_URL, this.USER, this.PASS);
            System.out.println("Başarılı");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Başarısız");
        }
    }

    public Connection returnConnection(){
        return connection;
    }
    
    
    
}
