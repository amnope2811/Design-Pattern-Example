package com.demo.behavioral.template;

import java.util.Timer;
import java.util.TimerTask;

public abstract class OvenInterface extends TimerTask {

	Timer timer = new Timer();
	public Integer currentTime = 0;
	
	public abstract void stop();
	public abstract Integer getSettingTime();
	public abstract void heating();
	
	public void start() {
		Integer settingTime =getSettingTime();
		Integer remainingTime = settingTime -currentTime;
		timer.schedule(this, 0, remainingTime>1000? 1000:remainingTime);
	}
	
	public void run() {
		Integer settingTime =getSettingTime();
		if(currentTime<settingTime) {
			currentTime+=1000;
			heating();
		}else {
			stop();
			timer.cancel();
		}
	}
	
}
