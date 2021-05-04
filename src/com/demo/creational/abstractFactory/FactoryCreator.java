package com.demo.creational.abstractFactory;

import com.demo.creational.abstractFactory.costume.CostumeFactoryCreator;
import com.demo.creational.abstractFactory.hardware.HardwareFactoryCreator;

public class FactoryCreator {

	public static AbstractFactory createFactory(String factoryType) {
		switch(factoryType.toLowerCase()) {
		  case "costume":
		    return new CostumeFactoryCreator();
		  case "hardware":
			return new HardwareFactoryCreator();
		  default:
		    return null;
		}
	}
}
