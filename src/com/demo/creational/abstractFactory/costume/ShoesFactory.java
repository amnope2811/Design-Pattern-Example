package com.demo.creational.abstractFactory.costume;

public class ShoesFactory extends CostumeFactory{
	public static final Integer buildRate = 3000;
	
	@Override
	public Integer getBuildRate() {
		// TODO Auto-generated method stub
		return buildRate;
	}
	
	@Override
	public void createProduct() {
		System.out.println("New Shoe");
	}

}
