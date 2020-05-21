package com.block.synchronize;

public class BlockSynchronizationExample {

	public static void main(String[] args) {
	  
		TestThreadDemo t = new TestThreadDemo();
	      Thread t1 = new Thread(t);
	      Thread t2 = new Thread(t);
	      t1.start();
	      t2.start();
	      
	      try {
	         t1.join();
	         t2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }

	}

}
