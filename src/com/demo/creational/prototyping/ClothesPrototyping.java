package com.demo.creational.prototyping;

import com.demo.creational.abstractFactory.costume.CostumeFactory;

public class ClothesPrototyping extends CostumeFactory implements Cloneable {

	@Override
	public Integer getBuildRate() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void createProduct() {
		// TODO Auto-generated method stub
		System.out.println("New Clothes Prototyping");
	}
	
	public ClothesPrototyping deepClone() {
		ClothesPrototyping clone = null;
		try {
	         clone = (ClothesPrototyping) super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	}

}
