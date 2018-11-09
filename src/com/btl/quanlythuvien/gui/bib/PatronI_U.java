/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.quanlythuvien.gui.bib;

import com.btl.quanlythuvien.Business.BusALl;
import com.btl.quanlythuvien.Business.BusZ303;
import com.btl.quanlythuvien.Enity.Z303;
import com.btl.quanlythuvien.Enity.type;
import com.btl.quanlythuvien.model.DBConnection;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

/**
 * @author Admin
 */
public class PatronI_U extends javax.swing.JFrame {
    DBConnection dbConn = null;
    BusALl bus = null;
    BusZ303 busZ303 = null;
    int patronId = 0;
    String patron = "";
    String language = "";
    String title = "";
    String block = "";
    String gender = "";
    String value;
    String table = "";
    String timeStamp = "";
    private ArrayList<type> listLag = new ArrayList<>();
    private ArrayList<type> listGender = new ArrayList<>();
    private ArrayList<type> listTitle = new ArrayList<>();
    private ArrayList<type> listBlock = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_Insert;
    private javax.swing.JButton jbtn_Update;
    private javax.swing.JButton jbtn_pic;
    private javax.swing.JButton jbtn_refresh;
    private javax.swing.JComboBox<String> jcb_block;
    private javax.swing.JComboBox<String> jcb_gender;
    private javax.swing.JComboBox<String> jcb_language;
    private javax.swing.JComboBox<String> jcb_title;
    private javax.swing.JTextField jtf_DateBirth;
    private javax.swing.JTextField jtf_Field1;
    private javax.swing.JTextField jtf_Field2;
    private javax.swing.JTextField jtf_Field3;
    private javax.swing.JTextArea jtf_Note1;
    private javax.swing.JTextArea jtf_Note2;
    private javax.swing.JTextField jtf_PatronID;
    private javax.swing.JTextField jtf_PlaceBirth;
    private javax.swing.JTextField jtf_barcode;
    private javax.swing.JTextField jtf_name;
    private javax.swing.JTextField jtf_opendate;
    private javax.swing.JTextField jtf_profile;
    private javax.swing.JTextField jtf_updateDate;
    private Random random;
    private String fileImg;
    private String imagePath;

    /**
     * Creates new form PatronI_U
     */
    public PatronI_U(String table, String value) {
        initComponents();
        this.value = value;
        this.table = table;
        dbConn = new DBConnection();
        bus = new BusALl(dbConn);
        busZ303 = new BusZ303(dbConn);

        patronId = bus.getCountZ00("SELECT count(*) FROM z303") + 1;
        listLag = listShowComm(jcb_language, "SELECT * FROM Language", listLag);
        listBlock = listShowComm(jcb_block, "SELECT * FROM block", listBlock);
        listTitle = listShowComm(jcb_title, "SELECT * FROM title", listTitle);
        listGender = listShowComm(jcb_gender, "SELECT * FROM gender", listGender);
        patron = String.format("%09d", patronId);

        Default();

        EventSelectCombobox();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatronI_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatronI_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatronI_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatronI_U.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatronI_U("", "").setVisible(true);
            }
        });
    }

    private void Default() {
        language = listLag.get(0).getSymbol();
        title = listTitle.get(0).getSymbol();
        block = listBlock.get(0).getSymbol();
        gender = listGender.get(0).getSymbol();
        timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
        String str = timeStamp;
        str = new StringBuilder(str).insert(str.length() - 4, "/").toString();
        str = new StringBuilder(str).insert(str.length() - 7, "/").toString();
        if (value.equals("")) {
            jtf_updateDate.setText(str);
            jtf_updateDate.enable(false);
            jbtn_Insert.enable(true);
            jbtn_Update.setVisible(false);
            jtf_PatronID.setText(patron);
            jtf_barcode.setText("Haui-" + patron);
        } else {
            jtf_updateDate.setText(str);
            jtf_updateDate.enable(true);
            jtf_opendate.enable(false);
            jbtn_Insert.setVisible(false);
            jbtn_Update.enable(true);
            reloadUpdate();
        }

        jtf_PatronID.enable(false);
        jtf_barcode.enable(false);
    }

    /**
     * This method is called from within the constructor to initiallize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        random = new Random();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtf_opendate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_PatronID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_barcode = new javax.swing.JTextField();
        jtf_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtf_DateBirth = new javax.swing.JTextField();
        jtf_PlaceBirth = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtf_profile = new javax.swing.JTextField();
        jtf_updateDate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtf_Field1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtf_Field2 = new javax.swing.JTextField();
        jtf_Field3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jcb_title = new javax.swing.JComboBox<>();
        jcb_gender = new javax.swing.JComboBox<>();
        jcb_block = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtf_Note1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtf_Note2 = new javax.swing.JTextArea();
        jcb_language = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        imgLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtn_Insert = new javax.swing.JButton();
        jbtn_Update = new javax.swing.JButton();
        jbtn_refresh = new javax.swing.JButton();
        jbtn_pic = new javax.swing.JButton();

        jLabel2.setText("Họ Tên / ID/Barcode");
        jLabel1.setText("OpenDate");
        jLabel3.setText("Patron ID");
        jLabel4.setText("Barcode");
        jLabel5.setText("Name");
        jLabel6.setText("Title");
        Gender.setText("Gender");
        jLabel8.setText("Note 1");
        jLabel9.setText("Note 2");
        jLabel10.setText("Local Block");
        jLabel11.setText("Language");
        jLabel12.setText("Date of Birth");
        jLabel13.setText("Place of Birth");
        jLabel15.setText("Profile");
        jLabel16.setText("Update Date");
        jLabel17.setText("Field 1");
        jLabel18.setText("Field 2");
        jLabel19.setText("Field 3");
        imgLabel.setSize(120, 120);
        imgLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        jtf_Note1.setColumns(20);
        jtf_Note1.setLineWrap(true);
        jtf_Note1.setRows(5);
        jScrollPane1.setViewportView(jtf_Note1);

        jtf_Note2.setColumns(20);
        jtf_Note2.setLineWrap(true);
        jtf_Note2.setRows(5);
        jScrollPane2.setViewportView(jtf_Note2);


        jtf_opendate.setText("jTextField1");
        jtf_PatronID.setText("jTextField1");
        jtf_barcode.setText("jTextField1");
        jtf_name.setText("jTextField1");
        jtf_DateBirth.setText("01/01/1990");
        jtf_PlaceBirth.setText("jTextField1");
        jtf_profile.setText("jTextField1");
        jtf_updateDate.setText("jTextField1");
        jtf_Field1.setText("jTextField1");
        jtf_Field2.setText("jTextField1");
        jtf_Field3.setText("jTextField1");

        jtf_Field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_Field1ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jtf_opendate))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jtf_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jtf_PatronID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jtf_updateDate))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel12)
                                                                        .addComponent(jLabel13))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jtf_PlaceBirth)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jtf_DateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Gender)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jcb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jcb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jtf_profile, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                                        .addComponent(jcb_language, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel8)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel9)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel18)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jtf_Field2))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel17)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jtf_Field1))
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel19)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jtf_Field3)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addGap(2, 2, 2)
                                                                .addComponent(jcb_block, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(26, 26, 26)
                                                .addComponent(jtf_name)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jtf_opendate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jtf_PatronID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jtf_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel12)
                                                                        .addComponent(jtf_DateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel16)
                                                                .addComponent(jtf_updateDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jtf_PlaceBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Gender)
                                                        .addComponent(jcb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jtf_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jcb_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jcb_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel15))
                                                .addGap(26, 26, 26)))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jcb_block, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jtf_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jtf_Field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtf_Field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jbtn_pic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtn_refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtn_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtn_Insert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtn_Insert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_refresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_pic)
                                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imgLabel.setText("imgLabel");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(imgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jbtn_Insert.setText("Insert");
        jbtn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_InsertActionPerformed(evt);
                InsertUpdate();
            }
        });

        jbtn_Update.setText("Update");
        jbtn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_UpdateActionPerformed(evt);
                InsertUpdate();
            }
        });

        jbtn_refresh.setText("Refresh");
        jbtn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_refreshActionPerformed(evt);
            }
        });

        jbtn_pic.setText("Upload Pic");
        jbtn_pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "JPG & GIF Images", "jpg", "png", "jpeg", "gif");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    String path = chooser.getSelectedFile().getPath();
                    imgLabel.setText("");
                    imgLabel.setIcon(new ImageIcon(new ImageIcon(path).getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH)));
                    InputStream inputStream = null;
                    OutputStream outputStream = null;
                    try {
                        inputStream = new FileInputStream(path);
                        imagePath = random.nextInt(5000) + ".jpg";
                        fileImg = System.getProperty("user.dir") + "\\DATA\\image" + patronId + imagePath;
                        System.out.println(imagePath);
                        outputStream = new FileOutputStream(new File(fileImg));
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = inputStream.read(buffer)) > 0) {
                            outputStream.write(buffer, 0, length);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            inputStream.close();
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_Field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_Field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_Field1ActionPerformed

    private void jbtn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_InsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_InsertActionPerformed

    private void jbtn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_UpdateActionPerformed

    private void jbtn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_refreshActionPerformed

    private void jbtn_picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_picActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_picActionPerformed
    // End of variables declaration//GEN-END:variables

    public ArrayList<type> listShowComm(JComboBox jcb, String sql, ArrayList<type> list) {
        list = bus.getAllTable(jcb, sql);
        return list;
    }

    public void EventSelectCombobox() {
        jcb_language.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                language = "";
                if (jcb_language.getSelectedIndex() != -1) {
                    language = listLag.get(jcb_language.getSelectedIndex()).getSymbol();
                }
            }
        });
        jcb_block.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                block = "";
                if (jcb_block.getSelectedIndex() != -1) {
                    block = listBlock.get(jcb_block.getSelectedIndex()).getSymbol();
                }
            }
        });
        jcb_gender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gender = "";
                if (jcb_gender.getSelectedIndex() != -1) {
                    gender = listGender.get(jcb_gender.getSelectedIndex()).getSymbol();
                }
            }
        });
        jcb_title.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                title = "";
                if (jcb_title.getSelectedIndex() != -1) {
                    title = listTitle.get(jcb_title.getSelectedIndex()).getSymbol();
                }
            }
        });
    }

    private void reloadUpdate() {

        ArrayList<Z303> listZ303 = busZ303.getOneTable(value);
        jtf_DateBirth.setText(listZ303.get(0).getZ303_BIRTH_DATE());
        jtf_Field1.setText(listZ303.get(0).getZ303_FIELD_1());
        jtf_Field2.setText(listZ303.get(0).getZ303_FIELD_2());
        jtf_Field3.setText(listZ303.get(0).getZ303_FIELD_3());
        jtf_Note1.setText(listZ303.get(0).getZ303_NOTE_1());
        jtf_Note2.setText(listZ303.get(0).getZ303_FIELD_2());
        jtf_PatronID.setText(value);
        jtf_PlaceBirth.setText(listZ303.get(0).getZ303_PLACE_BIRTH());
        jtf_barcode.setText(listZ303.get(0).getZ303_BARCODE());
        jtf_name.setText(listZ303.get(0).getZ303_NAME());
        jtf_profile.setText(listZ303.get(0).getZ303_PROFILE_ID());
        jtf_opendate.setText(listZ303.get(0).getZ303_OPEN_DATE());
        imgLabel.setText("");
        fileImg = System.getProperty("user.dir") + "\\DATA\\";
        System.out.println(fileImg + listZ303.get(0).getZ303_IMAGE());
        imgLabel.setIcon(new ImageIcon(new ImageIcon(fileImg + listZ303.get(0).getZ303_IMAGE()).getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH)));
        jcb_block.setSelectedItem(selectJCombo(listZ303.get(0).getZ303_DELINQ_1(), listBlock));
        jcb_gender.setSelectedItem(selectJCombo(listZ303.get(0).getZ303_GENDER(), listGender));
        jcb_language.setSelectedItem(selectJCombo(listZ303.get(0).getZ303_CON_LNG(), listLag));
        jcb_title.setSelectedItem(selectJCombo(listZ303.get(0).getZ303_TITLE(), listTitle));
        jLabel2.setText(listZ303.get(0).getZ303_NAME() + "/" + listZ303.get(0).getZ303_REC_KEY() + "/" + listZ303.get(0).getZ303_BARCODE());
    }

    private String selectJCombo(String key, List<type> types) {
        String value = "";
        for (com.btl.quanlythuvien.Enity.type type : types) {
            if (Objects.equals(key, type.getSymbol())) {
                value = type.getContent();
            }
        }
        return value;
    }

    private void InsertUpdate() {
        Z303 z303 = new Z303();
        z303.setZ303_REC_KEY(jtf_PatronID.getText());
        z303.setZ303_BARCODE(jtf_barcode.getText());
        z303.setZ303_NAME_KEY(jtf_name.getText());
        z303.setZ303_USER_TYPE("REG");
        z303.setZ303_USER_LIBRARY("HAUI");
        z303.setZ303_OPEN_DATE(jtf_opendate.getText());
        z303.setZ303_UPDATE_DATE(jtf_updateDate.getText());
        z303.setZ303_CON_LNG(language);
        z303.setZ303_NAME(jtf_name.getText());
        z303.setZ303_TITLE(title);
        z303.setZ303_DELINQ_1(block);
        z303.setZ303_PROFILE_ID("11");
        z303.setZ303_FIELD_1(jtf_Field1.getText());
        z303.setZ303_FIELD_2(jtf_Field2.getText());
        z303.setZ303_FIELD_3(jtf_Field3.getText());
        z303.setZ303_NOTE_1(jtf_Note1.getText());
        z303.setZ303_NOTE_2(jtf_Note2.getText());
        z303.setZ303_SALUTATION("Xin chòa");
        z303.setZ303_IMAGE("image" + patronId + imagePath);
        z303.setZ303_BIRTH_DATE(jtf_DateBirth.getText());
        z303.setZ303_PLACE_BIRTH(jtf_PlaceBirth.getText());
        z303.setZ303_GENDER(gender);
        String timeStampa = new SimpleDateFormat("ddMMyyyyhhmmss").format(Calendar.getInstance().getTime());
        z303.setZ303_UPD_TIME_STAMP(timeStampa);

        if (value.equals("")) {
            busZ303.addTable(z303);
            JOptionPane.showMessageDialog(null, "Thêm thông tin thành công!!");
            setVisible(false);
            dispose();
        } else {
            busZ303.updateTable(z303);
            JOptionPane.showMessageDialog(null, "Cập nhật thông tin thành công!!");
            setVisible(false);
            dispose();
        }

    }
}
