package com.demo.creational.abstractFactory;

import java.util.Timer;
import java.util.TimerTask;

public class AbstractFactoryMachine extends TimerTask {

	FactoryInterface factory;
	Timer timer = new Timer();
	Boolean isOpen =false;
	
	AbstractFactoryMachine(){
		
	}
	
	public AbstractFactoryMachine(FactoryInterface factory){
		this.factory = factory;
	}
	
	public void turnMachine() {
		if(!isOpen) {
			this.isOpen = true;
			System.out.println("machine start :" +this.factory.getClass());
			try {
				timer.schedule(this, this.factory.getBuildRate(), this.factory.getBuildRate());
			}catch(Exception e) {
				System.out.println(e);
			}
		}else {
			this.isOpen = false;
			System.out.println("machine stop");
			timer.cancel();
		}
	}

	public void run() {
		if(isOpen) {
			factory.doSequeceOrder();
		}else {
			System.out.println("machine is not open yet :" + this.factory.getClass());
		}
	}
}
