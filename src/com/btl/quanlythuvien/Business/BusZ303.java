package com.btl.quanlythuvien.Business;

import com.btl.quanlythuvien.Enity.Z303;
import com.btl.quanlythuvien.model.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BusZ303 {
    DBConnection dbConn;
    Connection conn;

    public BusZ303(DBConnection dbConn) {
        this.dbConn = dbConn;
        conn = dbConn.getConnection();
    }

    public boolean addTable(Z303 z) {
        boolean bl = false;
        String sql = "INSERT INTO Z303 VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, z.getZ303_REC_KEY());
            pst.setString(2, z.getZ303_BARCODE());
            pst.setString(3, z.getZ303_NAME_KEY());
            pst.setString(4, z.getZ303_USER_TYPE());
            pst.setString(5, z.getZ303_USER_LIBRARY());
            pst.setString(6, z.getZ303_OPEN_DATE());
            pst.setString(7, z.getZ303_UPDATE_DATE());
            pst.setString(8, z.getZ303_CON_LNG());
            pst.setString(9, z.getZ303_NAME());
            pst.setString(10, z.getZ303_TITLE());
            pst.setString(11, z.getZ303_DELINQ_1());
            pst.setString(12, z.getZ303_DELINQ_N_1());
            pst.setString(13, z.getZ303_DELINQ_1_UPDATE_DATE());
            pst.setString(14, z.getZ303_DELINQ_1_CAT_NAME());
            pst.setString(15, z.getZ303_PROFILE_ID());
            pst.setString(16, z.getZ303_FIELD_1());
            pst.setString(17, z.getZ303_FIELD_2());
            pst.setString(18, z.getZ303_FIELD_3());
            pst.setString(19, z.getZ303_NOTE_1());
            pst.setString(20, z.getZ303_NOTE_2());
            pst.setString(21, z.getZ303_SALUTATION());
            pst.setString(22, z.getZ303_BIRTH_DATE());
            pst.setString(23,z.getZ303_PLACE_BIRTH());
            pst.setString(24, z.getZ303_GENDER());
            pst.setString(25, z.getZ303_GENDER());
            pst.setString(26, z.getZ303_UPD_TIME_STAMP());
            pst.executeUpdate();
            pst.close();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bl;
    }

    public boolean updateTable(Z303 z) {
        boolean bl = false;
        String sql = "Update Z303 SET  Z303_NAME_KEY=?,Z303_USER_TYPE=?,Z303_USER_LIBRARY=?," +
                "Z303_UPDATE_DATE=?,Z303_CON_LNG=?,Z303_NAME=?,Z303_TITLE=?," +
                "Z303_DELINQ_1=?,Z303_DELINQ_N_1=?,Z303_DELINQ_1_UPDATE_DATE=?,\n" +
                "Z303_DELINQ_1_CAT_NAME=?,Z303_PROFILE_ID=?,Z303_FIELD_1=?," +
                "Z303_FIELD_2=?,Z303_FIELD_3=?,Z303_NOTE_1=?,Z303_NOTE_2=?," +
                "Z303_SALUTATION=?,Z303_BIRTH_DATE=?,Z303_PLACE_BIRTH=?,Z303_GENDER=?,Z303_IMAGE=?,Z303_UPD_TIME_STAMP=? WHERE Z303_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(24, z.getZ303_REC_KEY());
            pst.setString(1, z.getZ303_NAME_KEY());
            pst.setString(2, z.getZ303_USER_TYPE());
            pst.setString(3, z.getZ303_USER_LIBRARY());
            pst.setString(4, z.getZ303_UPDATE_DATE());
            pst.setString(5, z.getZ303_CON_LNG());
            pst.setString(6, z.getZ303_NAME());
            pst.setString(7, z.getZ303_TITLE());
            pst.setString(8, z.getZ303_DELINQ_1());
            pst.setString(9, z.getZ303_DELINQ_N_1());
            pst.setString(10, z.getZ303_DELINQ_1_UPDATE_DATE());
            pst.setString(11, z.getZ303_DELINQ_1_CAT_NAME());
            pst.setString(12, z.getZ303_PROFILE_ID());
            pst.setString(13, z.getZ303_FIELD_1());
            pst.setString(14, z.getZ303_FIELD_2());
            pst.setString(15, z.getZ303_FIELD_3());
            pst.setString(16, z.getZ303_NOTE_1());
            pst.setString(17, z.getZ303_NOTE_2());
            pst.setString(18, z.getZ303_SALUTATION());
            pst.setString(19, z.getZ303_BIRTH_DATE());
            pst.setString(20,z.getZ303_PLACE_BIRTH());
            pst.setString(21, z.getZ303_GENDER());
            pst.setString(22, z.getZ303_IMAGE());
            pst.setString(23, z.getZ303_UPD_TIME_STAMP());
            pst.executeUpdate();
            pst.close();
            bl = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return bl;
    }

    public ArrayList<Z303> getAllTable() {
        ArrayList<Z303> list = new ArrayList<>();
        String sql = "SELECT * FROM Z303";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String Z303_REC_KEY = rs.getString("Z303_REC_KEY");
                String Z303_BARCODE = rs.getString("Z303_BARCODE");
                String Z303_NAME_KEY = rs.getString("Z303_NAME_KEY");
                String Z303_USER_TYPE = rs.getString("Z303_USER_TYPE");
                String Z303_USER_LIBRARY = rs.getString("Z303_USER_LIBRARY");
                String Z303_OPEN_DATE = rs.getString("Z303_OPEN_DATE");
                String Z303_UPDATE_DATE = rs.getString("Z303_UPDATE_DATE");
                String Z303_CON_LNG = rs.getString("Z303_CON_LNG");
                String Z303_NAME = rs.getString("Z303_NAME");
                String Z303_TITLE = rs.getString("Z303_TITLE");
                String Z303_DELINQ_1 = rs.getString("Z303_DELINQ_1");
                String Z303_DELINQ_N_1 = rs.getString("Z303_DELINQ_N_1");
                String Z303_DELINQ_1_UPDATE_DATE = rs.getString("Z303_DELINQ_1_UPDATE_DATE");
                String Z303_DELINQ_1_CAT_NAME = rs.getString("Z303_DELINQ_1_CAT_NAME");
                String Z303_PROFILE_ID = rs.getString("Z303_PROFILE_ID");
                String Z303_FIELD_1 = rs.getString("Z303_FIELD_1");
                String Z303_FIELD_2 = rs.getString("Z303_FIELD_2");
                String Z303_FIELD_3 = rs.getString("Z303_FIELD_3");
                String Z303_NOTE_1 = rs.getString("Z303_NOTE_1");
                String Z303_NOTE_2 = rs.getString("Z303_NOTE_2");
                String Z303_SALUTATION = rs.getString("Z303_SALUTATION");
                String Z303_BIRTH_DATE = rs.getString("Z303_BIRTH_DATE");
                String Z303_PLACE_BIRTH = rs.getString("Z303_PLACE_BIRTH");
                String Z303_GENDER = rs.getString("Z303_GENDER");
                String Z303_IMAGE= rs.getString("Z303_IMAGE");
                String Z303_UPD_TIME_STAMP = rs.getString("Z303_UPD_TIME_STAMP");
                Z303 z = new Z303(Z303_REC_KEY,Z303_BARCODE, Z303_NAME_KEY, Z303_USER_TYPE, Z303_USER_LIBRARY, Z303_OPEN_DATE, Z303_UPDATE_DATE, Z303_CON_LNG, Z303_NAME, Z303_TITLE, Z303_DELINQ_1, Z303_DELINQ_N_1, Z303_DELINQ_1_UPDATE_DATE,
                        Z303_DELINQ_1_CAT_NAME, Z303_PROFILE_ID, Z303_FIELD_1, Z303_FIELD_2, Z303_FIELD_3, Z303_NOTE_1, Z303_NOTE_2, Z303_SALUTATION,
                        Z303_BIRTH_DATE,Z303_PLACE_BIRTH, Z303_GENDER,Z303_IMAGE, Z303_UPD_TIME_STAMP);
                list.add(z);
            }
            rs.close();
            st.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public ArrayList<Z303> getOneTable(String Z_ID) {
        ArrayList<Z303> list = new ArrayList<>();
        String sql = "SELECT * FROM Z303 WHERE Z303_REC_KEY=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Z_ID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String Z303_REC_KEY = rs.getString("Z303_REC_KEY");
                String Z303_BARCODE = rs.getString("Z303_BARCODE");
                String Z303_NAME_KEY = rs.getString("Z303_NAME_KEY");
                String Z303_USER_TYPE = rs.getString("Z303_USER_TYPE");
                String Z303_USER_LIBRARY = rs.getString("Z303_USER_LIBRARY");
                String Z303_OPEN_DATE = rs.getString("Z303_OPEN_DATE");
                String Z303_UPDATE_DATE = rs.getString("Z303_UPDATE_DATE");
                String Z303_CON_LNG = rs.getString("Z303_CON_LNG");
                String Z303_NAME = rs.getString("Z303_NAME");
                String Z303_TITLE = rs.getString("Z303_TITLE");
                String Z303_DELINQ_1 = rs.getString("Z303_DELINQ_1");
                String Z303_DELINQ_N_1 = rs.getString("Z303_DELINQ_N_1");
                String Z303_DELINQ_1_UPDATE_DATE = rs.getString("Z303_DELINQ_1_UPDATE_DATE");
                String Z303_DELINQ_1_CAT_NAME = rs.getString("Z303_DELINQ_1_CAT_NAME");
                String Z303_PROFILE_ID = rs.getString("Z303_PROFILE_ID");
                String Z303_FIELD_1 = rs.getString("Z303_FIELD_1");
                String Z303_FIELD_2 = rs.getString("Z303_FIELD_2");
                String Z303_FIELD_3 = rs.getString("Z303_FIELD_3");
                String Z303_NOTE_1 = rs.getString("Z303_NOTE_1");
                String Z303_NOTE_2 = rs.getString("Z303_NOTE_2");
                String Z303_SALUTATION = rs.getString("Z303_SALUTATION");
                String Z303_BIRTH_DATE = rs.getString("Z303_BIRTH_DATE");
                String Z303_PLACE_BIRTH = rs.getString("Z303_PLACE_BIRTH");
                String Z303_GENDER = rs.getString("Z303_GENDER");
                String Z303_IMAGE= rs.getString("Z303_IMAGE");
                String Z303_UPD_TIME_STAMP = rs.getString("Z303_UPD_TIME_STAMP");
                Z303 z = new Z303(Z303_REC_KEY,Z303_BARCODE, Z303_NAME_KEY, Z303_USER_TYPE, Z303_USER_LIBRARY, Z303_OPEN_DATE, Z303_UPDATE_DATE, Z303_CON_LNG, Z303_NAME, Z303_TITLE, Z303_DELINQ_1, Z303_DELINQ_N_1, Z303_DELINQ_1_UPDATE_DATE,
                        Z303_DELINQ_1_CAT_NAME, Z303_PROFILE_ID, Z303_FIELD_1, Z303_FIELD_2, Z303_FIELD_3, Z303_NOTE_1, Z303_NOTE_2, Z303_SALUTATION,
                        Z303_BIRTH_DATE,Z303_PLACE_BIRTH, Z303_GENDER,Z303_IMAGE, Z303_UPD_TIME_STAMP);
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
