package com.demo.structural.bridge;

import com.demo.structural.bridge.drawAPI.DrawAPIInterface;

public class Circle extends Shape {
	   private int x, y, radius;

	   public Circle(int x, int y, int radius, DrawAPIInterface drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      drawAPI.drawCircle(radius,x,y);
	   }
}
