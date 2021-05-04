package com.demo.structural.test;

import org.junit.Test;

import com.demo.structural.adapter.mediaReader.MediaReader;

public class AdapterTest {

	@Test
	public void playVlc() {
		new MediaReader().read("Vlc");
	}
	
	@Test
	public void playMP4() {
		new MediaReader().read("Mp4");
	}
	
	@Test
	public void playMP3() {
		new MediaReader().read("Mp3");
	}
}
