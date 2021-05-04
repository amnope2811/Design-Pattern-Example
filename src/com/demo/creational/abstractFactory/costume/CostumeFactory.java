package com.demo.creational.abstractFactory.costume;

import com.demo.creational.abstractFactory.AbstractFactoryMachine;
import com.demo.creational.abstractFactory.FactoryInterface;

public abstract class CostumeFactory implements FactoryInterface {
	private AbstractFactoryMachine machine;
	
	public String turnMachine() {
		if(machine==null) {
			machine = new AbstractFactoryMachine(this);
		}
		machine.turnMachine();
		return null;
	}
	
	public void doSequeceOrder() {
		createProduct();
		pack();
	}
	
	private void pack() {
		System.out.println("Wrap");
	}
	
//	protected abstract void createProduct();
}
