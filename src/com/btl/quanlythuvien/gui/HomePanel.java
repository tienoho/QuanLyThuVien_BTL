package com.btl.quanlythuvien.gui;

import com.btl.quanlythuvien.Business.BusALl;
import com.btl.quanlythuvien.gui.bib.*;
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
    private JButton btnQuanLy, btnXoa, btnCapNhat, btnMuon, btnQuanLyNXB, btnDocGia, btnTimkKiem, btnTacGia, btnThem, btnThemItem, btnChiTiet;
    private JTextField txtTimKiem, txtData, dTable, colunm;
    private Connection connection;
    private PreparedStatement statement;
    private JViewport viewport;
    private JTable table;
    private JLabel label, timkiem;
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
        MouseListener clickChiTiet = new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (!getDataRow()) {
                    JOptionPane.showMessageDialog(null, "Bạn cần chọn dòng cần xem chi tiết!!");
                } else {
                    ViewItem viewItem = new ViewItem(dTable.getText(), txtData.getText());
                    viewItem.show();
                }
            }
        };
        btnChiTiet.addMouseListener(clickChiTiet);

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
                reloadItemSach();
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
                    if (dTable.getText().equals("z00r")) {

                        String sql = "Select Z00R_DOC_NUMBER AS 'Mã tài liệu'," +
                                "Z00R_TITLE AS 'Nhan đề'," +
                                "Z00R_AUTHOR AS 'Tác giả' From z00r where Z00R_DOC_NUMBER='" + String.format("%09d", Integer.parseInt(txtTimKiem.getText())) + "'";
                        String title = "Xem chi tiết";
                        tableResult = makeTable(sql, title);
                        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);
                    }
                    if (dTable.getText().equals("z30")) {
                        btnThemItem.setVisible(false);
                        btnChiTiet.setVisible(false);

                        String sql = "Select Z30_BARCODE AS 'Barcode'," +
                                "Z30_REC_KEY AS 'Mã sách'," +
                                "Z30_SUB_LIBRARY AS 'Mã thư viện'," +
                                "Z30_MATERIAL AS 'Loại tài liệu'," +
                                "Z30_ITEM_STATUS AS 'Trạng thái'," +
                                "Z30_COLLECTION AS 'Bộ sưu tập'," +
                                "Z30_PRICE AS 'Giá' From z30 where Z30_REC_KEY='" + String.format("%09d", Integer.parseInt(txtTimKiem.getText())) + "'";
                        String title = "Chi tiết Item sách";
                        tableResult = makeTable(sql, title);
                        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);
                    }
                    if (dTable.getText().equals("z303")) {
                        btnThemItem.setVisible(false);
                        btnChiTiet.setVisible(false);
                        String sql = "Select Z303_REC_Key AS 'Mã độc giả'," +
                                "Z303_NAME AS 'Tên độc giả'," +
                                "Z303_BIRTH_DATE AS 'Ngày sinh'," +
                                "Z303_GENDER AS 'Giới tính'," +
                                "Z303_DELINQ_1 AS 'Trạng thái' From z303 where Z303_REC_Key='" + String.format("%09d", Integer.parseInt(txtTimKiem.getText())) + "'";
                        String title = "Chi tiết độc giả";
                        tableResult = makeTable(sql, title);
                        makeComp(tableResult, btnCapNhat.getX() + btnCapNhat.getWidth() + 25, btnQuanLy.getY() + btnQuanLy.getHeight() + 50, SIZE_BUTTON_WIDTH * 3 + 50, 400);

                    }

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
                    PatronI_U patronI_u = new PatronI_U(dTable.getText(), "");
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
                        PatronI_U patronI_u = new PatronI_U(dTable.getText(), txtData.getText());
                        patronI_u.show();
                    }
                }
            }
        };
        btnCapNhat.addMouseListener(clickCapNhat);

        MouseListener clickThemItem = new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (!getDataRow()) {
                    JOptionPane.showMessageDialog(null, "Bạn cần chọn dòng cần thêm item!!");
                } else {
                    if (dTable.getText().equals("z303")) {
                        PhieuTra phieuTra = new PhieuTra(dTable.getText(), txtData.getText());
                        phieuTra.show();
                    } else {
                        InsertItem insertItem = new InsertItem(dTable.getText(), txtData.getText());
                        insertItem.show();
                    }
                }
            }
        };
        btnThemItem.addMouseListener(clickThemItem);

        MouseListener clickQuanLyMuon = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                PhieuMuon phieuMuon = new PhieuMuon();
                phieuMuon.show();
            }
        };
        btnMuon.addMouseListener(clickQuanLyMuon);
    }

    @Override
    public void addComponents() {
        timkiem = new JLabel("Nhập mã sách ");
        btnChiTiet = new JButton("Chi tiết sách");

        btnQuanLy = new JButton("Quản lý sách", new ImageIcon(
                "image/qlysach.png"));

        btnDocGia = new JButton("Quản lý độc giả", new ImageIcon("image/qlydocgia.png"));

        btnMuon = new JButton("Quản lý mượn trả sách", new ImageIcon(
                "image/qlymuontra.png"));

        btnQuanLyNXB = new JButton("Quản lý item sách", new ImageIcon(
                "image/qlitemsach.png"));

        btnThem = new JButton("Thêm thông tin", new ImageIcon("image/themsach.png"));

        btnXoa = new JButton("Xoá thông tin", new ImageIcon("image/xoasach.png"));

        btnCapNhat = new JButton("Cập nhật thông tin", new ImageIcon(
                "image/chinhsua.png"));

        btnTimkKiem = new JButton("Tìm kiếm", new ImageIcon("image/timkiem.png"));

        btnTacGia = new JButton("Thông tin tác giả", new ImageIcon("image/qltg.png"));

        btnThemItem = new JButton("Thêm item sách");
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

        makeComp(txtTimKiem, btnTimkKiem.getX(), btnTimkKiem.getY() + btnTimkKiem.getHeight() + 25, SIZE_BUTTON_WIDTH - 100, SIZE_BUTTON_HEIGHT - 20);

        makeComp(timkiem, txtTimKiem.getX() + txtTimKiem.getWidth() + 5, btnTimkKiem.getY() + btnTimkKiem.getHeight() + 25, 100, SIZE_BUTTON_HEIGHT - 20);

        makeComp(btnThem, txtTimKiem.getX(), txtTimKiem.getY() + txtTimKiem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnCapNhat, btnThem.getX(), btnThem.getY() + btnThem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnXoa, btnCapNhat.getX(), btnCapNhat.getY() + btnCapNhat.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnThemItem, btnXoa.getX(), btnXoa.getY() + btnXoa.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

        makeComp(btnChiTiet, btnThemItem.getX(), btnThemItem.getY() + btnThemItem.getHeight() + 25, SIZE_BUTTON_WIDTH, SIZE_BUTTON_HEIGHT - 10);

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
        btnThemItem.setText("Thêm item sách");
        btnThemItem.setVisible(true);
        btnChiTiet.setVisible(true);
        timkiem.setText("Nhập mã sách");

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
        timkiem.setText("Nhập mã độc giả");
        btnThemItem.setText("Phiếu trả");
        btnChiTiet.setVisible(false);
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

    private void reloadItemSach() {
        btnThemItem.setVisible(false);
        btnChiTiet.setVisible(false);
        timkiem.setText("Nhập mã sách");

        String sql = "Select Z30_BARCODE AS 'Barcode'," +
                "Z30_REC_KEY AS 'Mã sách'," +
                "Z30_SUB_LIBRARY AS 'Mã thư viện'," +
                "Z30_MATERIAL AS 'Loại tài liệu'," +
                "Z30_ITEM_STATUS AS 'Trạng thái'," +
                "Z30_COLLECTION AS 'Bộ sưu tập'," +
                "Z30_PRICE AS 'Giá' From z30";
        String title = "Chi tiết Item sách";
        dTable.setText("z30");
        colunm.setText("Z30_BARCODE");
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