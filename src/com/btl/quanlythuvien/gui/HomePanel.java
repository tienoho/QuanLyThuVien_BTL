package com.btl.quanlythuvien.gui;

import com.btl.quanlythuvien.model.DBConnection;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;


public class HomePanel extends BasePanel {
    private GridBagConstraints gridBagConstraints;
    private GridBagLayout gridBagLayout;
    private JButton btnQuanLy, btnXoa, btnCapNhat, btnMuon, btnQuanLyNXB, btnDocGia, btnTimkKiem, btnTacGia;
    private JTextField txtTimKiem;
    private JTable menu;
    private JTable jTable;
    private Vector vData = new Vector();
    private Vector vTitle = new Vector();
    private Connection connection;
    private PreparedStatement statement;
    private DefaultTableModel model;
    private JLabel lbltd = new JLabel("BẢNG Z00");
    private JTable tb = new JTable();
    private JScrollPane tableResult;


    @Override
    public void initComponents() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Color.WHITE);
    }

    @Override
    public void registerListener() {
        MouseListener clickQuanLy = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        };

    }

    @Override
    public void addComponents() {
        addButton();
    }

    private void addButton() {
        btnQuanLy = new JButton("Quản lí sách", new ImageIcon(
                "image/qls2.png"));
        btnXoa = new JButton("Xoá thông tin....", new ImageIcon("image/xoa.png"));
        btnCapNhat = new JButton("Cập nhật thông tin....", new ImageIcon(
                "image/cn.png"));

        btnMuon = new JButton("Quản lí mượn trả sách....", new ImageIcon(
                "image/mt.png"));
        btnQuanLyNXB = new JButton("Quản lí NXB....", new ImageIcon(
                "image/nxb.png"));
        btnDocGia = new JButton("Quản lí độc giả....", new ImageIcon("image/qldg.png"));

        btnTimkKiem = new JButton("Tìm kiếm", new ImageIcon("image/tk2.png"));

        btnTacGia = new JButton("Thông tin tác giả", new ImageIcon("image/qltg.png"));

        txtTimKiem = new JTextField();

        makeComp(btnQuanLy, 30, 30, 200, 50);
        makeComp(btnDocGia, 30, 30, 200, 50);
        makeComp(btnQuanLyNXB, 30, 30, 200, 50);
        makeComp(btnMuon, 30, 30, 200, 50);


    }

    public void makeComp(Component c, int x, int y, int width, int height) {
        c.setLocation(x, y);
        c.setPreferredSize(new Dimension(width, height));
        c.setVisible(true);
        add(c);

    }

    public void reload() {
        try {
            vTitle.clear();
            vData.clear();
            connection = new DBConnection().getConnection();
            statement = connection.prepareStatement("select * from z00");
            ResultSet rst = statement.executeQuery();
            ResultSetMetaData rstmeta = rst.getMetaData();
            int num_column = rstmeta.getColumnCount();
            for (int i = 1; i <= num_column; i++) {
                vTitle.add(rstmeta.getColumnLabel(i));
            }

            while (rst.next()) {
                Vector row = new Vector(num_column);
                for (int i = 1; i <= num_column; i++)
                    row.add(rst.getString(i));
                vData.add(row);
            }
            rst.close();
        }
        // stm.close();
        // conn.close();}
        catch (Exception e) {
        }
    }

    private void addOneButton(Component c, int row, int col, int nrow, int ncol) {
        gridBagConstraints.gridx = col;
        gridBagConstraints.gridy = row;

        gridBagConstraints.gridheight = ncol;
        gridBagConstraints.gridwidth = nrow;

        gridBagLayout.setConstraints(c, gridBagConstraints);
        add(c);
    }
}