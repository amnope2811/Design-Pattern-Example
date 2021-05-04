package com.demo.creational.factory;

import java.util.Timer;
import java.util.TimerTask;

public class FactoryMachine extends TimerTask {
	
	FactoryInterface factory;
	Timer timer = new Timer();
	Boolean isOpen =false;
	
	FactoryMachine(){
		
	}
	
	public FactoryMachine(FactoryInterface factory){
		this.factory = factory;
	}
	
	public void turnMachine() {
		if(!isOpen) {
			this.isOpen = true;
			System.out.println("machine start :" +this.factory.getClass());
			timer.schedule(this, this.factory.buildRate, this.factory.buildRate);
		}else {
			this.isOpen = false;
			System.out.println("machine stop :" +this.factory.getClass());
			timer.cancel();
		}
	}

	public void run() {
		if(isOpen) {
			factory.createProduct();
		}else {
			System.out.println("machine is not open yet :" + this.factory.getClass());
		}
	}
}
