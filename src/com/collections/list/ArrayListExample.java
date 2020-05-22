package com.collections.list;
import java.util.ArrayList;

/*
 *  Search operations on ArrayList
 * 
 * 
 * 
 * 
 */

public class ArrayListExample {

	public static void main(String[] args) {
		
		 ArrayList<String> l = new ArrayList<String>(); 
	        l.add("Hii"); 
	        l.add("Today"); 
	        l.add("Fun"); 
	        l.add("Today");
	        l.add("Hii");
	  
	        
	        System.out.println("first index of Hii:"
	                           + l.indexOf("Hii")); 
	        System.out.println("last index of Hii:"
	                           + l.lastIndexOf("Hii")); 
	        System.out.println("first index of Today:"
                    + l.indexOf("Today"));
	        System.out.println("last index of Today:"
                    + l.indexOf("Today"));
	        System.out.println(l.indexOf("Heyy"));
	        
	}

}
