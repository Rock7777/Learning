package com.collection.map;
import java.util.TreeMap;
/*
 * 
 * 
 * TreeMap basic example where sorting is done based on key
 */

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tree_map 
        = new TreeMap<Integer, String>(); 

    
    tree_map.put(100, "Geeks"); 
    tree_map.put(1, "4"); 
    tree_map.put(23, "Geeks"); 
    tree_map.put(22, "Welcomes"); 
    tree_map.put(29, "You"); 

    
    System.out.println("TreeMap: "
                       + tree_map); 
	}

}
