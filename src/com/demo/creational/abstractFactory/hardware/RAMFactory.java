package com.demo.creational.abstractFactory.hardware;

public class RAMFactory extends HardwareFactory{
	public static final Integer buildRate = 10000;
	
	@Override
	public Integer getBuildRate() {
		// TODO Auto-generated method stub
		return buildRate;
	}

	@Override
	public void createProduct() {
		System.out.println("New RAM");
	}
}
