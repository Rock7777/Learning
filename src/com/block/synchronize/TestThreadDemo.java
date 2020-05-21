package com.block.synchronize;

public class TestThreadDemo extends Thread {
	
	public void printCount() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread " +  Thread.currentThread().getName()+" interrupted.");
	      }
	   }
	   public void run() {
	      synchronized(this) {
	         printCount();
	      }
	      System.out.println("Thread " +  Thread.currentThread().getName() + " exiting.");
	   }   

}
