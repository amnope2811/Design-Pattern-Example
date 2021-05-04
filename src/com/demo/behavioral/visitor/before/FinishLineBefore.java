package com.demo.behavioral.visitor.before;

public class FinishLineBefore {

	public void check() {
		System.out.println("check");
		visit();
	}
	
	public void visit() {
		// TODO Auto-generated method stub
		System.out.println("Finish line");
	}
}
