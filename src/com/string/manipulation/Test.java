package com.string.manipulation;

public class Test {
	public static void concat1(String s1) 
    { 
        s1 = s1 + "Running"; 
    } 
  
    
    public static void concat2(StringBuilder s2) 
    { 
        s2.append("Running"); 
    } 
  
   
    public static void concat3(StringBuffer s3) 
    { 
        s3.append("Running"); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Project"; 
        concat1(s1);
        System.out.println("String: " + s1); 
  
        StringBuilder s2 = new StringBuilder("Project"); 
        concat2(s2); 
        System.out.println("StringBuilder: " + s2); 
  
        StringBuffer s3 = new StringBuffer("Project"); 
        concat3(s3);  
        System.out.println("StringBuffer: " + s3); 

	}

}
