package com.demo.creational.abstractFactory.costume;

import com.demo.creational.abstractFactory.AbstractFactory;
import com.demo.creational.abstractFactory.hardware.HardwareFactory;

public class CostumeFactoryCreator extends AbstractFactory{

	@Override
	public CostumeFactory getCostume(String costumeType) {
		switch(costumeType.toLowerCase()) {
		  case "clothes":
		    return new ClothesFactory();
		  case "shoes":
			return new ShoesFactory();
		  default:
		    return null;
		}
	}

	@Override
	public HardwareFactory getHardware(String hardwareType) {
		// TODO Auto-generated method stub
		return null;
	}

}
