package com.demo.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

import com.demo.behavioral.visitor.checkPoint.CheckPointInterface;

public class Marathon {

	public String name;
	private List<CheckPointInterface> checkPoint = new ArrayList<CheckPointInterface>();
	
	public Marathon(String name) {
		this.name = name;
	}
	
	public Marathon addCheckPoint(CheckPointInterface checkPoint) {
		this.checkPoint.add(checkPoint);
		return this;
	}
	
	public List<CheckPointInterface> getCheckPintList(){
		return this.checkPoint;
	}
	
}
