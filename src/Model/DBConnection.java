package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {
    Connection conn = null;
    final String user = "root";
    final String pass = "";
    final String cs = "jdbc:mysql://localhost:3306/QuanLyThuVien";
    public DBConnection() {
        try {
            //nap driver
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(cs, user, pass);
            System.out.println("Connecting");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public Connection getConnection() {
        return conn;
    }
    public void CloseConnection() {
        try {
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}