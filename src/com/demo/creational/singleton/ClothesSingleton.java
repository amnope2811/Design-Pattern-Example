package com.demo.creational.singleton;

import com.demo.creational.abstractFactory.costume.CostumeFactory;

public class ClothesSingleton extends CostumeFactory{

	public static ClothesSingleton instance;
	
	private ClothesSingleton() {
		System.out.println("init clothes "+ this);
	}
	
	public static ClothesSingleton getInstance() {
		if(instance==null) {
			 instance = new ClothesSingleton();
			 System.out.println("init instance with "+ instance.hashCode());
		}
		return instance;
	}

	@Override
	public void createProduct() {
		System.out.println("New Clothes Singleton");
	}

	@Override
	public Integer getBuildRate() {
		return 10000;
	}
}
