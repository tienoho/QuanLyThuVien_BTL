package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.Enity.Z00;
import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BusZ00 {
    DBConnection dbConn;
    Connection conn;

    public BusZ00(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }

    public boolean addTable(Z00 z) {
        boolean bl = false;
        String sql = "INSERT INTO Z00 VALUE(?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, z.getZ00_DOC_NUMBER());
            pst.setInt(2, z.getZ00_NO_LINES());
            pst.setInt(3, z.getZ00_DATA_LEN());
            pst.setString(4, z.getZ00_DATA());
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return bl;
    }

    public boolean updateTable(Z00 z) {
        boolean bl = false;
        String sql = "Update Z00 SET Z00_NO_LINES=?,Z00_DATA_LEN=?,Z00_DATA=? WHERE Z00_DOC_NUMBER=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(4, z.getZ00_DOC_NUMBER());
            pst.setInt(1, z.getZ00_NO_LINES());
            pst.setInt(2, z.getZ00_DATA_LEN());
            pst.setString(3, z.getZ00_DATA());
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return bl;
    }

    public boolean deleteTable(String Z00_DOC_NUMBER) {
        boolean bl = false;
        String sql = "DELETE FROM Z00 WHERE Z00_DOC_NUMBER=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Z00_DOC_NUMBER);
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return bl;
    }

    public ArrayList<Z00> getAllTable() {
        ArrayList<Z00> list = new ArrayList<>();
        String sql = "SELECT * FROM z00";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Z00_DOC_NUMBER = rs.getString("Z00_DOC_NUMBER");
                int Z00_NO_LINES = rs.getInt("Z00_NO_LINES");
                int Z00_DATA_LEN = rs.getInt("Z00_DATA_LEN");
                String Z00_DATA = rs.getString("Z00_DATA");
                Z00 z = new Z00(Z00_DOC_NUMBER, Z00_NO_LINES, Z00_DATA_LEN, Z00_DATA);
                list.add(z);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return list;
    }

    public ArrayList<Z00> getOneTable(String Z_ID) {
        ArrayList<Z00> list = new ArrayList<>();
        String sql = "SELECT * FROM z00 WHERE Z00_DOC_NUMBER=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Z_ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String Z00_DOC_NUMBER = rs.getString("Z00_DOC_NUMBER");
                int Z00_NO_LINES = rs.getInt("Z00_NO_LINES");
                int Z00_DATA_LEN = rs.getInt("Z00_DATA_LEN");
                String Z00_DATA = rs.getString("Z00_DATA");
                Z00 z = new Z00(Z00_DOC_NUMBER, Z00_NO_LINES, Z00_DATA_LEN, Z00_DATA);
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
