package com.collections.list;
import java.util.ArrayList;
/*
 * Basic operations on ArrayList
 * 
 * 
 * 
 */

public class ArrayListProgram2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);  
        l1.add(1, 2);  
        System.out.println("ArrayList list1:"+l1); 
  
        
        ArrayList<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); 
        l2.add(2); 
        l2.add(3); 
  
        
        l1.addAll(1, l2); 
        System.out.println("ArrayList after adding list1 to list2:"+l1); 
  
        
        l1.remove(1); 
        System.out.println("ArrayList after removal:"+l1); 
  
        
        System.out.println("ArrayList retrieval of index 3:"+l1.get(3)); 
  
        
        l1.set(0, 5); 
        System.out.println("ArrayList after modification:"+l1); 

	}

}
