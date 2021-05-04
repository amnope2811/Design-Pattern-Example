package com.demo.creational.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.demo.creational.objectPool.ExportingProcess;
import com.demo.creational.objectPool.ExportingTask;
import com.demo.creational.objectPool.ObjectPool;

public class ObjectPoolTest {
	private ObjectPool<ExportingProcess> pool; 

    private AtomicLong processNo=new AtomicLong(0);  
    @Before
    public void setUp() {   
    pool = new ObjectPool<ExportingProcess>(2, 3, 1)  
      {  
          protected ExportingProcess createObject()  
          {  
              // create a test object which takes some time for creation  
              return new ExportingProcess( processNo.incrementAndGet());  
          }  
      };  
  }  
  @After
  public void tearDown() {  
      pool.shutdown();  
  }  
  @Test
  public void testObjectPool() {  
      ExecutorService executor = Executors.newFixedThreadPool(8);  

      // execute 8 tasks in separate threads  
        
      executor.execute(new ExportingTask(pool, 1));  
      executor.execute(new ExportingTask(pool, 2));  
      executor.execute(new ExportingTask(pool, 3));  
      executor.execute(new ExportingTask(pool, 4));  
      executor.execute(new ExportingTask(pool, 5));  
      executor.execute(new ExportingTask(pool, 6));  
      executor.execute(new ExportingTask(pool, 7));  
      executor.execute(new ExportingTask(pool, 8));  
      executor.execute(new ExportingTask(pool, 9));  
      executor.execute(new ExportingTask(pool, 10));  
      executor.execute(new ExportingTask(pool, 11));  
      executor.execute(new ExportingTask(pool, 12));  
      executor.execute(new ExportingTask(pool, 13)); 
      executor.execute(new ExportingTask(pool, 14));  

      executor.shutdown();  
      try {  
          executor.awaitTermination(30, TimeUnit.SECONDS);  
          } catch (InterruptedException e)  
            
            {  
             e.printStackTrace();  
            }  
  }  
}
