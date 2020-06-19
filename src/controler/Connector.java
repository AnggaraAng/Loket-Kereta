
package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector{
     public String sDbDriver = "com.mysql.jdbc.Driver";
    public String sDbUrl = "jdbc:mysql://localhost:3306/loket";
    public String sDbUser = "root";
    public String sDbPass = "";
    private Connection conn;
    
    public Connector() throws SQLException
    {
        try{
        conn = DriverManager.getConnection(sDbUrl, sDbUser, sDbPass);
        }
        catch(SQLException e){
            System.out.println("Koneksi Gagal" + e);
        }
    }

    public Connection getConn() {
        return conn;
    }
    
}
