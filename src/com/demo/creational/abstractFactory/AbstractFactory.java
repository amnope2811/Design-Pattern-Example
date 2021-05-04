package com.demo.creational.abstractFactory;

import com.demo.creational.abstractFactory.costume.CostumeFactory;
import com.demo.creational.abstractFactory.hardware.HardwareFactory;

public abstract class AbstractFactory {
	public abstract CostumeFactory getCostume(String costumeType);  
	public abstract HardwareFactory getHardware(String hardwareType);  
}
