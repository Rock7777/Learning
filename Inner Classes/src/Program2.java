/*
 * 
 * Method Local Inner class Example
 * Inner class in outer method cannot access local variable of outer variable unless it
 * is declared final
 * 
 * 
 * 
 */

	class Outer1 { 
	    void outerMethod() { 
	        System.out.println("inside outerMethod"); 
	         
	        class Inner { 
	            void innerMethod() { 
	                System.out.println("inside innerMethod"); 
	            } 
	        } 
	        Inner y = new Inner(); 
	        y.innerMethod(); 
	    } 
	} 
	class Program2 { 
	    public static void main(String[] args) { 
	        Outer1 x = new Outer1(); 
	        x.outerMethod(); 
	    } 
	} 


