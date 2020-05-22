package com.collections.list;
import java.util.LinkedList;
/*
 * 
 * Linked list basic operations
 * 
 * 
 */

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>(); 
		  
        
        l1.add("A"); 
        l1.add("B"); 
        l1.addLast("C"); 
        l1.addFirst("D"); 
        l1.add(2, "E"); 
        l1.add("F"); 
        l1.add("G"); 
        System.out.println("Linked list : " + l1); 
  
        
        l1.remove("B"); 
        l1.remove(3); 
        l1.removeFirst(); 
        l1.removeLast(); 
        System.out.println("Linked list after deletion: " + l1); 
  
       
        boolean status = l1.contains("E"); 
  
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
  
       
        int size = l1.size(); 
        System.out.println("Size of linked list = " + size); 
  
       
        Object element = l1.get(2); 
        System.out.println("Element returned by get() : " + element); 
        l1.set(2, "Y"); 
        System.out.println("Linked list after change : " + l1); 

	}

}
