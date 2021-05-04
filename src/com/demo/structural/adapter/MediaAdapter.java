package com.demo.structural.adapter;

import com.demo.structural.adapter.mediaPlayer.Mp4Player;
import com.demo.structural.adapter.mediaPlayer.VlcPlayer;

public class MediaAdapter{

	   public static void play(String audioType) {
	   
	      if(audioType.equalsIgnoreCase("vlc")){
	    	  new VlcPlayer().play();
	      }
	      else if(audioType.equalsIgnoreCase("mp4")){
	    	  new Mp4Player().play();
	      }
	   }
	}
