/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.quanlythuvien.gui.bib;

import com.btl.quanlythuvien.Business.BusALl;
import com.btl.quanlythuvien.Business.BusZ30;
import com.btl.quanlythuvien.Enity.ItemOne;
import com.btl.quanlythuvien.Enity.Z30;
import com.btl.quanlythuvien.Enity.type;
import com.btl.quanlythuvien.model.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 * @author Admin
 */
public class InsertItem extends javax.swing.JFrame {
    private String value, table, timeStamp, loaiTaiLieu, boSuuTap, trangThai, itemStatus, barCode;
    float Z30_PRICE = 0;
    private DefaultTableModel model = null;
    private ArrayList<Z30> listOneTableZ30 = null;
    BusZ30 busZ30 = null;

    private ArrayList<com.btl.quanlythuvien.Enity.type> listLoaiTaiLieu = null;
    private ArrayList<com.btl.quanlythuvien.Enity.type> listBoSuuTap = null;
    private ArrayList<com.btl.quanlythuvien.Enity.type> listTrangThai = null;
    private BusALl bus = null;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn_add;
    private javax.swing.JButton jbtn_del;
    private javax.swing.JButton jbtn_refesh;
    private javax.swing.JButton jbtn_save;
    private javax.swing.JButton jbtn_update;
    private javax.swing.JComboBox<String> jcb_bosuutap;
    private javax.swing.JComboBox<String> jcb_loaitailieu;
    private javax.swing.JComboBox<String> jcb_trangthai;
    private javax.swing.JLabel jlb_bib;
    private javax.swing.JTextArea jta_mota;
    private javax.swing.JTextField jtf_barcode;
    private javax.swing.JTextField jtf_gia;
    private javax.swing.JTextField jtf_maThuVien;
    private javax.swing.JTextField jtf_soluong;
    private DBConnection dbConn;
    private ArrayList<ItemOne> listTableZ30;

    public InsertItem(String table, String value) {
        this.value = value;
        this.table = table;
        initComponents();
        jtf_barcode.enable(false);
        jtf_maThuVien.enable(false);
        getData();
        dateNow();
        reload();
        EventAddItem();
        setDisplayTable();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        jtf_soluong.setVisible(false);

    }

    private void getData() {
        bus = new BusALl(dbConn);
        listLoaiTaiLieu = listShowComm(jcb_loaitailieu, "SELECT * FROM Material", listLoaiTaiLieu);
        listBoSuuTap = listShowComm(jcb_bosuutap, "SELECT * FROM collection", listBoSuuTap);
        listTrangThai = listShowComm(jcb_trangthai, "SELECT * FROM itemstatus", listTrangThai);
        loaiTaiLieu = listLoaiTaiLieu.get(0).getSymbol();
        boSuuTap = listBoSuuTap.get(0).getSymbol();
    }

    public ArrayList<com.btl.quanlythuvien.Enity.type> listShowComm(JComboBox jcb, String sql, ArrayList<type> list) {
        list = bus.getAllTable(jcb, sql);
        return list;
    }

    private void EventSelectCombobox() {
        jcb_bosuutap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boSuuTap = "";
                if (jcb_bosuutap.getSelectedIndex() != -1) {
                    boSuuTap = listBoSuuTap.get(jcb_bosuutap.getSelectedIndex()).getSymbol();
                }
            }
        });
        jcb_trangthai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                trangThai = "";
                if (jcb_trangthai.getSelectedIndex() != -1) {
                    trangThai = listTrangThai.get(jcb_trangthai.getSelectedIndex()).getSymbol();
                }
            }
        });
        jcb_loaitailieu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loaiTaiLieu = "";
                if (jcb_loaitailieu.getSelectedIndex() != -1) {
                    loaiTaiLieu = listLoaiTaiLieu.get(jcb_loaitailieu.getSelectedIndex()).getSymbol();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        dbConn = new DBConnection();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtf_barcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_maThuVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_gia = new javax.swing.JTextField();
        jbtn_add = new javax.swing.JButton();
        jbtn_refesh = new javax.swing.JButton();
        jbtn_update = new javax.swing.JButton();
        jbtn_del = new javax.swing.JButton();
        jcb_bosuutap = new javax.swing.JComboBox<>();
        jcb_loaitailieu = new javax.swing.JComboBox<>();
        jcb_trangthai = new javax.swing.JComboBox<>();
        jtf_soluong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_mota = new javax.swing.JTextArea();
        jbtn_save = new javax.swing.JButton();
        jlb_bib = new javax.swing.JLabel();
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Barcode", "Mã Thư viện", "Loại tài liệu", "Trạng thái", "Bộ sưu tập", "Giá", "Mô tả"
                }
        ) {
            Class[] types = new Class[]{
                    String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Barcode");

        jtf_barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_barcodeActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Thư Viện");

        jLabel3.setText("Loại tài liệu");

        jLabel4.setText("Trạng thái");

        jLabel5.setText("Mô tả");


        jLabel7.setText("Giá");

        jLabel8.setText("Bộ sưu tập");

        jbtn_add.setText("Thêm");

        jbtn_refesh.setText("Làm mới");

        jbtn_update.setText("Cập nhập");

        jbtn_del.setText("Xóa");

        jta_mota.setColumns(20);
        jta_mota.setRows(5);
        jScrollPane2.setViewportView(jta_mota);

        jbtn_save.setText("Lưu dữ liệu");

        jlb_bib.setText("ID BIB");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jcb_loaitailieu, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                                                .addComponent(jtf_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel8)
                                                                                        .addComponent(jLabel7))
                                                                                .addGap(20, 20, 20)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jtf_gia)
                                                                                        .addComponent(jcb_bosuutap, 0, 222, Short.MAX_VALUE))))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel1))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(jtf_maThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jtf_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(25, 25, 25)
                                                                .addComponent(jcb_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(56, 56, 56)
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(30, 30, 30)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jbtn_update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jbtn_refesh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jbtn_del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jbtn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(121, 121, 121)
                                                                .addComponent(jlb_bib)))
                                                .addGap(18, 18, 18))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jbtn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlb_bib)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jtf_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jtf_maThuVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jcb_loaitailieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jcb_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jcb_bosuutap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jtf_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jtf_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbtn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtn_refesh)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtn_update)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbtn_del))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(156, 156, 156))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_save)
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String selectJCombo(String key, List<type> types) {
        String value = "";
        for (com.btl.quanlythuvien.Enity.type type : types) {
            if (Objects.equals(key, type.getContent())) {
                value = type.getSymbol();
            }
        }
        return value;
    }

    private void EventAddItem() {
        jbtn_add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                listTableZ30 = new BusZ30(dbConn).getOneTable_REC_KEY(value);
                addItem(model.getRowCount() + listTableZ30.size() + 1);
            }
        });
        jbtn_del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    model.removeRow(jTable1.getSelectedRow());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Không có gì để xóa");
                }
            }
        });
        jbtn_save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                insertDb();
            }
        });
        jbtn_refesh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                reload();
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

    private void reload() {
        jtf_barcode.setText(value);
        jtf_maThuVien.setText("HAUI");
        jcb_loaitailieu.setSelectedIndex(0);
        jcb_trangthai.setSelectedIndex(0);
        jcb_bosuutap.setSelectedIndex(0);
        jtf_gia.setText("");
    }

    private void dateNow() {
        timeStamp = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
        timeStamp = new StringBuilder(timeStamp).insert(timeStamp.length() - 4, "/").toString();
        timeStamp = new StringBuilder(timeStamp).insert(timeStamp.length() - 7, "/").toString();
    }


    public boolean stringContainsItemFromList(String inputStr, String[] items) {
        for (int i = 0; i < items.length; i++) {
            if (inputStr.contains(items[i])) {
                barCode = items[i];
                return true;
            }
        }
        return false;
    }

    private void insertDb() {
        listOneTableZ30 = new ArrayList<>();
        listOneTableZ30 = new BusZ30(dbConn).getAllTable();
        String item[] = new String[listOneTableZ30.size()];
        for (int i = 0; i < listOneTableZ30.size(); i++) {
            item[i] = listOneTableZ30.get(i).getZ30_BARCODE();
        }
        for (int i = 0; i < model.getRowCount(); i++) {
            if (!stringContainsItemFromList((String) model.getValueAt(i, 0), item)) {
                JOptionPane.showMessageDialog(null, "Barcode: " + (String) model.getValueAt(i, 0) + " đã tồn tại!");
            } else {
                Z30 z30 = new Z30();
                z30.setZ30_REC_KEY(value);
                String z = (String) model.getValueAt(i, 0);
                z30.setZ30_BARCODE(z);
                z30.setZ30_SUB_LIBRARY(jtf_maThuVien.getText());
                z30.setZ30_MATERIAL("G");
                z30.setZ30_ITEM_STATUS("RD");
                z30.setZ30_UPDATE_DATE(timeStamp);
                z30.setZ30_CATALOGER("MASTER");
                z30.setZ30_DATE_LAST_RETURN("");
                z30.setZ30_NO_LOANS("1");
                z30.setZ30_COLLECTION("SH");
                z30.setZ30_DESCRIPTION((String) model.getValueAt(i, 6));
                z30.setZ30_ORDER_NUMBER(jtf_soluong.getText());
                z30.setZ30_PRICE((String) model.getValueAt(i, 5));

                BusZ30 busZ30 = new BusZ30(dbConn);
                busZ30.addTable(z30);
                System.out.println(z30);
            }
        }
    }

    private void setDisplayTable() {
        model = (DefaultTableModel) jTable1.getModel();
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(320);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(120);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(120);
    }

    private void addItem(int i) {
        jtf_barcode.setText(value + "-" + jtf_maThuVien.getText() + "-" + i);
        model.addRow(new Object[]{jtf_barcode.getText(), jtf_maThuVien.getText(), jcb_loaitailieu.getSelectedItem(), jcb_trangthai.getSelectedItem(),
                jcb_bosuutap.getSelectedItem(), jtf_gia.getText()});
    }

    private void jtf_barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_barcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_barcodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertItem("", "").setVisible(true);
            }
        });
    }

}
