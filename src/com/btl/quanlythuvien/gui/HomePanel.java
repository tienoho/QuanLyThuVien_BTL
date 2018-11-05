package com.btl.quanlythuvien.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class HomePanel extends BasePanel {
    private GridBagConstraints gridBagConstraints;
    private GridBagLayout gridBagLayout;
    private JButton btnQuanLy, btnXoa, btnCapNhat, btnMuon, btnQuanLyNXB, btnDocGia, btnTimkKiem, btnTacGia;
    private JTextField txtTimKiem;
    private JTable menu;

    @Override
    public void initComponents() {
        setLayout(new CardLayout());
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
        menu = new JTable();

        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();

        setLayout(gridBagLayout);
        gridBagConstraints.insets = new Insets(25, 10, 10, 10);
        gridBagConstraints.fill = GridBagConstraints.BOTH;

        addOneButton(btnQuanLy, 0, 0, 1, 1);
        addOneButton(btnDocGia, 0, 1, 1, 1);
        addOneButton(btnMuon, 0, 2, 1, 1);
        addOneButton(btnQuanLyNXB, 0, 3, 1, 1);

        addOneButton(btnCapNhat, 1, 0, 1, 1);
        addOneButton(btnXoa, 2, 0, 1, 1);
        addOneButton(txtTimKiem, 3, 0, 1, 1);
        addOneButton(btnTimkKiem, 4, 0, 1, 1);
        addOneButton(btnTacGia, 5, 0, 1, 1);

        addOneButton(menu, 1, 1, 1, 1);

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