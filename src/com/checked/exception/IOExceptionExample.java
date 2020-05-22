package com.checked.exception;
import java.io.*;
/*
 * cHECked Exceptions 
 * we use IOException bcecause it is a parent class of FileNotFoundException
 * 
 * 
 * 
 */

public class IOExceptionExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileReader file = new FileReader("C:/Users/PC/Downloads/eclipse/check.txt"); 
	        BufferedReader fileInput = new BufferedReader(file); 
	          
	        // Print first 3 lines of file "C:\test\a.txt" 
	        for (int counter = 0; counter < 3; counter++)  
	            System.out.println(fileInput.readLine()); 
	          
	        fileInput.close(); 

	}

}
