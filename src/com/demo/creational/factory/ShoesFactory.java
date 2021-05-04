package com.demo.creational.factory;

public class ShoesFactory extends FactoryInterface {
	
	public ShoesFactory(Integer buildRate) {
		super();
		this.buildRate = buildRate;
		System.out.println(this);
	}

	@Override
	public void createProduct() {
		System.out.println("New Shoe");
	}
	
//	@Override
//	public void turnMachine() {
//		System.out.println("turnMachine decorator");
//		super.turnMachine();
//	}

}
