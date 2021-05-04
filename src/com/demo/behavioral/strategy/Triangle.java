package com.demo.behavioral.strategy;

public class Triangle implements StrategyInterface{

	@Override
	public float calculation(float width, float height) throws Exception {
		return (float) width*height/2;
	}
}
