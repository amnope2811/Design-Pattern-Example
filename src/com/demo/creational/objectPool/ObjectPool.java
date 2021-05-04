package com.demo.creational.objectPool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {          
	      
	   private ConcurrentLinkedQueue<T> pool;  
	         
	    private ScheduledExecutorService executorService;   
	       
	    public ObjectPool(final int minObjects)   
	    {  
	        // initialize pool  
	          
	        initialize(minObjects);  
	          
	    }  
	       
	     public ObjectPool(final int minObjects, final int maxObjects, final long validationInterval) {  
	        // initialize pool  
	         initialize(minObjects);  
	          // check pool conditions in a separate thread  
	        executorService = Executors.newSingleThreadScheduledExecutor();  
	        executorService.scheduleWithFixedDelay(new Runnable() 
	        {  
	            @Override  
	            public void run() {  
	            	System.out.println("validate");
	                int size = pool.size();  
	                 
	                if (size < minObjects) {  
	                	System.out.println("add");
	                    int sizeToBeAdded = minObjects + size;  
	                    for (int i = 0; i < sizeToBeAdded; i++) {  
	                        pool.add(createObject());  
	                    }  
	                } else if (size > maxObjects) {  
	                	System.out.println("remove");
	                    int sizeToBeRemoved = size - maxObjects;  
	                    for (int i = 0; i < sizeToBeRemoved; i++) {  
	                        pool.poll();  
	                    }  
	                }  
	            }  
	        }, validationInterval, validationInterval, TimeUnit.MILLISECONDS);  
	    }  
	       
	    public T borrowObject() {  
	        T object;  
	        if ((object = pool.poll()) == null)  
	        {  
	            object = createObject();  
	        }  

	        System.out.println(object.hashCode() + " was borrowed");  
	        return object;  
	    }  
	 
	    public void returnObject(T object) {  
	        if (object == null) {  
	            return;  
	        }  
	        this.pool.offer(object);  
	    }  
	  
	      public void shutdown(){  
	        if (executorService != null){  
	            executorService.shutdown();  
	        }  
	    }  
	    /* 
	        Creates a new object. 
	         @return T new object 
	     */  
	    protected abstract T createObject();  
	  
	    private void initialize(final int minObjects)  {  
	        pool = new ConcurrentLinkedQueue<T>();  
	        for (int i = 0; i < minObjects; i++) {  
	            pool.add(createObject());  
	        }  
	    }  
}
