package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.Enity.ItemOne;
import com.btl.quanlythuvien.Enity.Z30;
import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BusZ30 {
    DBConnection dbConn;
    Connection conn;

    public BusZ30(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }
    public void addTable(Z30 z) {
        String sql = "INSERT INTO Z30 VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, z.getZ30_BARCODE());
            pst.setString(2, z.getZ30_REC_KEY());
            pst.setString(3, z.getZ30_SUB_LIBRARY());
            pst.setString(4, z.getZ30_MATERIAL());
            pst.setString(5, z.getZ30_ITEM_STATUS());
            pst.setString(6, z.getZ30_UPDATE_DATE());
            pst.setString(7, z.getZ30_CATALOGER());
            pst.setString(8, z.getZ30_DATE_LAST_RETURN());
            pst.setInt(9, Integer.parseInt(z.getZ30_NO_LOANS()));
            pst.setString(10, z.getZ30_COLLECTION());
            pst.setString(11, z.getZ30_DESCRIPTION());
            pst.setString(12, z.getZ30_ORDER_NUMBER());
            pst.setString(13, z.getZ30_PRICE());
            pst.executeUpdate();
            System.out.println(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean updateTable(Z30 z) {
        boolean bl = false;
        String sql = "Update Z30 SET Z30_REC_KEY=? ,Z30_SUB_LIBRARY=?,Z30_MATERIAL=?,Z30_ITEM_STATUS=?,Z30_UPDATE_DATE=?" +
                ",Z30_CATALOGER=?,Z30_DATE_LAST_RETURN=?,Z30_NO_LOANS=?,Z30_COLLECTION=?," +
                "Z30_DESCRIPTION=?,Z30_ORDER_NUMBER=?,Z30_PRICE=? WHERE Z30_BARCODE=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, z.getZ30_REC_KEY());
            pst.setString(13, z.getZ30_BARCODE());
            pst.setString(2, z.getZ30_SUB_LIBRARY());
            pst.setString(3, z.getZ30_MATERIAL());
            pst.setString(4, z.getZ30_ITEM_STATUS());
            pst.setString(5, z.getZ30_UPDATE_DATE());
            pst.setString(6, z.getZ30_CATALOGER());
            pst.setString(7, z.getZ30_DATE_LAST_RETURN());
            pst.setString(8, z.getZ30_NO_LOANS());
            pst.setString(9, z.getZ30_COLLECTION());
            pst.setString(10, z.getZ30_DESCRIPTION());
            pst.setString(11, z.getZ30_ORDER_NUMBER());
            pst.setString(12, z.getZ30_PRICE());
            pst.executeUpdate();
            pst.close();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bl;
    }

    public boolean deleteTable(String Z30_REC_KEY) {
        boolean bl = false;
        String sql = "DELETE FROM Z30 WHERE Z30_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Z30_REC_KEY);
            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bl;
    }

    public ArrayList<Z30> getAllTable() {
        ArrayList<Z30> list = new ArrayList<>();
        String sql = "SELECT * FROM Z30";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Z30_REC_KEY=rs.getString("Z30_REC_KEY");
                String Z30_BARCODE=rs.getString("Z30_BARCODE");
                String Z30_SUB_LIBRARY=rs.getString("Z30_SUB_LIBRARY");
                String Z30_MATERIAL=rs.getString("Z30_MATERIAL");
                String Z30_ITEM_STATUS=rs.getString("Z30_ITEM_STATUS");
                String Z30_UPDATE_DATE=rs.getString("Z30_UPDATE_DATE");
                String Z30_CATALOGER=rs.getString("Z30_CATALOGER");
                String Z30_DATE_LAST_RETURN=rs.getString("Z30_DATE_LAST_RETURN");
                String Z30_NO_LOANS=rs.getString("Z30_NO_LOANS");
                String Z30_COLLECTION=rs.getString("Z30_COLLECTION");
                String Z30_DESCRIPTION=rs.getString("Z30_DESCRIPTION");
                String Z30_ORDER_NUMBER=rs.getString("Z30_ORDER_NUMBER");
                String Z30_PRICE=rs.getString("Z30_PRICE");
                Z30 z = new Z30(Z30_REC_KEY,Z30_BARCODE,Z30_SUB_LIBRARY,Z30_MATERIAL,
                        Z30_ITEM_STATUS,Z30_UPDATE_DATE,Z30_CATALOGER,Z30_DATE_LAST_RETURN,
                        Z30_NO_LOANS,Z30_COLLECTION,Z30_DESCRIPTION,Z30_ORDER_NUMBER,Z30_PRICE);
                list.add(z);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public ArrayList<ItemOne> getOneTable_REC_KEY(String Z_ID) {
        ArrayList<ItemOne> list = new ArrayList<>();
        String sql = "SELECT Z30_REC_KEY,Z30_BARCODE,Z00R_TITLE,Z00R_AUTHOR,Z30_ITEM_STATUS,Z30_PRICE FROM z30,z00r " +
                "WHERE z30.Z30_REC_KEY=z00r.Z00r_DOC_NUMBER and z30.Z30_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Z_ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String Z30_REC_KEY=rs.getString("Z30_REC_KEY");
                String Z30_BARCODE=rs.getString("Z30_BARCODE");
                String Z00R_TITLE=rs.getString("Z00R_TITLE");
                String Z00R_AUTHOR=rs.getString("Z00R_AUTHOR");
                String Z30_ITEM_STATUS=rs.getString("Z30_ITEM_STATUS");
                float Z30_PRICE=rs.getFloat("Z30_PRICE");

                ItemOne z = new ItemOne(Z30_REC_KEY,Z30_BARCODE,Z00R_TITLE,Z00R_AUTHOR,Z30_ITEM_STATUS,Z30_PRICE);
                list.add(z);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
