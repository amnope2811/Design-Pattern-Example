package com.demo.behavioral.test;

import org.junit.Test;

import com.demo.behavioral.visitor.Marathon;
import com.demo.behavioral.visitor.Participant;
import com.demo.behavioral.visitor.checkPoint.CheckPoint;
import com.demo.behavioral.visitor.checkPoint.FinishLine;

public class VisitorTest {

	@Test
	public void marathon() {
		Marathon marathon = new Marathon("Buriram Marathon");
		marathon.addCheckPoint(new CheckPoint("check point1"))
			.addCheckPoint(new CheckPoint("check point2"))
			.addCheckPoint(new CheckPoint("check point3"))
			.addCheckPoint(new FinishLine());
		
		Participant participant = new Participant("Darth Vador",marathon);
		participant.start();
	}
}
