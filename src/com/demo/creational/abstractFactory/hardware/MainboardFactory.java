package com.demo.creational.abstractFactory.hardware;

public class MainboardFactory extends HardwareFactory {
	public static final Integer buildRate = 20000;
	
	@Override
	public void createProduct() {
		System.out.println("New Mainboard");
	}

	@Override
	public Integer getBuildRate() {
		// TODO Auto-generated method stub
		return buildRate;
	}

}
