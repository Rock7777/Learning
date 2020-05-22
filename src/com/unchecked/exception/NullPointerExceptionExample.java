package com.unchecked.exception;
/*
 * All unchecked Exceptions come under RunTimeException class
 * 
 * NullPointerException can be avoided by calling equals method on literals rather than on object
 * 
 */

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String ptr = null; 
		  
       
        try
        { 
         
            if (ptr.equals("gfg")) 
                System.out.print("Same"); 
            else 
                System.out.print("Not Same"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught"); 
        } 

	}

}
