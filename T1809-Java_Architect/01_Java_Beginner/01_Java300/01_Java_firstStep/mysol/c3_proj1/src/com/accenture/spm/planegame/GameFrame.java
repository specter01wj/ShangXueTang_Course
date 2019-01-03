package com.accenture.spm.planegame;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameFrame extends JFrame {
	
	Image ball = GameUtil.getImage("images/ball.png");

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
		Color c = g.getColor();
		Font f = g.getFont();
		g.setColor(Color.CYAN);
		
		g.drawLine(100, 100, 300, 300);
		g.drawRect(100, 100, 300, 300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100,100, 20, 20);
		g.setColor(Color.red);
		g.setFont(new Font("Times New Roman", Font.BOLD, 50));
		g.drawString("James", 200, 200);
		
		g.drawImage(ball, 50, 50, null);
		
		g.setColor(c);
		g.setFont(f);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		GameFrame gf = new GameFrame();
		gf.launchFrame();
		
	}
	
}
