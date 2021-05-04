package com.demo.creational.prototyping;

import com.demo.creational.abstractFactory.costume.CostumeFactory;

public class ClothesProtoSingle extends CostumeFactory implements Cloneable{
	
	public static ClothesProtoSingle instance;
	
	private ClothesProtoSingle() {
		System.out.println("init clothes "+ this);
	}
	
	public static ClothesProtoSingle getInstance() {
		if(instance==null) {
			 instance = new ClothesProtoSingle();
		}
		return instance;
	}

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
	
	public ClothesProtoSingle deepClone() {
		ClothesProtoSingle clone = null;
		try {
	         clone = (ClothesProtoSingle) super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	}
}
