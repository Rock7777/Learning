package com.string.manipulation;


/*
 * Conversion from StringBuffer to String and then to StringBuilder
 * 
 * 
 * 
 * 
 */

public class Conversion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbr = new StringBuffer("Hello"); 
        
       
        String str = sbr.toString(); 
        StringBuilder sbl = new StringBuilder(str); 
          
        System.out.println("StringBuilderObject"+" " + sbl);
	}

}
