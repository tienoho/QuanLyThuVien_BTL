package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BusALl {
    DBConnection dbConn;
    Connection conn;

    public BusALl(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }
    public boolean deleteTable(String table,String column ,String KEY) {
        boolean bl = false;
        String sql = "DELETE FROM ? WHERE Z30_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, table);
            pst.setString(2, column);
            pst.setString(2, KEY);
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return bl;
    }
}
