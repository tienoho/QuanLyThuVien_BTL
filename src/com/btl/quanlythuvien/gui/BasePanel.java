package com.btl.quanlythuvien.gui;

import javax.swing.*;

public abstract class BasePanel extends JPanel implements Setup {
	public BasePanel() {
		initComponents();
		addComponents();
		registerListener();
	}

}