package com.collection.set;
import java.util.HashSet;
import java.util.Iterator;
/*
 * 
 * HashSet pgm containing trying to duplicate and iterating actions
 * 
 * 
 * 
 */
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>(); 
		  
         
        h.add("India"); 
        h.add("Australia"); 
        h.add("South Africa"); 
        h.add("India");
  
        
        System.out.println(h); 
        System.out.println("List contains India or not:" + 
                           h.contains("India")); 
  
         
        h.remove("Australia"); 
        System.out.println("List after removing Australia:"+h); 
  
       
        System.out.println("Iterating over list:"); 
        Iterator<String> i = h.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
	}

}
