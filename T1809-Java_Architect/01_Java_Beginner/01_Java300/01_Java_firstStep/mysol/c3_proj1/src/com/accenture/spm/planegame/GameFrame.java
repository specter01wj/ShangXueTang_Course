package com.accenture.spm.planegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	public void launchFrame() {
		this.setTitle("PlaneGame by James");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		GameFrame gf = new GameFrame();
		gf.launchFrame();
		
	}
	
}
