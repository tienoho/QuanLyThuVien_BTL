package com.btl.quanlythuvien.gui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame implements Setup {
    private HomePanel homePanel;

    public Gui() {
        initComponents();
        registerListener();
        addComponents();
    }

    @Override
    public void initComponents() {
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = graphicsDevice.getDisplayMode().getWidth();
        int height = graphicsDevice.getDisplayMode().getHeight();
        setTitle("Quản lý thư viện");
        setLayout(new GridLayout());
        setSize(2 * width / 3, 2 * height / 3);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void registerListener() {

    }

    @Override
    public void addComponents() {
        homePanel = new HomePanel();
        add(homePanel);
    }

}
