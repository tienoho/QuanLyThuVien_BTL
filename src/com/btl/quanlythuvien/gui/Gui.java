package com.btl.quanlythuvien.gui;

import javax.swing.JFrame;
import java.awt.*;

public class Gui extends JFrame implements Setup {

    public Gui(){
        initComponents();
        registerListener();
        addComponents();
    }

    @Override
    public void initComponents() {
        setTitle("Quản lý thư viện");
        setLayout(new GridLayout());
    }

    @Override
    public void registerListener() {

    }

    @Override
    public void addComponents() {

    }
}
