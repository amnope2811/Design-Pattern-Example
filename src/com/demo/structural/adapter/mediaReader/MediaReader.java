package com.demo.structural.adapter.mediaReader;

import com.demo.structural.adapter.MediaAdapter;

public class MediaReader {

	   public void read(String audioType) {		
	      
	      if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	         MediaAdapter.play(audioType);
	      }
	      
	      else{
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }
	   }   
}
