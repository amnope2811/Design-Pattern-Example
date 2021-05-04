package com.demo.creational.factory;

public abstract class FactoryInterface {
	public Integer buildRate=10000;
	private FactoryMachine machine;
	
	public FactoryInterface(){
		System.out.println("Factory Interface");
		System.out.println(this);
	}
	
	
	public void turnMachine() {
		if(machine==null) {
			machine = new FactoryMachine(this);
		}
		machine.turnMachine();
	}
	
	public abstract void createProduct();
}
