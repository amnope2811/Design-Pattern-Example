package com.demo.creational.test;

import org.junit.After;
import org.junit.Test;

import com.demo.creational.abstractFactory.AbstractFactory;
import com.demo.creational.abstractFactory.FactoryCreator;
import com.demo.creational.abstractFactory.costume.CostumeFactory;

public class AbstractFactoryTest {

	@Test
	public void abstractFactory() {
		AbstractFactory costumeFactory  = FactoryCreator.createFactory("costume");
		CostumeFactory shoesFactory= costumeFactory.getCostume("shoes");
		shoesFactory.turnMachine();
		
		FactoryCreator.createFactory("costume").getCostume("clothes").turnMachine();
		FactoryCreator.createFactory("hardware").getHardware("mainboard").turnMachine();
		FactoryCreator.createFactory("hardware").getHardware("ram").turnMachine();
	}
	
	@Test
	public void memoryTest() {
		CostumeFactory clothes1 =FactoryCreator.createFactory("costume").getCostume("clothes");
		clothes1.turnMachine();
		CostumeFactory clothes2 =FactoryCreator.createFactory("costume").getCostume("clothes");
		clothes2.turnMachine();
		
		System.out.println(clothes1.hashCode());
		System.out.println(clothes2.hashCode());
	}
	
	@After
	public void tearDown() {
	    while (true) { try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
	}
}
