package com.unchecked.exception;
/*
 * 
 * 
 *   
 */

public class IllegalArgumentExceptionExample {

	public static void main(String[] args) {
		String s = ""; 
        try
        { 
            System.out.println(getLength(s)); 
        } 
        catch(IllegalArgumentException e) 
        { 
            System.out.println("IllegalArgumentException caught"); 
        } 
  
         
        s = "Hello"; 
        try
        { 
            System.out.println(getLength(s)); 
        } 
        catch(IllegalArgumentException e) 
        { 
            System.out.println("IllegalArgumentException caught"); 
        } 
  
        
        s = null; 
        try
        { 
            System.out.println(getLength(s)); 
        } 
        catch(IllegalArgumentException e) 
        { 
            System.out.println("IllegalArgumentException caught"); 
        } 
    } 
  
  
    public static int getLength(String s) 
    { 
        if (s == null) 
            throw new IllegalArgumentException("The argument cannot be null"); 
        return s.length(); 
    } 

	}


