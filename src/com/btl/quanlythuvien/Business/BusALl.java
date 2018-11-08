package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.Enity.type;
import com.btl.quanlythuvien.model.DBConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BusALl {
    DBConnection dbConn;
    Connection conn;

    public BusALl(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }

    public boolean deleteTable(String table, String column, String KEY) {
        boolean bl = false;
        String sql = "DELETE FROM " + table + " WHERE " + column + "=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, KEY);
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            dbConn.CloseConnection();
        }
        return bl;
    }

    public ArrayList<type> getAllTable(JComboBox jcb, String sql) {
        ArrayList<type> list = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String symbol = rs.getString(2);
                String content = rs.getString(3);
                type t = new type(symbol, content);
                list.add(t);
                jcb.addItem(content);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public int getCountZ00(String sql) {
        //String sql = "SELECT count(*) FROM z00";
        int count=0;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                count = Integer.parseInt(rs.getString(1));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return count;
    }
}
