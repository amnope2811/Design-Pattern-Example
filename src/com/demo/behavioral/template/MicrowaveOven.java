package com.demo.behavioral.template;

public class MicrowaveOven extends OvenInterface {
	private Integer settingTime;
	
	public MicrowaveOven(Integer settingTime){
		this.settingTime = settingTime;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BEEP!! BEEP!!");
	}

	@Override
	public Integer getSettingTime() {
		// TODO Auto-generated method stub
		return this.settingTime;
	}

	@Override
	public void heating() {
		// TODO Auto-generated method stub
		System.out.println("WOO!");
	}

}
