package com.accenture.spm.planegame;

import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameFrame extends JFrame {

	public void launchFrame() {
		this.setTitle("PlaneGame by James");
		this.setSize(500, 500);
		this.setLocation(300, 300);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
	}
	
	
	public static void main(String[] args) {
		
		GameFrame gf = new GameFrame();
		gf.launchFrame();
		
	}
	
}
