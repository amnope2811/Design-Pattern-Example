package com.demo.structural.bridge.drawAPI;

public class GreenCircle implements DrawAPIInterface {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
	   }
}
