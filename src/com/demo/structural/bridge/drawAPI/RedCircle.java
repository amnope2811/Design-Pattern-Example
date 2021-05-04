package com.demo.structural.bridge.drawAPI;

public class RedCircle implements DrawAPIInterface {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
	}
