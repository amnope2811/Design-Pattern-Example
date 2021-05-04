package com.demo.behavioral.visitor;

import com.demo.behavioral.visitor.checkPoint.CheckPointInterface;

public class Participant {

	private String name;
	private Marathon marathon;
	
	public Participant(String name,Marathon marathon){
		this.name = name;
		this.marathon = marathon;
	}
	
	public void start() {
		for(CheckPointInterface checkpoint: marathon.getCheckPintList()) {
			CheckPointChecker.check(checkpoint);
		}
		System.out.print(this.name +" is finish the "+ this.marathon.name);
	}
}
