package com.demo.behavioral.visitor;

import com.demo.behavioral.visitor.checkPoint.CheckPointInterface;

public class CheckPointChecker {

	public static void check(CheckPointInterface checkpoint) {
		checkpoint.check();
	}
}
