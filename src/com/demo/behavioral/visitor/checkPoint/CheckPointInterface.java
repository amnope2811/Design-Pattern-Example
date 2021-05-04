package com.demo.behavioral.visitor.checkPoint;

public abstract class CheckPointInterface {

	public void check() {
		System.out.println("check");
		visit();
	}
	
	public abstract void visit();
}
