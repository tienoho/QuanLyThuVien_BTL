/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.quanlythuvien.gui.bib;

import com.btl.quanlythuvien.Business.*;
import com.btl.quanlythuvien.Enity.*;
import com.btl.quanlythuvien.model.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * @author Tien
 */
public class PhieuMuon extends javax.swing.JFrame {
    DBConnection dbConn = null;
    BusALl bus = null;
    BusZ303 busZ303 = null;
    BusZ30 busZ30 = null;
    BusZ00 busZ00 = null;
    String value;
    String table = "";
    String maDocGia = "";
    String maTaiLieu = "";
    String maTaiLieuCaBiet = "";
    String timeStamp = "";
    ArrayList<Z303> listZ303 = null;
    ArrayList<Z00> listZ00 = null;
    ArrayList<ItemOne> listOneTableZ30 = null;
    DefaultTableModel model = null;
    String itemStatus = "";
    float Z30_PRICE = 0;
    String iD = "";
    int z = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtf_nhande;
    private javax.swing.JTextField jtf_tacGia;
    private javax.swing.JButton jbtn_them;
    private javax.swing.JButton jbtn_themItem;
    private javax.swing.JButton jbtn_xoaItem;
    private javax.swing.JComboBox<String> jcb_macabiet;
    private javax.swing.JComboBox<String> jcb_madocgia;
    private javax.swing.JComboBox<String> jcb_matailieu;
    private javax.swing.JTextField jtf_maphieu;
    private javax.swing.JTextField jtf_soLuong;
    private javax.swing.JTextField jtf_ngayTra;
    private javax.swing.JTextField jtf_tendocgia;

    /**
     * Creates new form PhieuMuon
     */
    public PhieuMuon() {
        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLocationRelativeTo(null);
        setDisplayTable();
        getData();
        setComboBox();
        selectCombox();
        dateNow();
        EventAddItem();
        jButton1.hide();
        jButton2.hide();
        jButton5.hide();
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
            java.util.logging.Logger.getLogger(PhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuMuon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuMuon().setVisible(true);
            }
        });
    }

    private void dateNow() {
        timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
        timeStamp = new StringBuilder(timeStamp).insert(timeStamp.length() - 4, "/").toString();
        timeStamp = new StringBuilder(timeStamp).insert(timeStamp.length() - 7, "/").toString();
        jtf_ngayTra.setText(timeStamp);
    }

    private void getData() {
        dbConn = new DBConnection();
        bus = new BusALl(dbConn);
        busZ303 = new BusZ303(dbConn);
        busZ30 = new BusZ30(dbConn);
        busZ00 = new BusZ00(dbConn);

        listZ303 = busZ303.getAllTable();
        listZ00 = busZ00.getAllTable();
        listOneTableZ30 = busZ30.getOneTable_REC_KEY(listZ00.get(0).getZ00_DOC_NUMBER());
        jtf_tendocgia.setText(listZ303.get(0).getZ303_NAME());
        int count = bus.getCountZ00("SELECT count(DISTINCT Z36_ID) FROM z36");
        iD = String.format("%09d", count + 1);
        jtf_maphieu.setText(iD);
    }

    private void setDisplayTable() {

        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(320);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);

    }

    private void setComboBox() {
        for (Z00 i : listZ00) {
            jcb_matailieu.addItem(i.getZ00_DOC_NUMBER());
        }
        for (Z303 i : listZ303) {
            jcb_madocgia.addItem(i.getZ303_REC_KEY());
        }
        comboBoxMaCaBiet();
    }

    private void comboBoxMaCaBiet() {
        for (ItemOne i : listOneTableZ30) {
            jcb_macabiet.addItem(i.getZ30_BARCODE());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        listOneTableZ30 = new ArrayList<>();
        jLabel = new JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcb_madocgia = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtf_tendocgia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jbtn_them = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtf_maphieu = new javax.swing.JTextField();
        jtf_ngayTra = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcb_matailieu = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jtf_nhande = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jtf_soLuong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jbtn_themItem = new javax.swing.JButton();
        jbtn_xoaItem = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jtf_tacGia = new javax.swing.JTextField();
        jcb_macabiet = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Thông tin phiếu mượn");
        jPanel1.setName("Thông tin phiếu mượn"); // NOI18N

        jLabel1.setText("Thông tin phiếu mượn");

        jLabel3.setText("Mã độc giả");

        jButton1.setText("Tìm");

        jLabel4.setText("Tên độc giả");

        jtf_tendocgia.setEditable(false);

        jLabel5.setText("Ngày mượn");

        jButton5.setText("Xóa");

        jbtn_them.setText("Thêm");

        jLabel10.setText("Mã phiếu mượn");

        jtf_maphieu.setEditable(false);

        jtf_ngayTra.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addComponent(jbtn_them)
                                                .addGap(29, 29, 29)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jtf_tendocgia, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jtf_maphieu, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jcb_madocgia, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton1))
                                                        .addComponent(jtf_ngayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(23, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_maphieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jcb_madocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jtf_tendocgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jtf_ngayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtn_them)
                                        .addComponent(jButton5))
                                .addGap(76, 76, 76))
        );

        jLabel2.setText("Thông tin mượn tài liệu");

        jLabel6.setText("Mã tài liệu");

        jButton2.setText("Tìm");

        jtf_nhande.setEditable(false);

        jLabel7.setText("Tên tài liệu");

        jTable1.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Mã", "Barcode", "Nhan đề", "Số lượng"
                }
        ) {
            Class[] types = new Class[]{
                    String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("Tác giả");
        jtf_soLuong.setEditable(true);

        jLabel9.setText("Số lượng");

        jbtn_themItem.setText("Thêm");

        jbtn_xoaItem.setText("Xóa");

        jLabel11.setText("Mã cá biệt");

        jtf_tacGia.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jcb_matailieu, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel11)
                                                                .addGap(55, 55, 55)
                                                                .addComponent(jcb_macabiet, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(42, 389, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel7))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jtf_nhande, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel8)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jtf_tacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel9)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jtf_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(243, 243, 243)
                                                                .addComponent(jButton2)
                                                                .addGap(159, 159, 159)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jbtn_xoaItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jbtn_themItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jcb_matailieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2)
                                        .addComponent(jbtn_themItem))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtn_xoaItem)
                                        .addComponent(jLabel11)
                                        .addComponent(jcb_macabiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jtf_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jtf_tacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(jtf_nhande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Thông tin phiếu mượn");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // End of variables declaration//GEN-END:variables
    public ArrayList<com.btl.quanlythuvien.Enity.type> listShowComm(JComboBox jcb, String sql, ArrayList<type> list) {
        list = bus.getAllTable(jcb, sql);
        return list;
    }

    public void selectCombox() {
        jcb_madocgia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maDocGia = "";
                if (jcb_madocgia.getSelectedIndex() != -1) {
                    maDocGia = listZ303.get(jcb_madocgia.getSelectedIndex()).getZ303_REC_KEY();
                    jtf_tendocgia.setText(listZ303.get(jcb_madocgia.getSelectedIndex()).getZ303_NAME());
                }
                System.out.println(maDocGia);
            }
        });
        jcb_matailieu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maTaiLieu = "";
                if (jcb_matailieu.getSelectedIndex() != -1) {
                    maTaiLieu = listZ00.get(jcb_matailieu.getSelectedIndex()).getZ00_DOC_NUMBER();
                    listOneTableZ30 = busZ30.getOneTable_REC_KEY(maTaiLieu);
                    jcb_macabiet.removeAllItems();
                    comboBoxMaCaBiet();
                    jtf_nhande.setText(listOneTableZ30.get(0).getZ00R_TITLE());
                    jtf_tacGia.setText(listOneTableZ30.get(0).getZ00R_AUTHOR());

                }
                System.out.println(maTaiLieu);
            }
        });
        jcb_macabiet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                maTaiLieuCaBiet = "";
                if (jcb_macabiet.getSelectedIndex() != -1) {
                    maTaiLieuCaBiet = listOneTableZ30.get(jcb_macabiet.getSelectedIndex()).getZ30_BARCODE();
                }
                System.out.println(maTaiLieuCaBiet);
            }
        });
    }

    private void EventAddItem() {
        jbtn_themItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addItem();
            }
        });
        jbtn_xoaItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    model.removeRow(jTable1.getSelectedRow());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Không có gì để xóa");
                }
            }
        });
        jbtn_them.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertDb();
            }
        });
//        jTable1.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int z = jTable1.getSelectedRow();
//                if (z <= -1) {
//                    String value = jTable1.getModel().getColumnName(z);
//                    jLabel.setText(value);
//                }
//            }
//        });
    }

    private void addItem() {
        model.addRow(new Object[]{jcb_matailieu.getSelectedItem(), jcb_macabiet.getSelectedItem(), jtf_nhande.getText(), jtf_soLuong.getText()});
    }

    private void insertDb() {
        Z36 z36;

        BusZ36 busZ36 = new BusZ36(dbConn);
        for (int i = 0; i < model.getRowCount(); i++) {
            listOneTableZ30 = busZ30.getOneTable_REC_KEY(model.getValueAt(i, 0).toString());
            itemStatus = listOneTableZ30.get(0).getZ30_ITEM_STATUS();
            Z30_PRICE = listOneTableZ30.get(0).getZ30_PRICE();

            z36 = new Z36();
            z36.setZ36_ID(iD);
            z36.setZ36_REC_KEY(model.getValueAt(i, 0).toString());
            z36.setZ36_BARCODE(model.getValueAt(i, 1).toString());
            z36.setZ36_PARTRON_ID((String) jcb_madocgia.getSelectedItem());
            z36.setZ36_NUMBER("1");//số lần mượn
            z36.setZ36_SUB_LIBRARY("HAUI");//Kí hiệu thư viện
            z36.setZ36_STATUS("A");//A là đang mượn, C là đã trả, M đã làm mất
            z36.setZ36_LOAN_DATE(timeStamp);//Ngày mượn
            z36.setZ36_DUE_DATE(jtf_ngayTra.getText());//Ngày Hạn trả
            z36.setZ36_ITEM_STATUS(itemStatus);//tình Trạng của ITEM_STATUS Z30
            z36.setZ36_MONEY(Z30_PRICE);//tiền
            z36.setZ36_PROCESS_STATUS("M");//R đang được đoc, L mất,M Mượn

            busZ36.addTable(z36);
            System.out.println(z36);
        }
    }
}
