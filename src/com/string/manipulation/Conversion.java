package com.string.manipulation;

/*
 * 
 *  conversion of String to StringBuilder and conversion string to StringBuilder
 * 
 * 
 */

public class Conversion {

	public static void main(String[] args) {
		
		String str = "Project"; 
        
         
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBufferConversion:"+sbr); 
          
         
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("Running"); 
        System.out.println("String to StringBuilderConversion:"+sbl); 
	}

}
