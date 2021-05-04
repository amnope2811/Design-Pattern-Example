package com.demo.structural.test;

import org.junit.Test;

import com.demo.structural.facade.ShopKeeper;

public class FacadeTest {

	@Test
	public void mobileShop() {
		ShopKeeper sk=new ShopKeeper();  
		sk.iphoneSale();
		sk.samsungSale();
	}
}
