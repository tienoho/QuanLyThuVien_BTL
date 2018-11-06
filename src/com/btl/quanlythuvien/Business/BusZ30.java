package com.btl.quanlythuvien.Business;

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
    public boolean addTable(Z30 z) {
        boolean bl = false;
        String sql = "INSERT INTO Z30 VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, z.getZ30_REC_KEY());
            pst.setString(2, z.getZ30_BARCODE());
            pst.setString(3, z.getZ30_SUB_LIBRARY());
            pst.setString(4, z.getZ30_MATERIAL());
            pst.setString(5, z.getZ30_ITEM_STATUS());
            pst.setString(6, z.getZ30_UPDATE_DATE());
            pst.setString(7, z.getZ30_CATALOGER());
            pst.setString(8, z.getZ30_DATE_LAST_RETURN());
            pst.setString(9, z.getZ30_HOUR_LAST_RETURN());
            pst.setInt(10, z.getZ30_NO_LOANS());
            pst.setString(11, z.getZ30_COLLECTION());
            pst.setString(12, z.getZ30_DESCRIPTION());
            pst.setString(13, z.getZ30_NOTE_OPAC());
            pst.setString(14, z.getZ30_NOTE_CIRCULATION());
            pst.setString(15, z.getZ30_NOTE_INTERNAL());
            pst.setString(16, z.getZ30_ORDER_NUMBER());
            pst.setString(17, z.getZ30_INVENTORY_NUMBER());
            pst.setString(18, z.getZ30_INVENTORY_NUMBER_DATE());
            pst.setString(19, z.getZ30_LAST_SHELF_REPORT_DATE());
            pst.setString(20, z.getZ30_PRICE());
            pst.setString(21, z.getZ30_REC_KEY_2());
            pst.setString(22, z.getZ30_REC_KEY_3());
            pst.setString(23, z.getZ30_PAGES());
            pst.setString(24, z.getZ30_ISSUE_DATE());
            pst.setString(25, z.getZ30_EXPECTED_ARRIVAL_DATE());
            pst.setString(26, z.getZ30_ARRIVAL_DATE());
            pst.setString(27, z.getZ30_ITEM_STATISTIC());
            pst.setString(28, z.getZ30_ITEM_PROCESS_STATUS());

            pst.executeUpdate();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bl;
    }

    public boolean updateTable(Z30 z) {
        boolean bl = false;
        String sql = "Update Z30 SET Z30_BARCODE=?,Z30_SUB_LIBRARY=?,Z30_MATERIAL=?,Z30_ITEM_STATUS=?,Z30_UPDATE_DATE=?" +
                ",Z30_CATALOGER=?,Z30_DATE_LAST_RETURN=?,Z30_HOUR_LAST_RETURN=?,Z30_NO_LOANS=?,Z30_COLLECTION=?," +
                "Z30_DESCRIPTION=?,Z30_NOTE_OPAC=?,Z30_NOTE_CIRCULATION=?,Z30_NOTE_INTERNAL=?,Z30_ORDER_NUMBER=?,Z30_INVENTORY_NUMBER=?" +
                ",Z30_INVENTORY_NUMBER_DATE=?,Z30_LAST_SHELF_REPORT_DATE=?,Z30_PRICE=?,Z30_REC_KEY_2=?,Z30_REC_KEY_3=?,Z30_PAGES=?," +
                "Z30_ISSUE_DATE=?,Z30_EXPECTED_ARRIVAL_DATE=?,Z30_ARRIVAL_DATE=?,Z30_ITEM_STATISTIC=?,Z30_ITEM_PROCESS_STATUS=?" +
                "WHERE Z30_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(28, z.getZ30_REC_KEY());
            pst.setString(1, z.getZ30_BARCODE());
            pst.setString(2, z.getZ30_SUB_LIBRARY());
            pst.setString(3, z.getZ30_MATERIAL());
            pst.setString(4, z.getZ30_ITEM_STATUS());
            pst.setString(5, z.getZ30_UPDATE_DATE());
            pst.setString(6, z.getZ30_CATALOGER());
            pst.setString(7, z.getZ30_DATE_LAST_RETURN());
            pst.setString(8, z.getZ30_HOUR_LAST_RETURN());
            pst.setInt(9, z.getZ30_NO_LOANS());
            pst.setString(10, z.getZ30_COLLECTION());
            pst.setString(11, z.getZ30_DESCRIPTION());
            pst.setString(12, z.getZ30_NOTE_OPAC());
            pst.setString(13, z.getZ30_NOTE_CIRCULATION());
            pst.setString(14, z.getZ30_NOTE_INTERNAL());
            pst.setString(15, z.getZ30_ORDER_NUMBER());
            pst.setString(16, z.getZ30_INVENTORY_NUMBER());
            pst.setString(17, z.getZ30_INVENTORY_NUMBER_DATE());
            pst.setString(18, z.getZ30_LAST_SHELF_REPORT_DATE());
            pst.setString(19, z.getZ30_PRICE());
            pst.setString(20, z.getZ30_REC_KEY_2());
            pst.setString(21, z.getZ30_REC_KEY_3());
            pst.setString(22, z.getZ30_PAGES());
            pst.setString(23, z.getZ30_ISSUE_DATE());
            pst.setString(24, z.getZ30_EXPECTED_ARRIVAL_DATE());
            pst.setString(25, z.getZ30_ARRIVAL_DATE());
            pst.setString(26, z.getZ30_ITEM_STATISTIC());
            pst.setString(27, z.getZ30_ITEM_PROCESS_STATUS());
            pst.executeUpdate();
            pst.close();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            dbConn.CloseConnection();
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
        }finally {
            dbConn.CloseConnection();
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
                String Z30_HOUR_LAST_RETURN=rs.getString("Z30_HOUR_LAST_RETURN");
                int Z30_NO_LOANS=rs.getInt("Z30_NO_LOANS");
                String Z30_COLLECTION=rs.getString("Z30_COLLECTION");
                String Z30_DESCRIPTION=rs.getString("Z30_DESCRIPTION");
                String Z30_NOTE_OPAC=rs.getString("Z30_NOTE_OPAC");
                String Z30_NOTE_CIRCULATION=rs.getString("Z30_NOTE_CIRCULATION");
                String Z30_NOTE_INTERNAL=rs.getString("Z30_NOTE_INTERNAL");
                String Z30_ORDER_NUMBER=rs.getString("Z30_ORDER_NUMBER");
                String Z30_INVENTORY_NUMBER=rs.getString("Z30_INVENTORY_NUMBER");
                String Z30_INVENTORY_NUMBER_DATE=rs.getString("Z30_INVENTORY_NUMBER_DATE");
                String Z30_LAST_SHELF_REPORT_DATE=rs.getString("Z30_LAST_SHELF_REPORT_DATE");
                String Z30_PRICE=rs.getString("Z30_PRICE");
                String Z30_REC_KEY_2=rs.getString("Z30_REC_KEY_2");
                String Z30_REC_KEY_3=rs.getString("Z30_REC_KEY_3");
                String Z30_PAGES=rs.getString("Z30_PAGES");
                String Z30_ISSUE_DATE=rs.getString("Z30_ISSUE_DATE");
                String Z30_EXPECTED_ARRIVAL_DATE=rs.getString("Z30_EXPECTED_ARRIVAL_DATE");
                String Z30_ARRIVAL_DATE=rs.getString("Z30_ARRIVAL_DATE");
                String Z30_ITEM_STATISTIC=rs.getString("Z30_ITEM_STATISTIC");
                String Z30_ITEM_PROCESS_STATUS=rs.getString("Z30_ITEM_PROCESS_STATUS");

                Z30 z = new Z30(Z30_REC_KEY,Z30_BARCODE,Z30_SUB_LIBRARY,Z30_MATERIAL,Z30_ITEM_STATUS,Z30_UPDATE_DATE,
                        Z30_CATALOGER,Z30_DATE_LAST_RETURN,Z30_HOUR_LAST_RETURN,Z30_NO_LOANS,Z30_COLLECTION,Z30_DESCRIPTION
                        ,Z30_NOTE_OPAC,Z30_NOTE_CIRCULATION,Z30_NOTE_INTERNAL,Z30_ORDER_NUMBER,Z30_INVENTORY_NUMBER,
                        Z30_INVENTORY_NUMBER_DATE,Z30_LAST_SHELF_REPORT_DATE,Z30_PRICE,Z30_REC_KEY_2
                        ,Z30_REC_KEY_3,Z30_PAGES,Z30_ISSUE_DATE,Z30_EXPECTED_ARRIVAL_DATE,Z30_ARRIVAL_DATE,
                        Z30_ITEM_STATISTIC,Z30_ITEM_PROCESS_STATUS );
                list.add(z);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            dbConn.CloseConnection();
        }
        return list;
    }

    public ArrayList<Z30> getOneTable(String Z_ID) {
        ArrayList<Z30> list = new ArrayList<>();
        String sql = "SELECT * FROM z30 WHERE Z30_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Z_ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String Z30_REC_KEY=rs.getString("Z30_REC_KEY");
                String Z30_BARCODE=rs.getString("Z30_BARCODE");
                String Z30_SUB_LIBRARY=rs.getString("Z30_SUB_LIBRARY");
                String Z30_MATERIAL=rs.getString("Z30_MATERIAL");
                String Z30_ITEM_STATUS=rs.getString("Z30_ITEM_STATUS");
                String Z30_UPDATE_DATE=rs.getString("Z30_UPDATE_DATE");
                String Z30_CATALOGER=rs.getString("Z30_CATALOGER");
                String Z30_DATE_LAST_RETURN=rs.getString("Z30_DATE_LAST_RETURN");
                String Z30_HOUR_LAST_RETURN=rs.getString("Z30_HOUR_LAST_RETURN");
                int Z30_NO_LOANS=rs.getInt("Z30_NO_LOANS");
                String Z30_COLLECTION=rs.getString("Z30_COLLECTION");
                String Z30_DESCRIPTION=rs.getString("Z30_DESCRIPTION");
                String Z30_NOTE_OPAC=rs.getString("Z30_NOTE_OPAC");
                String Z30_NOTE_CIRCULATION=rs.getString("Z30_NOTE_CIRCULATION");
                String Z30_NOTE_INTERNAL=rs.getString("Z30_NOTE_INTERNAL");
                String Z30_ORDER_NUMBER=rs.getString("Z30_ORDER_NUMBER");
                String Z30_INVENTORY_NUMBER=rs.getString("Z30_INVENTORY_NUMBER");
                String Z30_INVENTORY_NUMBER_DATE=rs.getString("Z30_INVENTORY_NUMBER_DATE");
                String Z30_LAST_SHELF_REPORT_DATE=rs.getString("Z30_LAST_SHELF_REPORT_DATE");
                String Z30_PRICE=rs.getString("Z30_PRICE");
                String Z30_REC_KEY_2=rs.getString("Z30_REC_KEY_2");
                String Z30_REC_KEY_3=rs.getString("Z30_REC_KEY_3");
                String Z30_PAGES=rs.getString("Z30_PAGES");
                String Z30_ISSUE_DATE=rs.getString("Z30_ISSUE_DATE");
                String Z30_EXPECTED_ARRIVAL_DATE=rs.getString("Z30_EXPECTED_ARRIVAL_DATE");
                String Z30_ARRIVAL_DATE=rs.getString("Z30_ARRIVAL_DATE");
                String Z30_ITEM_STATISTIC=rs.getString("Z30_ITEM_STATISTIC");
                String Z30_ITEM_PROCESS_STATUS=rs.getString("Z30_ITEM_PROCESS_STATUS");

                Z30 z = new Z30(Z30_REC_KEY,Z30_BARCODE,Z30_SUB_LIBRARY,Z30_MATERIAL,Z30_ITEM_STATUS,Z30_UPDATE_DATE,
                        Z30_CATALOGER,Z30_DATE_LAST_RETURN,Z30_HOUR_LAST_RETURN,Z30_NO_LOANS,Z30_COLLECTION,Z30_DESCRIPTION
                        ,Z30_NOTE_OPAC,Z30_NOTE_CIRCULATION,Z30_NOTE_INTERNAL,Z30_ORDER_NUMBER,Z30_INVENTORY_NUMBER,
                        Z30_INVENTORY_NUMBER_DATE,Z30_LAST_SHELF_REPORT_DATE,Z30_PRICE,Z30_REC_KEY_2
                        ,Z30_REC_KEY_3,Z30_PAGES,Z30_ISSUE_DATE,Z30_EXPECTED_ARRIVAL_DATE,Z30_ARRIVAL_DATE,
                        Z30_ITEM_STATISTIC,Z30_ITEM_PROCESS_STATUS );
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
