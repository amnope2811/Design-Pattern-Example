package com.demo.behavioral.strategy.before;

public class CircleBefore {

	public float calculation(float width, float height) throws Exception {
		if(width==height) {
			return (float) (Math.PI*Math.pow((width/2),2));
		}
		throw new Exception("width and height should be equal in circle shape");
	}
}
