package com.demo.creational.test;

import org.junit.After;
import org.junit.Test;

import com.demo.creational.prototyping.ClothesProtoSingle;
import com.demo.creational.prototyping.ClothesPrototyping;
import com.demo.creational.singleton.ClothesSingleton;

public class PrototypingTest {

	@Test
	public void protyping() {
		ClothesPrototyping clothes1 = new ClothesPrototyping();
		ClothesPrototyping clothes2 = clothes1.deepClone();
		System.out.println(clothes1);
		System.out.println(clothes2);
		clothes1.turnMachine();
		clothes2.turnMachine();
	}
	
	@Test
	public void protypingAndSingleton() {
		ClothesProtoSingle clothes1 = ClothesProtoSingle.getInstance();
		ClothesProtoSingle clothes2 = clothes1.deepClone();
		System.out.println(clothes1);
		System.out.println(clothes2);
		clothes1.turnMachine();
		clothes2.turnMachine();
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
	    		i=20;
	    	} 
	    }
	}
}
