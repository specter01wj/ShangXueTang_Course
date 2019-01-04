package com.accenture.spm.planegame;

import java.awt.Graphics;
import java.awt.Image;

public class GameObject {

	private Image img;
	private double x, y;
	private int speed;
	private int width, height;
	
	public void drawSelf(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
	}

	public GameObject(Image img, double x, double y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}

	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	public GameObject() {
		
	}
	
}
