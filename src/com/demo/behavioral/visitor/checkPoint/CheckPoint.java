package com.demo.behavioral.visitor.checkPoint;

public class CheckPoint extends CheckPointInterface{
	private String name;
	
	public CheckPoint(String name){
		this.name =name;
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		System.out.println("check point :"+this.name);
	}

}
