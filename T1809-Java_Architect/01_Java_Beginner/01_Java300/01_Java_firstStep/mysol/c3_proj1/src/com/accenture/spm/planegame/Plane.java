package com.accenture.spm.planegame;

import java.awt.Graphics;

public class Plane extends GameObject {

	public void drawSelf(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		x++;
	}
	
}
