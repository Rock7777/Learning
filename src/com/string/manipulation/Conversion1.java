package com.string.manipulation;


/*
 * 
 * 
 * Conversion from StringBuffer and StringBuilder to String
 * 
 * 
 */

public class Conversion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sbr = new StringBuffer("Project"); 
        StringBuilder sbdr = new StringBuilder("Working"); 
          
         String str = sbr.toString(); 
        System.out.println("StringBuffer object to String : "+str); 
        
          String str1 = sbdr.toString(); 
        System.out.println("StringBuilder object to String : "+str1); 
       sbr.append("ForGeeks"); 
        System.out.println(sbr); 
        System.out.println(str); 
	}

}
