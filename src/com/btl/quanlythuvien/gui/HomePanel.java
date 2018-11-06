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

    public static final int SIZE_BUTTON_WIDTH = 220;
    public static final int SIZE_BUTTON_HEIGHT = 50;
    private JButton btnQuanLy, btnXoa, btnCapNhat, btnMuon, btnQuanLyNXB, btnDocGia, btnTimkKiem, btnTacGia;
    private JTextField txtTimKiem;
    private Connection connection;
    private PreparedStatement statement;
    private JLabel label;
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
                remove(tableResult);
                remove(label);
                String sql = "Select Z00R_DOC_NUMBER AS 'Mã tài liệu'," +
                        "Z00R_TITLE AS 'Nhan đề'," +
                        "Z00R_AUTHOR AS 'Tác giả' From z00r";
                String title = "Xem chi tiết";
                tableResult = makeTable(sql, title);
                makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);

            }
        };
        btnQuanLy.addMouseListener(clickQuanLy);


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
        label = new JLabel();

        makeComp(btnQuanLy, 40, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);
        makeComp(btnDocGia, btnQuanLy.getX() + btnQuanLy.getWidth() + 25, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);
        makeComp(btnQuanLyNXB, btnDocGia.getX() + btnDocGia.getWidth() + 25, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);
        makeComp(btnMuon, btnQuanLyNXB.getX() + btnQuanLyNXB.getWidth() + 25, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);

        makeComp(btnCapNhat, btnQuanLy.getX(), btnQuanLy.getY() + btnQuanLy.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnTimkKiem, btnCapNhat.getX(), btnCapNhat.getY() + btnCapNhat.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(txtTimKiem, btnTimkKiem.getX(), btnTimkKiem.getY() + btnTimkKiem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 20);

        makeComp(btnXoa, txtTimKiem.getX(), txtTimKiem.getY() + txtTimKiem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnTacGia, btnXoa.getX(), btnXoa.getY() + btnXoa.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        String sql = "Select Z00R_DOC_NUMBER AS 'Mã tài liệu'," +
                "Z00R_TITLE AS 'Nhan đề'," +
                "Z00R_AUTHOR AS 'Tác giả' From z00r";
        String title = "Xem chi tiết";
        tableResult = makeTable(sql, title);
        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);

//        String sql = "Select * From z00";
//        String title = "";
//        tableResult = makeTable(sql, title);
//        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 25, SIZE_BUTTON_WIDTH * 3 + 50, 420);

    }

    public void makeComp(Component c, int x, int y, int width, int height) {
        c.setLocation(x, y);
        c.setSize(width, height);
        c.setVisible(true);
        add(c);

    }

    public JScrollPane makeTable(String sql, String title) {
        Vector<String> vTitle = new Vector<String>();
        Vector<Vector<String>> vData = new Vector<>();
        try {
            vTitle.clear();
            vData.clear();
            connection = new DBConnection().getConnection();
            statement = connection.prepareStatement(sql);
            ResultSet rst = statement.executeQuery();
            ResultSetMetaData metaData = statement.getMetaData();
            int column = metaData.getColumnCount();
            for (int i = 1; i <= column; i++) {
                vTitle.add(metaData.getColumnLabel(i));
            }

            while (rst.next()) {
                Vector<String> row = new Vector<String>(column);
                for (int i = 1; i <= column; i++)
                    row.add(rst.getString(i));
                vData.add(row);
            }

            rst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        JLabel jLabel = new JLabel(title);
        makeComp(jLabel, 600, 90, 400, 30);
        jLabel.setVisible(true);
        DefaultTableModel defaultTableModel = new DefaultTableModel(vData, vTitle);
        JTable jTable = new JTable(defaultTableModel);
        JScrollPane jScrollPane = new JScrollPane(jTable);
        jTable.setFillsViewportHeight(true);
        return jScrollPane;
    }
}