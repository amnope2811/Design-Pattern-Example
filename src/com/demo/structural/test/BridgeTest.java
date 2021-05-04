package com.demo.structural.test;

import org.junit.Test;

import com.demo.structural.bridge.Circle;
import com.demo.structural.bridge.drawAPI.GreenCircle;
import com.demo.structural.bridge.drawAPI.RedCircle;

public class BridgeTest {

	@Test
	public void bridge() {
		new Circle(100,100, 10, new RedCircle()).draw();
		new Circle(100,100, 10, new GreenCircle()).draw();
	}
}
