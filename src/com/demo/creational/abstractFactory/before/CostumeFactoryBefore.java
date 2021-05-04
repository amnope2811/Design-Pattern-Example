package com.demo.creational.abstractFactory.before;

public abstract class CostumeFactoryBefore {

	private CostumeMachineBefore machine;
	
	public String turnMachine() {
		if(machine==null) {
			machine = new CostumeMachineBefore(this);
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
	
	public abstract void createProduct();
	public abstract Integer getBuildRate();
}
