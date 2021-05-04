package com.demo.behavioral.strategy;

public class Circle implements StrategyInterface{

	@Override
	public float calculation(float width, float height) throws Exception {
		if(width==height) {
			return (float) (Math.PI*Math.pow((width/2),2));
		}
		throw new Exception("width and height should be equal in circle shape");
	}

}
