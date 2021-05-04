package com.demo.structural.test;

import org.junit.Test;

import com.demo.structural.composite.BankManager;
import com.demo.structural.composite.Cashier;
import com.demo.structural.composite.Employee;

public class CompositeTest {

	@Test
	public void add() {
		Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);  
        Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);  
        Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  
           
        manager1.add(emp1);  
        manager1.add(emp2);
        manager1.print(); 
	}
	
	@Test
	public void remove() {
		Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);  
        Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);  
        Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  
           
        manager1.add(emp1);  
        manager1.add(emp2);
        manager1.remove(emp2); 
        
        manager1.print();
	}
}
