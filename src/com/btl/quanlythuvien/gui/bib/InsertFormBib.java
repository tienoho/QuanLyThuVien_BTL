package com.btl.quanlythuvien.gui.bib;

import com.btl.quanlythuvien.gui.QuanLyPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertFormBib extends JFrame implements ActionListener {
    JLabel madocgialb;
    JTextField madocgia;

    JLabel tendocgialb;
    JTextField tendocgia;

    JLabel ngaysinhlb;
    JTextField ngaysinh;

    JLabel noisinhlb;
    JTextField noisinh;

    JLabel diachilb;
    JTextField diachi;

    JLabel dienthoailb;
    JTextField dienthoai;

    JLabel maloaidocgialb;
    JTextField maloaidocgia;

    JLabel errorlb;
    JLabel errordetails;

    JButton ok;
    JButton cancel;

    QuanLyPanel mst;
    String id;

    public InsertFormBib(String dg, QuanLyPanel bb, String mdg, String tdg, String ns, String nois, String dc, String dt, String mldg) {
        super(dg);
        mst = bb;
        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(24, 2));

        madocgialb = new JLabel("madocgia");
        madocgia = new JTextField(mdg);
        cont.add(madocgialb);
        cont.add(madocgia);

        tendocgialb = new JLabel("tendocgia");
        tendocgia = new JTextField(tdg);
        cont.add(tendocgialb);
        cont.add(tendocgia);

        ngaysinhlb = new JLabel("ngaysinh");
        ngaysinh = new JTextField(ns);
        cont.add(ngaysinhlb);
        cont.add(ngaysinh);

        noisinhlb = new JLabel("noisinh");
        noisinh = new JTextField(nois);
        cont.add(noisinhlb);
        cont.add(noisinh);

        diachilb = new JLabel("diachi");
        diachi = new JTextField(dc);
        cont.add(diachilb);
        cont.add(diachi);

        dienthoailb = new JLabel("dienthoai");
        dienthoai = new JTextField(dt);
        cont.add(dienthoailb);
        cont.add(dienthoai);

        maloaidocgialb = new JLabel("maloaidocgia");
        maloaidocgia = new JTextField(mldg);
        cont.add(maloaidocgialb);
        cont.add(maloaidocgia);

        errorlb = new JLabel("");
        errordetails = new JLabel("");
        errorlb.setVisible(false);
        errordetails.setVisible(false);
        cont.add(errorlb);
        cont.add(errordetails);
        JButton ok = new JButton("Ok");
        JButton cancel = new JButton("Cancel");
        cont.add(ok);
        cont.add(cancel);
        ok.addActionListener(this);
        cancel.addActionListener(this);
        this.setSize(430, 500);
        this.setLocation(250, 100);
        this.setVisible(true);
        id = mdg;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Ok")) {
            insertDB();
        } else {
            this.dispose();
        }
    }

    public void insertDB() {
        if (madocgia.getText().equals("") || tendocgia.getText().equals("") || ngaysinh.getText().equals("") || noisinh.getText().equals("") || diachi.getText().equals("") || dienthoai.getText().equals("") || maloaidocgia.getText().equals("")) {
            errorlb.setText("Error");
            errordetails.setText("empty value");
            errorlb.setForeground(Color.RED);
            errordetails.setForeground(Color.RED);

            errorlb.setVisible(true);
            errordetails.setVisible(true);

        } else {
            try {
                String mdg = madocgia.getText();
                String tdg = tendocgia.getText();
                String ns = ngaysinh.getText();
                String nois = noisinh.getText();
                String dc = diachi.getText();
                Integer dt = Integer.parseInt(dienthoai.getText());
                String mldg = maloaidocgia.getText();

                String sql = " ";

                if (this.getTitle().equals("Insert form")) {
                    sql = "insert into docgia (MADOCGIA,TENDOCGIA,NGAYSINH,NOISINH,DIACHI,DIENTHOAI,MALOAIDOCGIA)"
                            + " values ('" + mdg + "','" + tdg + "','" + ns + "','" + nois + "','" + dc + "'," + dt + ",'" + mldg + "')";
                } else {
                    sql = "update docgia set MADOCGIA= '" + mdg + "',TENDOCGIA ='" + tdg + "',NGAYSINH='" + ns + "',NOISINH='" + nois + "',DIACHI='" + dc + "',DIENTHOAI= " + dt + ",MALOAIDOCGIA='" + mldg + "' where MADOCGIA= '" + id + "'";
                }

                //mst.stm.executeUpdate(sql);
                //mst.reload();
                //mst.model.fireTableDataChanged();
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Loi");
            }

        }
    }
}