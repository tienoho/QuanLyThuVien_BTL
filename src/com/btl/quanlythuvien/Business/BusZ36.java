package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;

public class BusZ36 {
    DBConnection dbConn;
    Connection conn;

    public BusZ36(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }
}
