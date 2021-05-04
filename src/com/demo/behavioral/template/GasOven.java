package com.demo.behavioral.template;

public class GasOven extends OvenInterface{
	
	private Integer settingTime;
	
	public GasOven(Integer settingTime){
		this.settingTime = settingTime;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("PING!!");
	}

	@Override
	public Integer getSettingTime() {
		// TODO Auto-generated method stub
		return this.settingTime;
	}

	@Override
	public void heating() {
		// TODO Auto-generated method stub
		System.out.println("TICTOK!");
	}

}
