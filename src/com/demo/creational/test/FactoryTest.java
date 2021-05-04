package com.demo.creational.test;

import org.junit.After;
import org.junit.Test;

import com.demo.creational.factory.ClothesFactory;
import com.demo.creational.factory.FactoryInterface;
import com.demo.creational.factory.ShoesFactory;

public class FactoryTest {
	FactoryInterface shoes ;
	FactoryInterface clothes;

	@Test
	public void shoesAndColthes() {
		shoes = new ShoesFactory(3000);
		clothes = new ClothesFactory();
		shoes.turnMachine();
		clothes.turnMachine();
	}
	
	@After
	public void tearDown() {
		int i =0;
	    while (i<20) {
	    	try {
	    		Thread.sleep(1000);
				i++;
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	} 
	    }
	    shoes.turnMachine();
	    clothes.turnMachine();
	}
}
