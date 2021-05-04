package com.demo.behavioral.visitor.before;

public class CheckPointBefore {

	private String name;
	
	public CheckPointBefore(String name){
		this.name =name;
	}

	public void check() {
		System.out.println("check");
		visit();
	}
	
	public void visit() {
		System.out.println("check point :"+this.name);
	}
}
