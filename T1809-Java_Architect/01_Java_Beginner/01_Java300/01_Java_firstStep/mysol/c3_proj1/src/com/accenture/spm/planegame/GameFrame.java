package com.accenture.spm.planegame;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameFrame extends JFrame {
	
	//Image ball = GameUtil.getImage("images/ball.png");
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	//int planeX = 250, planeY = 250;
	Plane plane = new Plane(planeImg, 250, 250);
	
	class KeyMonitor extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			//super.keyPressed(e);
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			//super.keyReleased(e);
			System.out.println(e.getKeyCode());
		}
		
		
		
	}

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
		
		new PaintThread().start();
	}
	
	@Override
	public void paint(Graphics g) {
//		Color c = g.getColor();
//		Font f = g.getFont();
//		g.setColor(Color.CYAN);
//		
//		g.drawLine(100, 100, 300, 300);
//		g.drawRect(100, 100, 300, 300);
//		g.drawOval(100, 100, 300, 300);
//		g.fillRect(100,100, 20, 20);
//		g.setColor(Color.red);
//		g.setFont(new Font("Times New Roman", Font.BOLD, 50));
//		g.drawString("James", 200, 200);
		
		g.drawImage(bg, 0, 0, null);
//		g.drawImage(planeImg, planeX, planeY, null);
//		planeX++;
		plane.drawSelf(g);
//		g.setColor(c);
//		g.setFont(f);
	}
	
	class PaintThread extends Thread {
		
		@Override
		public void run() {
			while(true) {
				//System.out.println("Window Run!");
				repaint();
				
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		GameFrame gf = new GameFrame();
		gf.launchFrame();
		
	}
	
}
