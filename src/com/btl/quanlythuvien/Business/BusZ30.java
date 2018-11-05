package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;

public class BusZ30 {
    DBConnection dbConn;
    Connection conn;

    public BusZ30(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }
}
