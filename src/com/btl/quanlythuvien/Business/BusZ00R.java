package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.Enity.Z00R;
import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BusZ00R {
    DBConnection dbConn;
    Connection conn;

    public BusZ00R(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }
    public boolean addTable(Z00R z) {
        boolean bl = false;
        String sql = "INSERT INTO Z00R VALUE(?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, z.getZ00R_DOC_NUMBER());
            pst.setString(2, z.getZ00R_TITLE());
            pst.setString(3, z.getZ00R_AUTHOR());
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return bl;
    }

    public boolean updateTable(Z00R z) {
        boolean bl = false;
        String sql = "Update Z00R SET Z00R_TITLES=?,Z00R_AUTHOR=? WHERE Z00R_DOC_NUMBER=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(3, z.getZ00R_DOC_NUMBER());
            pst.setString(1, z.getZ00R_TITLE());
            pst.setString(2, z.getZ00R_AUTHOR());
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return bl;
    }
    public ArrayList<Z00R> getAllTable() {
        ArrayList<Z00R> list = new ArrayList<>();
        String sql = "SELECT * FROM Z00R";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Z00R_DOC_NUMBER = rs.getString("Z00R_DOC_NUMBER");
                String Z00R_TITLES = rs.getString("Z00R_TITLES");
                String Z00R_AUTHOR = rs.getString("Z00R_AUTHOR");
                Z00R z = new Z00R(Z00R_DOC_NUMBER, Z00R_TITLES, Z00R_AUTHOR);
                list.add(z);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return list;
    }
}
