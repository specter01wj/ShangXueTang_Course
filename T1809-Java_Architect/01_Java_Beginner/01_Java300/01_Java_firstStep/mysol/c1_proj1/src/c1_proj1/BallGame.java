package c1_proj1;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

	void launchFrame() {
		setSize(300,300);
		setLocation(50,50);
		setVisible(true);
	}
	
	public static void main(String[] args){
		
		System.out.println("Game start!!!");
		BallGame game = new BallGame();
		game.launchFrame();
		
		
	}
	
}
