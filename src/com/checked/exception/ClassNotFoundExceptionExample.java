package com.checked.exception;
/*
 * Example of another Checked Exception
 * 
 * 
 * 
 */
public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		try {
		      Class.forName("com.checked.MyInvisibleClass");

		      ClassLoader.getSystemClassLoader().loadClass("com.checked.MyInvisibleClass");

		      ClassLoader.getSystemClassLoader().loadClass("com.checked.MyInvisibleClass");
		    } catch (ClassNotFoundException e) {
		      e.printStackTrace();
		    }

	}

}
