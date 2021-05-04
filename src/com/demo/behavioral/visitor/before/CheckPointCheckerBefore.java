package com.demo.behavioral.visitor.before;

import com.demo.behavioral.visitor.checkPoint.CheckPointInterface;

public class CheckPointCheckerBefore {

	public static void check(CheckPointBefore checkpoint) {
		checkpoint.check();
	}
	
	public static void check(FinishLineBefore finishLine) {
		finishLine.check();
	}
}
