package com.demo.creational.abstractFactory.before;

public class ClothesFactoryBefore extends CostumeFactoryBefore{
	public static final Integer buildRate = 8000;
	
	@Override
	public Integer getBuildRate() {
		// TODO Auto-generated method stub
		return buildRate;
	}
	
	@Override
	public void createProduct() {
		System.out.println("New Clothes");
		
	}
}
