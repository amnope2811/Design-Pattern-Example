package com.demo.creational.objectPool;

public class ExportingProcess {
	
	private long processNo;  
	  
    public ExportingProcess(long processNo)  { 
         this.processNo = processNo;  
        // do some  expensive calls / tasks here in future  
        // .........  
      System.out.println("Object with process no. " + processNo + " was created :"+this.hashCode());  
     }  
     
    public long getProcessNo() {  
        return processNo;  
    }  
}
