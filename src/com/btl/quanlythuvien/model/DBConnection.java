package com.btl.quanlythuvien.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private Connection conn = null;
    private final String user = "root";
    private final String pass = "root";
    private final String cs = "jdbc:mysql://192.168.1.221:3306/QuanLyThuVien";
    //private final String cs = "jdbc:mysql://localhost:3306/QuanLyThuVien";

    public DBConnection() {
        try {
            //nap driver
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(cs, user, pass);
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