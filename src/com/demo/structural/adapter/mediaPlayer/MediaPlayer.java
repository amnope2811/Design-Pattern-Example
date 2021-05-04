package com.demo.structural.adapter.mediaPlayer;

public abstract class MediaPlayer {
	public void play() {
		System.out.println("play "+ this.getClass());
	}
}
