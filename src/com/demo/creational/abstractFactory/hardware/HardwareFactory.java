package com.demo.creational.abstractFactory.hardware;

import com.demo.creational.abstractFactory.AbstractFactoryMachine;
import com.demo.creational.abstractFactory.FactoryInterface;

public abstract class HardwareFactory implements FactoryInterface {
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
		performanceTest();
		pack();
	}
	
	private void pack() {
		System.out.println("Packed");
	}
	
	private void performanceTest() {
		System.out.println("Pass Performance Test");
	}
	
//	public abstract void createProduct();
}
