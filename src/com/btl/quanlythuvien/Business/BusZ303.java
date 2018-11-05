package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;

public class BusZ303 {
    DBConnection dbConn;
    Connection conn;

    public BusZ303(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }}
