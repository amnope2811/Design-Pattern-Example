package com.demo.behavioral.strategy;

public class Context {
	
	private StrategyInterface strategy;  
    
    public Context(StrategyInterface strategy){  
       this.strategy = strategy;  
    }  

    public float execute(float num1, float num2) throws Exception{  
       return strategy.calculation(num1, num2);  
    }  
}
