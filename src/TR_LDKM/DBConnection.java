
package TR_LDKM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private Connection conn;
    private final String DBClass = "com.mysql.jdbc.Driver";
    private final String DBURL = "jdbc:mysql://localhost:3306/ldkmfti";
    private final String DBUser = "root";
    private final String DBPassword = "";

    public DBConnection(){
        try {
            Class.forName(DBClass);
            conn = DriverManager.getConnection(DBURL, DBUser, DBPassword);
        } catch (ClassNotFoundException ee) {
            System.out.println("Gagal " + ee);
        } catch (SQLException ex) {
            System.out.println("Koneksi data gagal " + ex);
        }
    }
    
    public Connection getConn(){
        return conn;
    }
    
}
