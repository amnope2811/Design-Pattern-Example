package com.demo.behavioral.test;

import org.junit.Test;

import com.demo.behavioral.strategy.Circle;
import com.demo.behavioral.strategy.Context;
import com.demo.behavioral.strategy.Square;
import com.demo.behavioral.strategy.Triangle;

public class StrategyTest {

	@Test
	public void circle() throws Exception {
		System.out.println(new Context(new Circle()).execute(10, 10));
	}
	
	@Test
	public void square() throws Exception {
		System.out.println(new Context(new Square()).execute(10, 10));
	}
	
	@Test
	public void triangle() throws Exception {
		System.out.println(new Context(new Triangle()).execute(10, 10));
	}
}
