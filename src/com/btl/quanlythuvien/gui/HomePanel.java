package com.btl.quanlythuvien.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;


public class HomePanel extends BasePanel {
    GridBagConstraints gridBagConstraints;
    GridBagLayout gridBagLayout;

    @Override
    public void initComponents() {
        setLayout(new CardLayout());
        setBackground(Color.WHITE);
    }

    @Override
    public void registerListener() {
        MouseAdapter mouseAdapter;
        MouseListener mouseListener;

        KeyAdapter keyAdapter;

    }

    @Override
    public void addComponents() {
        addButton();
    }

    private void addButton() {
        JButton bttquanli = new JButton("Quản lí sách", new ImageIcon(
                "image/qls2.png"));
        JButton btxoa = new JButton("Xoá thông tin....", new ImageIcon("image/xoa.png"));
        JButton btcapnhat = new JButton("Cập nhật thông tin....", new ImageIcon(
                "image/cn.png"));

        JButton btmuonts = new JButton("Quản lí mượn trả sách....", new ImageIcon(
                "image/mt.png"));
        JButton bttqlnxb = new JButton("Quản lí NXB....", new ImageIcon(
                "image/nxb.png"));
        JButton btdocgia = new JButton("Quản lí độc giả....", new ImageIcon("image/qldg.png"));

        JButton bttimkiem = new JButton("Tìm kiếm", new ImageIcon("image/tk2.png"));
        JTextField tftimkiem = new JTextField();
        JTextField tfmapt = new JTextField();

        JButton btttacgia1 = new JButton("Thông tin tác giả", new ImageIcon("image/qltg.png"));

        gridBagLayout = new GridBagLayout();
        gridBagConstraints = new GridBagConstraints();

        setLayout(gridBagLayout);
        gridBagConstraints.insets = new Insets(25, 5, 5, 5);
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        addOneButton(bttquanli, 0, 0, 1, 1);
        addOneButton(btdocgia, 0, 1, 1, 1);
        addOneButton(btmuonts, 0, 2, 1, 1);
        addOneButton(bttqlnxb, 0, 3, 1, 1);

        addOneButton(btcapnhat, 1, 0, 1, 1);
        addOneButton(btxoa, 2, 0, 1, 1);
        addOneButton(tftimkiem, 3, 0, 1, 1);
        addOneButton(bttimkiem, 4, 0, 1, 1);
        addOneButton(btttacgia1, 5, 0, 1, 1);

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