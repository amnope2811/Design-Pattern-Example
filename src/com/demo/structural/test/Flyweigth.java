package com.demo.structural.test;

import org.junit.Test;

import com.demo.structural.flyweigth.Circle;
import com.demo.structural.flyweigth.ShapeFactory;

public class Flyweigth {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	@Test
	public void draw() {
		for(int i=0; i < 20; ++i) {
	         Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
	         circle.setX(getRandomX());
	         circle.setY(getRandomY());
	         circle.setRadius(100);
	         circle.draw();
	    }
	}
	
	private static String getRandomColor() {
	      return colors[(int)(Math.random()*colors.length)];
	}
	
	private static int getRandomX() {
	      return (int)(Math.random()*100 );
	}
	
	private static int getRandomY() {
	      return (int)(Math.random()*100);
	}
}
