package com.collection.map;
import java.util.LinkedHashMap;
/*
 * 
 * Elements are printed in the same order as they are inserted in LinkedHashMap
 * Few operations on LinkedHashMap
 * 
 * 
 */

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = 
                new LinkedHashMap<String, String>(); 
 lhm.put("one", "Learning"); 
 lhm.put("two", "Map"); 
 lhm.put("four", "Interface"); 

  System.out.println(lhm); 

 System.out.println(  lhm.get("one")); 
 System.out.println("Size of the map: " + lhm.size()); 
 System.out.println("Is map empty: " + lhm.isEmpty()); 
 System.out.println(lhm.containsKey("two")); 
 System.out.println( lhm.containsValue("Map")); 
 System.out.println("delete element 'one': " +  
                    lhm.remove("one")); 
 System.out.println(lhm); 
	}

}
