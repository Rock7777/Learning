package com.no.synchronize;

public class NoSynchronizationExample {

	public static void main(String[] args) {
		TestThread PD = new TestThread();
	      Thread t1 = new Thread(PD );
	      Thread t2 = new Thread(PD );
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
