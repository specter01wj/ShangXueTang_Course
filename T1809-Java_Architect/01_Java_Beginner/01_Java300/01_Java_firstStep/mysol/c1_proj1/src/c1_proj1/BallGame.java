package c1_proj1;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x = 100, y = 100;
	boolean right = true;
	
	public void paint(Graphics g) {
		System.out.println("Window draw...");
		g.drawImage(desk,  0 , 0,  null);
		g.drawImage(ball, (int)x, (int)y, null);
		//x++;
		
		if(x > 856-70) {
			right = false;
		}
		if(x<40) {
			right = true;
		}
		
		x = (right) ? x+10 : x-10;
	}
	
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args){
		
		System.out.println("Game start!!!");
		BallGame game = new BallGame();
		game.launchFrame();
		
		
	}
	
}
