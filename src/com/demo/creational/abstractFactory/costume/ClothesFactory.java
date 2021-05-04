package com.demo.creational.abstractFactory.costume;

public class ClothesFactory extends CostumeFactory{
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
