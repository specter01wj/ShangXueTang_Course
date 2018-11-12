package c1_proj1;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	public void paint(Graphics g) {
		System.out.println("Window draw...");
		g.drawImage(desk,  0 , 0,  null);
		g.drawImage(ball, 100, 100, null);
	}
	
	void launchFrame() {
		setSize(300,300);
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
