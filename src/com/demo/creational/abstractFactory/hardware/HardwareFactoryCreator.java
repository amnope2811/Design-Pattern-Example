package com.demo.creational.abstractFactory.hardware;

import com.demo.creational.abstractFactory.AbstractFactory;
import com.demo.creational.abstractFactory.costume.CostumeFactory;

public class HardwareFactoryCreator extends AbstractFactory{

	@Override
	public CostumeFactory getCostume(String costumeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HardwareFactory getHardware(String hardwareType) {
		switch(hardwareType.toLowerCase()) {
		  case "mainboard":
		    return new MainboardFactory();
		  case "ram":
			return new RAMFactory();
		  default:
		    return null;
		}
	}

}
