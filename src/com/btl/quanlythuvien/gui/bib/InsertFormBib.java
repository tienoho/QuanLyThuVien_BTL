package com.btl.quanlythuvien.gui.bib;

import com.btl.quanlythuvien.Business.BusZ00;
import com.btl.quanlythuvien.Enity.Z00;
import com.btl.quanlythuvien.model.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertFormBib extends JFrame implements ActionListener {
    JLabel lbZ00_DOC_NUMBER;
    JTextField tfZ00_DOC_NUMBER;
    JLabel lbZ00_DATA;
    JTextField tfZ00_DATA;
    //field
    JLabel lb008;
    JTextField tf008;
    JLabel lb041;
    JTextField tf041;
    JLabel lb082;
    JTextField tf082;
    JLabel lb100;
    JTextField tf100;
    JLabel lb245;
    JTextField tf245;
    JLabel lb260;
    JTextField tf260;
    JLabel lb300;
    JTextField tf300;
    JLabel lb650;
    JTextField tf650;
    JLabel lb911;
    JTextField tf911;
    JLabel lb925;
    JTextField tf925;
    JLabel lb927;
    JTextField tf927;



    JLabel errorlb;
    JLabel errordetails;

    JButton ok;
    JButton cancel;
    Z00 z = null;
    DBConnection dbConn = null;;

    public InsertFormBib() {
        super("Thêm BIB");
        z=new Z00();
        dbConn = new DBConnection();
        //mst = bb;
        Container cont = this.getContentPane();
        cont.setLayout(new GridLayout(24, 3,5,2));

        lbZ00_DOC_NUMBER = new JLabel("Z00_DOC_NUMBER");
        tfZ00_DOC_NUMBER = new JTextField(z.getZ00_DOC_NUMBER());
        cont.add(lbZ00_DOC_NUMBER);
        cont.add(tfZ00_DOC_NUMBER);

        lbZ00_DATA = new JLabel("Z00_DATA");
        tfZ00_DATA = new JTextField(z.getZ00_DATA());
        cont.add(lbZ00_DATA);
        cont.add(tfZ00_DATA);

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
        //set size full màn hình
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //set kích thước thu nhỏ của form
        this.setMinimumSize(new Dimension(480, 680));
        //set vào chính giữa màn hình
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new InsertFormBib();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Ok")) {
            insertDB();
        } else {
            this.dispose();
        }
    }

    public void insertDB() {
        if (tfZ00_DOC_NUMBER.getText().equals("") || tfZ00_DATA.getText().equals("")) {
            errorlb.setText("Error");
            errordetails.setText("empty value");
            errorlb.setForeground(Color.RED);
            errordetails.setForeground(Color.RED);

            errorlb.setVisible(true);
            errordetails.setVisible(true);

        } else {
            try {
                BusZ00 buzZ = new BusZ00(dbConn);
                z=new Z00(tfZ00_DOC_NUMBER.getText(),0,tfZ00_DATA.getText().length(),tfZ00_DATA.getText());
                buzZ.addTable(z);
                //mst.reload();
                //mst.model.fireTableDataChanged();
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Loi");
            }
        }
    }
}