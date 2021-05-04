package com.demo.behavioral.strategy;

public class Square implements StrategyInterface{

	@Override
	public float calculation(float width, float height) throws Exception {
		return (float) width*height;
	}
}
