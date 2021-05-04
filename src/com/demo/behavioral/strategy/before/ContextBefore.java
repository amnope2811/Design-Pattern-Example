package com.demo.behavioral.strategy.before;

import com.demo.behavioral.strategy.Circle;
import com.demo.behavioral.strategy.Square;
import com.demo.behavioral.strategy.Triangle;

public class ContextBefore {

    @SuppressWarnings("null")
	public float execute(float num1, float num2,String shape) throws Exception{  
    	if(shape.equalsIgnoreCase("circle")) {
    		return new Circle().calculation(num1, num2);  
    	}else if(shape.equalsIgnoreCase("square")) {
    		return new Square().calculation(num1, num2);  
    	}else if(shape.equalsIgnoreCase("triangle")) {
    		return new Triangle().calculation(num1, num2);  
    	}
    	return (Float) null;
    }  
}
