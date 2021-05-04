package com.demo.creational.test;

import org.junit.After;
import org.junit.Test;

import com.demo.creational.singleton.ClothesSingleton;

public class SingletonTest {

	@Test
	public void singleton() {
		ClothesSingleton.getInstance().turnMachine();
		ClothesSingleton.getInstance().turnMachine();
	}
	
	@Test
	public void init2Time() {
		ClothesSingleton a =ClothesSingleton.getInstance();
		ClothesSingleton b =ClothesSingleton.getInstance();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a.turnMachine();
		b.turnMachine();
	}
	
	@Test
	public void burst() {
		ClothesSingleton a =ClothesSingleton.getInstance();
		ClothesSingleton b =ClothesSingleton.getInstance();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a.turnMachine();
		b.turnMachine();
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
