package com.btl.quanlythuvien.gui;

import com.btl.quanlythuvien.Business.BusALl;
import com.btl.quanlythuvien.gui.bib.InsertBibFrame;
import com.btl.quanlythuvien.gui.bib.PatronI_U;
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
import java.util.Objects;
import java.util.Vector;


public class HomePanel extends BasePanel {

    public static final int SIZE_BUTTON_WIDTH = 220;
    public static final int SIZE_BUTTON_HEIGHT = 50;
    private JButton btnQuanLy, btnXoa, btnCapNhat, btnMuon, btnQuanLyNXB, btnDocGia, btnTimkKiem, btnTacGia, btnThem;
    private JTextField txtTimKiem, txtData, dTable, colunm;
    private Connection connection;
    private PreparedStatement statement;
    private JViewport viewport;
    private JTable table;
    private JLabel label;
    private JFrame jFrame;
    private Vector<String> vTitle;
    private Vector<Vector<String>> vData;
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
                reloadQuanLySach();
            }
        };
        btnQuanLy.addMouseListener(clickQuanLy);


        MouseListener clickDocGia = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reloadDocGia();
            }
        };
        btnDocGia.addMouseListener(clickDocGia);


        MouseListener clickQuanLyNXB = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        };
        btnQuanLyNXB.addMouseListener(clickQuanLyNXB);


        MouseListener clickXoa = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!getDataRow()) {
                    JOptionPane.showMessageDialog(null, "Bạn cần chọn dòng cần xóa!!");
                } else {
                    if (!txtData.getText().equals("")) {
                        int index = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Xóa độc giả", JOptionPane.YES_NO_OPTION);
                        if (index == JOptionPane.YES_OPTION) {
                            new BusALl(new DBConnection()).deleteTable(dTable.getText(), colunm.getText(), txtData.getText());
                            JOptionPane.showMessageDialog(null, "Xóa thành công!!!");
                            if (dTable.getText().equals("z00r")) {
                                reloadQuanLySach();
                            }
                            if (dTable.getText().equals("z303")) {
                                reloadDocGia();
                            }
                        }
                    }
                }
            }
        };
        btnXoa.addMouseListener(clickXoa);

        MouseListener clickTimKiem = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (txtTimKiem.getText().equals("") || txtTimKiem.getText() == null) {
                    JOptionPane.showMessageDialog(null, "Bạn cần nhâp giá trị tìm kiếm!!!");
                } else {


                }
            }
        };
        btnTimkKiem.addMouseListener(clickTimKiem);

        MouseListener clickThem = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (dTable.getText().equals("z00r")) {
                    InsertBibFrame insertBibFrame = new InsertBibFrame(dTable.getText(), "");
                    insertBibFrame.show();
                }
                if (dTable.getText().equals("z303")) {
                    PatronI_U patronI_u = new PatronI_U("","");
                    patronI_u.show();
                }

            }
        };
        btnThem.addMouseListener(clickThem);

        MouseListener clickCapNhat = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getDataRow();
                if (!getDataRow()) {
                    JOptionPane.showMessageDialog(null, "Bạn cần chọn dòng cần cập nhật!!");
                } else {
                    if (dTable.getText().equals("z00r")) {
                        InsertBibFrame insertBibFrame = new InsertBibFrame(dTable.getText(), txtData.getText());
                        insertBibFrame.show();
                    }
                    if (dTable.getText().equals("z303")) {
                        PatronI_U patronI_u = new PatronI_U("","");
                        patronI_u.show();
                    }
                }
            }
        };
        btnCapNhat.addMouseListener(clickCapNhat);
    }

    @Override
    public void addComponents() {

        btnQuanLy = new JButton("Quản lí sách", new ImageIcon(
                "image/qls2.png"));

        btnMuon = new JButton("Quản lí mượn trả sách....", new ImageIcon(
                "image/mt.png"));
        btnQuanLyNXB = new JButton("Quản lí NXB....", new ImageIcon(
                "image/nxb.png"));
        btnDocGia = new JButton("Quản lí độc giả....", new ImageIcon("image/qldg.png"));

        btnThem = new JButton("Thêm thông tin...");

        btnXoa = new JButton("Xoá thông tin....", new ImageIcon("image/xoa.png"));

        btnCapNhat = new JButton("Cập nhật thông tin....", new ImageIcon(
                "image/cn.png"));

        btnTimkKiem = new JButton("Tìm kiếm", new ImageIcon("image/tk2.png"));

        btnTacGia = new JButton("Thông tin tác giả", new ImageIcon("image/qltg.png"));

        txtTimKiem = new JTextField();
        txtData = new JTextField();
        table = new JTable();
        tableResult = new JScrollPane();

        viewport = tableResult.getViewport();
        table = (JTable) viewport.getView();

        dTable = new JTextField();

        colunm = new JTextField();

        makeComp(btnQuanLy, 40, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);
        makeComp(btnDocGia, btnQuanLy.getX() + btnQuanLy.getWidth() + 25, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);
        makeComp(btnQuanLyNXB, btnDocGia.getX() + btnDocGia.getWidth() + 25, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);
        makeComp(btnMuon, btnQuanLyNXB.getX() + btnQuanLyNXB.getWidth() + 25, 30, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT);

        makeComp(btnTimkKiem, btnQuanLy.getX(), btnQuanLy.getY() + btnQuanLy.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(txtTimKiem, btnTimkKiem.getX(), btnTimkKiem.getY() + btnTimkKiem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnThem, txtTimKiem.getX(), txtTimKiem.getY() + txtTimKiem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 20);

        makeComp(btnCapNhat, btnThem.getX(), btnThem.getY() + btnThem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnXoa, btnCapNhat.getX(), btnCapNhat.getY() + btnCapNhat.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        dTable.setText("z00r");
        colunm.setText("Z00R_DOC_NUMBER");

        String title = "Xem chi tiết";
        label = new JLabel(title);
        String sql = "Select Z00R_DOC_NUMBER AS 'Mã tài liệu'," +
                "Z00R_TITLE AS 'Nhan đề'," +
                "Z00R_AUTHOR AS 'Tác giả' From z00r";
        tableResult = makeTable(sql, title);
        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);
        makeComp(label, 600, 90, 400, 30);

    }

    public void makeComp(Component c, int x, int y, int width, int height) {
        c.setLocation(x, y);
        c.setSize(width, height);
        c.setVisible(true);
        add(c);

    }

    public JScrollPane makeTable(String sql, String title) {
        if (tableResult != null) {
            remove(tableResult);
        }
        vTitle = new Vector<String>();
        vData = new Vector<>();
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
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        remove(label);
        label.setText(title);
        makeComp(label, 600, 90, 400, 30);
        repaint();
        DefaultTableModel defaultTableModel = new DefaultTableModel(vData, vTitle);
        table = new JTable(defaultTableModel);
        tableResult = new JScrollPane(table);
        table.setShowGrid(true);
        table.setFillsViewportHeight(true);
        return tableResult;
    }

    private void reloadQuanLySach() {
        String sql = "Select Z00R_DOC_NUMBER AS 'Mã tài liệu'," +
                "Z00R_TITLE AS 'Nhan đề'," +
                "Z00R_AUTHOR AS 'Tác giả' From z00r";
        String title = "Xem chi tiết";
        dTable.setText("z00r");
        colunm.setText("Z00R_DOC_NUMBER");
        tableResult = makeTable(sql, title);
        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);
    }

    private void reloadDocGia() {
        String sql = "Select Z303_REC_Key AS 'Mã độc giả'," +
                "Z303_NAME AS 'Tên độc giả'," +
                "Z303_BIRTH_DATE AS 'Ngày sinh'," +
                "Z303_GENDER AS 'Giới tính'," +
                "Z303_DELINQ_1 AS 'Trạng thái' From z303";
        String title = "Chi tiết độc giả";
        dTable.setText("z303");
        colunm.setText("Z303_REC_KEY");
        tableResult = makeTable(sql, title);
        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);
    }

    private boolean getDataRow() {
        int selectedrow = table.getSelectedRow();
        if (selectedrow != -1) {
            Vector hs = vData.elementAt(selectedrow);
            String value = hs.elementAt(0).toString();
            txtData.setText(value);
            return true;
        }
        return false;
    }
}