package com.method.synchronize;

public class MethodSynchronizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t = new TestThread();
	      Thread t1 = new Thread(t);
	      Thread t2 = new Thread(t);
	      t1.start();
	      t2.start();
	      // wait for threads to end
	      try {
	         t1.join();
	         t2.join();
	      } catch ( Exception e) {
	         System.out.println("Interrupted");
	      }
	}

}
