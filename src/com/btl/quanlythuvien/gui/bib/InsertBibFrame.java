/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.quanlythuvien.gui.bib;

import com.btl.quanlythuvien.Business.BusALl;
import com.btl.quanlythuvien.Business.BusZ00;
import com.btl.quanlythuvien.Business.BusZ00R;
import com.btl.quanlythuvien.Enity.Z00;
import com.btl.quanlythuvien.Enity.Z00R;
import com.btl.quanlythuvien.Enity.type;
import com.btl.quanlythuvien.controler.Bib;
import com.btl.quanlythuvien.controler.BibBean;
import com.btl.quanlythuvien.controler.Marc2;
import com.btl.quanlythuvien.controler.MarcBean2;
import com.btl.quanlythuvien.model.DBConnection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Admin
 */
public class InsertBibFrame extends javax.swing.JFrame {

    private DBConnection dbConn = null;
    private BusALl bus = null;
    private ArrayList<com.btl.quanlythuvien.Enity.type> list041 = new ArrayList<>();
    private ArrayList<com.btl.quanlythuvien.Enity.type> list925 = null;
    private ArrayList<com.btl.quanlythuvien.Enity.type> list927 = null;
    private String textCombobox = null;
    private String s041 = null;
    private String s925 = null;
    private String s927 = null;
    private String value;
    private int idBib = 0;

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcb_041;
    private javax.swing.JComboBox<String> jcb_925;
    private javax.swing.JComboBox<String> jcb_927;
    private javax.swing.JTextField jtf_008;
    private javax.swing.JTextField jtf_082_a;
    private javax.swing.JTextField jtf_082_b;
    private javax.swing.JTextField jtf_100_a;
    private javax.swing.JTextField jtf_100_e;
    private javax.swing.JTextArea jtf_245_a;
    private javax.swing.JTextArea jtf_245_b;
    private javax.swing.JTextField jtf_260_a;
    private javax.swing.JTextField jtf_260_b;
    private javax.swing.JTextField jtf_260_c;
    private javax.swing.JTextField jtf_300_a;
    private javax.swing.JTextField jtf_300_b;
    private javax.swing.JTextField jtf_300_c;
    private javax.swing.JTextField jtf_650_a;
    private javax.swing.JTextField jtf_650_v;


    /**
     * Creates new form NewJFrame
     */
    public InsertBibFrame(String table, String value) {
        this.value = value;
        System.out.println(value + table);
        dbConn = new DBConnection();
        bus = new BusALl(dbConn);
        initComponents();
        list041 = listShowComm(jcb_041, "SELECT * FROM Language", list041);
        list925 = listShowComm(jcb_925, "SELECT * FROM Material", list925);
        list927 = listShowComm(jcb_927, "SELECT * FROM collection", list927);
        s041 = list041.get(0).getSymbol();
        s925 = list925.get(0).getSymbol();
        s927 = list927.get(0).getSymbol();
        idBib = bus.getCountZ00("SELECT count(*) FROM z00");
        EventSelectCombobox();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

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
            java.util.logging.Logger.getLogger(InsertBibFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertBibFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertBibFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertBibFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertBibFrame("", "").setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcb_041 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtf_100_a = new javax.swing.JTextField();
        jtf_100_e = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtf_245_b = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jtf_260_a = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_260_b = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtf_260_c = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtf_300_c = new javax.swing.JTextField();
        jtf_300_a = new javax.swing.JTextField();
        jtf_300_b = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtf_245_a = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtf_082_a = new javax.swing.JTextField();
        jtf_008 = new javax.swing.JTextField();
        jtf_650_a = new javax.swing.JTextField();
        jtf_650_v = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jcb_925 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jcb_927 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jtf_082_b = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        view();
        if (value.equals("")) {
            reloadInsert();
        } else {
            reloadUpdate();
        }
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Thoát");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                setVisible(false);
                dispose();
            }
        });

        jButton1.setText("Làm mới");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (value.equals("")) {
                    reloadInsert();
                } else {
                    reloadUpdate();
                }
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reloadUpdate() {
        jButton2.setText("Cập nhật");
        BibBean b = new BibBean();
        BusZ00 busZ00 = new BusZ00(dbConn);
        List<Z00> z00s = busZ00.getOneTable(value);
        String data = z00s.get(0).getZ00_DATA();
        Marc2 marc2 = new Marc2();
        MarcBean2 marcBean2 = marc2.marcBeans(value, data);
        System.out.println(marcBean2);
        jtf_008.setText(value);
        jtf_082_a.setText(marc2.getData008(marcBean2.getSp082()).get(0));
        jtf_082_b.setText(marc2.getData008(marcBean2.getSp082()).get(1));

        jtf_100_a.setText(marc2.getData100(marcBean2.getSp100()).get(0));
        jtf_100_e.setText(marc2.getData100(marcBean2.getSp100()).get(1));

        jtf_245_a.setText(marc2.getData008(marcBean2.getSp245()).get(0));
        jtf_245_b.setText(marc2.getData008(marcBean2.getSp245()).get(1));

        jtf_260_a.setText(marc2.getData260(marcBean2.getSp260()).get(0));
        jtf_260_b.setText(marc2.getData260(marcBean2.getSp260()).get(1));
        jtf_260_c.setText(marc2.getData260(marcBean2.getSp260()).get(2));

        jtf_300_a.setText(marc2.getData260(marcBean2.getSp300()).get(0));
        jtf_300_b.setText(marc2.getData260(marcBean2.getSp300()).get(1));
        jtf_300_c.setText(marc2.getData260(marcBean2.getSp300()).get(2));

        jtf_650_a.setText(marc2.getData650(marcBean2.getSp650()).get(0));
        jtf_650_v.setText(marc2.getData650(marcBean2.getSp650()).get(1));

        //   jcb_041.setSelectedIndex(selectJCombo(marcBean2.getSp041().replace("$$a",""),list041));
    }

    private void reloadInsert() {
        jButton2.setText("Thêm");
        jtf_082_a.setText("jTextField11");
        jtf_082_b.setText("jTextField11");
        jtf_100_a.setText("tên tác giả");
        jtf_100_e.setText("vai trò");
        jtf_245_a.setText("Tên nhan đề");
        jtf_245_b.setText("Phần còn lại cua nhan đề");
        jtf_260_a.setText("Nơi xuất bản");
        jtf_260_b.setText("Nhà sản xuất");
        jtf_260_c.setText("Năm sản xuất");
        jtf_300_a.setText("Khối lượng");
        jtf_300_b.setText("Các đặc điểm khác");
        jtf_300_c.setText("Kích thước");
        jtf_650_a.setText("Thuật ngữ chủ đề tiêu đề ");
        jtf_650_v.setText("Đề mục con hình thức, thể loại");
    }

    private void view() {
        jLabel1.setText("008");
        jLabel2.setText("Ngôn ngữ");
        jLabel3.setText("082");
        jLabel7.setText("$$a");
        jLabel8.setText("$$b");

        jLabel4.setText("100 -  Thông tin tác giả");
        jLabel5.setText("$$a");
        jLabel6.setText("$$e");
        jLabel9.setText("245 -  Thông tin tài liệu");
        jLabel22.setText("$$a");
        jtf_245_b.setColumns(20);
        jtf_245_b.setRows(5);
        jScrollPane1.setViewportView(jtf_245_b);

        jLabel23.setText("$$b");
        jtf_245_a.setColumns(20);
        jtf_245_a.setRows(5);
        jScrollPane2.setViewportView(jtf_245_a);

        jLabel10.setText("260-  thông tin sản xuất");
        jLabel11.setText("$$a");
        jLabel12.setText("$$b");
        jLabel13.setText("$$c");

        jLabel14.setText("300 - trường mô tả vật lý");
        jLabel15.setText("$$a");
        jLabel16.setText("$$b");
        jLabel17.setText("$$c");

        jLabel18.setText("650 -  Tiêu đề bổ sung");
        jLabel19.setText("$$a");
        jLabel20.setText("$$v");

        jLabel21.setText("925 - Loại vật liệu ");
        jLabel24.setText("927 - Thể loại");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel18)
                                                        .addComponent(jLabel22)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel21)
                                                                        .addComponent(jLabel24))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jcb_927, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jcb_925, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jcb_041, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jtf_008, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel23)
                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jtf_650_a, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel19))
                                                                        .addGap(356, 356, 356)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jtf_100_a, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel7)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jtf_082_a, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel8))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jtf_100_e)
                                                                        .addComponent(jtf_082_b, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                                                .addContainerGap(11, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtf_300_a, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtf_300_b, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtf_300_c, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(241, 241, 241)
                                                        .addComponent(jButton1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton3))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(42, 42, 42)
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jtf_260_a, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jtf_260_b, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jtf_260_c, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(jLabel20))
                                                .addComponent(jtf_650_v, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jtf_008, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jcb_041, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jtf_082_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_082_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jtf_100_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_100_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel22)
                                        .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtf_260_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)
                                        .addComponent(jtf_260_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(jtf_260_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtf_300_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)
                                        .addComponent(jtf_300_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)
                                        .addComponent(jtf_300_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtf_650_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtf_650_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(jcb_925, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(jcb_927, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3))
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }

    private String selectJCombo(String key, List<type> types) {
        String value = "";
        for (com.btl.quanlythuvien.Enity.type type : types) {
            if (Objects.equals(key, type.getSymbol())) {
                value = type.getContent();
                break;
            }
        }
        return value;
    }

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        insertDb();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public ArrayList<type> listShowComm(JComboBox jcb, String sql, ArrayList<type> list) {
        list = bus.getAllTable(jcb, sql);
        return list;
    }

    public void selectCombox(JComboBox jcb, ArrayList<type> list) {
        jcb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textCombobox = "";
                if (jcb.getSelectedIndex() != -1) {
                    textCombobox = "Fruits Selected: "
                            + list.get(jcb.getSelectedIndex()).getSymbol();
                }
                System.out.println(textCombobox);
            }
        });
    }

    public void EventSelectCombobox() {
        jcb_041.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s041 = "";
                if (jcb_041.getSelectedIndex() != -1) {
                    s041 = list041.get(jcb_041.getSelectedIndex()).getSymbol();
                }
            }
        });
        jcb_925.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s925 = "";
                if (jcb_925.getSelectedIndex() != -1) {
                    s925 = list925.get(jcb_925.getSelectedIndex()).getSymbol();
                }
            }
        });
        jcb_927.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                s927 = "";
                if (jcb_927.getSelectedIndex() != -1) {
                    s927 = list927.get(jcb_927.getSelectedIndex()).getSymbol();
                }
            }
        });
    }

    public void insertDb() {
        BibBean b = new BibBean();
        b.setFiledLDR("123456789xyz");
        b.setField001(String.format("%09d", (idBib + 1)));
        b.setField008("181108s2018^^^^vm^^^^^^^^n^^^000^^^" + s041 + "^^");
        b.setField041a(s041);
        b.setField082a(jtf_082_a.getText());
        b.setField082b(jtf_082_b.getText());
        b.setField100a(jtf_100_a.getText());
        b.setField100e(jtf_100_e.getText());
        b.setField245a(jtf_245_a.getText());
        b.setField245b(jtf_245_b.getText());
        b.setField260a(jtf_260_a.getText());
        b.setField260b(jtf_260_b.getText());
        b.setField260c(jtf_260_c.getText());
        b.setField300a(jtf_300_a.getText());
        b.setField300b(jtf_300_b.getText());
        b.setField300c(jtf_300_c.getText());
        b.setField650a(jtf_650_a.getText());
        b.setField650v(jtf_650_v.getText());
        b.setField911("Master");
        b.setField925(s925);
        b.setField927(s927);
        System.out.println(b);
        Bib bib = new Bib(b);

        Z00 z00 = new Z00();
        z00.setZ00_DOC_NUMBER(b.getField001());
        z00.setZ00_DATA_LEN(bib.sb.length());
        z00.setZ00_DATA(bib.sb.toString());

        Z00R z00R = new Z00R();
        z00R.setZ00R_DOC_NUMBER(b.getField001());
        z00R.setZ00R_TITLE(b.getField245a());
        z00R.setZ00R_AUTHOR(b.getField100a());

        BusZ00 busZ00 = new BusZ00(dbConn);
        busZ00.addTable(z00);

        BusZ00R busZ00R = new BusZ00R(dbConn);
        busZ00R.addTable(z00R);

        System.out.println(bib.sb);
    }
}