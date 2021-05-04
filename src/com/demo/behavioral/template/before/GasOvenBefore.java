package com.demo.behavioral.template.before;

import java.util.Timer;
import java.util.TimerTask;

public class GasOvenBefore extends TimerTask {

	Timer timer = new Timer();
	public Integer currentTime = 0;

	private Integer settingTime;

	public GasOvenBefore(Integer settingTime){
		this.settingTime = settingTime;
	}

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

	public void stop() {
		System.out.println("PING!!");
	}

	public Integer getSettingTime() {
		return this.settingTime;
	}

	public void heating() {
		System.out.println("TICTOK!");
	}
}
