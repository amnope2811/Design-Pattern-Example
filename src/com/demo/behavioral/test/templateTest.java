package com.demo.behavioral.test;

import org.junit.After;
import org.junit.Test;

import com.demo.behavioral.template.GasOven;
import com.demo.behavioral.template.MicrowaveOven;
import com.demo.behavioral.template.OvenInterface;

public class templateTest {
	OvenInterface oven;

	@Test
	public void microwaveOven() {
		oven = new MicrowaveOven(10000);
		oven.start();
	}
	
	@Test
	public void gasOven() {
		oven = new GasOven(6000);
		oven.start();
	}
	
	@After
	public void tearDown() {
		int i =0;
	    while (i<oven.getSettingTime()) {
	    	try {
	    		Thread.sleep(1000);
				i+=1000;
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	} 
	    }
	}
}
