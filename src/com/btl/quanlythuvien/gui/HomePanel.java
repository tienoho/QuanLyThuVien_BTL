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
    private JButton btnQuanLy, btnXoa, btnCapNhat, btnMuon, btnQuanLyNXB, btnDocGia, btnTimkKiem, btnTacGia;
    private JTextField txtTimKiem;
    private JTable menu;
    private JTable jTable;
    private Vector vData = new Vector();
    private Vector vTitle = new Vector();
    private Connection connection;
    private PreparedStatement statement;
    private DefaultTableModel model;
    private JTable tb = new JTable();
    private JScrollPane tableResult;


    @Override
    public void initComponents() {
        setLayout(null);
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

        makeComp(btnQuanLy, 100, 30, 200, 50);
        makeComp(btnDocGia, btnQuanLy.getX() + btnQuanLy.getWidth() + 25, 30, 200, 50);
        makeComp(btnQuanLyNXB, btnDocGia.getX() + btnDocGia.getWidth() + 25, 30, 200, 50);
        makeComp(btnMuon, btnQuanLyNXB.getX() + btnQuanLyNXB.getWidth() + 25, 30, 200, 50);

        makeComp(btnCapNhat, btnQuanLy.getX(), btnQuanLy.getY() + btnQuanLy.getHeight() + 25, 200, 50);

        makeComp(btnTimkKiem, btnCapNhat.getX(), btnCapNhat.getY() + btnCapNhat.getHeight() + 25, 200, 50);

        reload();
        model = new DefaultTableModel(vData, vTitle);
        tb = new JTable(model);
        tableResult = new JScrollPane(tb);
        tb.setFillsViewportHeight(true);
        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 25, 650, 400);

    }

    public void makeComp(Component c, int x, int y, int width, int height) {
        c.setLocation(x, y);
        c.setSize(width, height);
        c.setVisible(true);
        add(c);

    }

    public void reload() {
        try {
            connection = new DBConnection().getConnection();
            statement = connection.prepareStatement("Select Z00_DOC_NUMBER,Z00_NO_LINES,Z00_DATA_LEN,Z00_DATA From z00");
            ResultSet rst = statement.executeQuery();
            ResultSetMetaData metaData = statement.getMetaData();
            int column = metaData.getColumnCount();
            for (int i = 1; i <= column; i++) {
                vTitle.add(metaData.getColumnName(i));
            }

            while (rst.next()) {
                Vector row = new Vector(column);
                for (int i = 1; i <= column; i++)
                    row.add(rst.getString(i));
                vData.add(row);
            }

            rst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}