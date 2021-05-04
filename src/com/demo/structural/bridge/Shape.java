package com.demo.structural.bridge;

import com.demo.structural.bridge.drawAPI.DrawAPIInterface;

public abstract class Shape {

	protected DrawAPIInterface drawAPI;
	   
	protected Shape(DrawAPIInterface drawAPI){
      this.drawAPI = drawAPI;
	}
	
   public abstract void draw();
}
