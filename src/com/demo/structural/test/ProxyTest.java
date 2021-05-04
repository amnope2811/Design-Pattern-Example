package com.demo.structural.test;

import org.junit.Test;

import com.demo.structural.proxy.ProxyInternetAccess;

public class ProxyTest {

	@Test
	public void internetAccess() {
		new ProxyInternetAccess("admin 1").grantInternetAccess();;
	}
}
