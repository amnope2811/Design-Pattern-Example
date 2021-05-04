package com.demo.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {  
    private String employeeName;  
    private RealInternetAccess  realaccess;  
    
    public ProxyInternetAccess(String employeeName) {  
    	this.employeeName = employeeName;  
    } 
    
	@Override  
	public void grantInternetAccess()   
	{  
	     if (getRole(employeeName))   
	     {  
	         realaccess = new RealInternetAccess(employeeName);  
	         realaccess.grantInternetAccess();  
	     }   
	     else   
	     {  
	         System.out.println("No Internet access granted.");  
	     }  
	}  
	
	public Boolean getRole(String emplName) {  
	     if(emplName.toLowerCase().contains("admin")) {
	    	 return true;
	     }
	     return false;
	}  
}  
