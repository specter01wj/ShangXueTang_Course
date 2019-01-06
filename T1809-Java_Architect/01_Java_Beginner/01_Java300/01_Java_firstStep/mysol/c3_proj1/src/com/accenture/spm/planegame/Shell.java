package com.accenture.spm.planegame;

import java.awt.Color;
import java.awt.Graphics;

public class Shell extends GameObject {

	double degree;
	
	public Shell() {
		x = 200; y = 200;
		width = 10; height = 10;
		speed = 3;
		degree = Math.random()*Math.PI*2;
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		
		g.setColor(c);
	}
	
}
