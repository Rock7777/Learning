package com.collection.set;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
/*
 * 
 * Conversion of HashMap to TreeMap
 * 
 * 
 * 
 */

public class Conversion {

	public static void main(String[] args) {
		
		Set<String> setobj = new HashSet<>(); 
        setobj.add("Welcome"); 
        setobj.add("To"); 
        setobj.add("Project"); 
        setobj.add("For"); 
        setobj.add("Company"); 
  
        System.out.println("HashSet: "
                           + setobj); 
  
        
        Set<String> hashSetToTreeSet 
            = new TreeSet<>(setobj); 
  
        
        System.out.println("TreeSet: "
                           + hashSetToTreeSet);
	}

}
