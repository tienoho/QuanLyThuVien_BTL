package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.Enity.Z36;
import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BusZ36 {
    DBConnection dbConn;
    Connection conn;

    public BusZ36(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }

    public boolean addTable(Z36 z) {
        boolean bl = false;
        String sql = "INSERT INTO Z36 VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, z.getZ36_ID());
            pst.setString(2, z.getZ36_REC_KEY());
            pst.setString(3, z.getZ36_BARCODE());
            pst.setString(4, z.getZ36_PARTRON_ID());
            pst.setString(5, z.getZ36_NUMBER());
            pst.setString(6, z.getZ36_SUB_LIBRARY());
            pst.setString(7, z.getZ36_STATUS());
            pst.setString(8, z.getZ36_LOAN_DATE());
            pst.setString(9, z.getZ36_DUE_DATE());
            pst.setString(10, z.getZ36_RETURNED_DATE());
            pst.setString(11, z.getZ36_ITEM_STATUS());
            pst.setString(12, z.getZ36_NOTE_1());
            pst.setFloat(13, z.getZ36_MONEY());
            pst.setFloat(14, z.getZ36_MONEY_FINE());
            pst.setString(15, z.getZ36_PROCESS_STATUS());
            pst.executeUpdate();
            pst.close();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bl;
    }

    public boolean updateTable(Z36 z) {
        boolean bl = false;
        String sql = "Update Z36 SET  Z36_NUMBER=? ,Z36_SUB_LIBRARY=?,Z36_STATUS=?,Z36_DUE_DATE=?," +
                "Z36_RETURNED_DATE=?,Z36_ITEM_STATUS=?,Z36_NOTE_1=?,Z36_MONEY=?,Z36_MONEY_FINE=?," +
                "Z36_PROCESS_STATUS=? WHERE Z36_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(11, z.getZ36_REC_KEY());
            pst.setString(1, z.getZ36_NUMBER());
            pst.setString(2, z.getZ36_SUB_LIBRARY());
            pst.setString(3, z.getZ36_STATUS());
            pst.setString(4, z.getZ36_DUE_DATE());
            pst.setString(5, z.getZ36_RETURNED_DATE());;
            pst.setString(6, z.getZ36_ITEM_STATUS());
            pst.setString(7, z.getZ36_NOTE_1());
            pst.setFloat(8, z.getZ36_MONEY());
            pst.setFloat(9, z.getZ36_MONEY_FINE());
            pst.setString(10, z.getZ36_PROCESS_STATUS());
            pst.executeUpdate();
            pst.close();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bl;
    }

    public ArrayList<Z36> getAllTable() {
        ArrayList<Z36> list = new ArrayList<>();
        String sql = "SELECT * FROM Z36";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Z36_REC_KEY = rs.getString("Z36_REC_KEY");
                String Z36_ID = rs.getString("Z36_ID");
                String Z36_BARCODE = rs.getString("Z36_BARCODE");
                String Z36_PARTRON_ID = rs.getString("Z36_PARTRON_ID");
                String Z36_NUMBER = rs.getString("Z36_NUMBER");
                String Z36_SUB_LIBRARY = rs.getString("Z36_SUB_LIBRARY");
                String Z36_STATUS = rs.getString("Z36_STATUS");
                String Z36_LOAN_DATE = rs.getString("Z36_LOAN_DATE");
                String Z36_DUE_DATE = rs.getString("Z36_DUE_DATE");
                String Z36_RETURNED_DATE = rs.getString("Z36_RETURNED_DATE");
                String Z36_ITEM_STATUS = rs.getString("Z36_ITEM_STATUS");
                String Z36_NOTE_1 = rs.getString("Z36_NOTE_1");
                float Z36_MONEY = rs.getFloat("Z36_MONEY");
                float Z36_MONEY_FINE = rs.getFloat("Z36_MONEY_FINE");
                String Z36_PROCESS_STATUS = rs.getString("Z36_PROCESS_STATUS");

                Z36 z = new Z36(Z36_ID,Z36_REC_KEY,Z36_BARCODE, Z36_PARTRON_ID, Z36_NUMBER, Z36_SUB_LIBRARY, Z36_STATUS, Z36_LOAN_DATE,
                         Z36_DUE_DATE, Z36_RETURNED_DATE, Z36_ITEM_STATUS,
                        Z36_NOTE_1,Z36_MONEY,Z36_MONEY_FINE, Z36_PROCESS_STATUS);
                list.add(z);
            }
            rs.close();
            st.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public ArrayList<Z36> getOneTable(String Z_ID) {
        ArrayList<Z36> list = new ArrayList<>();
        String sql = "SELECT * FROM z36 WHERE Z36_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Z_ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String Z36_REC_KEY = rs.getString("Z36_REC_KEY");
                String Z36_ID = rs.getString("Z36_ID");
                String Z36_BARCODE = rs.getString("Z36_BARCODE");
                String Z36_PARTRON_ID = rs.getString("Z36_PARTRON_ID");
                String Z36_NUMBER = rs.getString("Z36_NUMBER");
                String Z36_SUB_LIBRARY = rs.getString("Z36_SUB_LIBRARY");
                String Z36_STATUS = rs.getString("Z36_STATUS");
                String Z36_LOAN_DATE = rs.getString("Z36_LOAN_DATE");
                String Z36_DUE_DATE = rs.getString("Z36_DUE_DATE");
                String Z36_RETURNED_DATE = rs.getString("Z36_RETURNED_DATE");
                String Z36_ITEM_STATUS = rs.getString("Z36_ITEM_STATUS");
                String Z36_NOTE_1 = rs.getString("Z36_NOTE_1");
                float Z36_MONEY = rs.getFloat("Z36_MONEY");
                float Z36_MONEY_FINE = rs.getFloat("Z36_MONEY_FINE");
                String Z36_PROCESS_STATUS = rs.getString("Z36_PROCESS_STATUS");

                Z36 z = new Z36(Z36_ID,Z36_REC_KEY,Z36_BARCODE, Z36_PARTRON_ID, Z36_NUMBER, Z36_SUB_LIBRARY, Z36_STATUS, Z36_LOAN_DATE,
                        Z36_DUE_DATE, Z36_RETURNED_DATE, Z36_ITEM_STATUS,
                        Z36_NOTE_1,Z36_MONEY,Z36_MONEY_FINE, Z36_PROCESS_STATUS);
                list.add(z);
            }
            rs.close();
            pst.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
}
