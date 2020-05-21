/*
 *  Inner class Type 1 : Nested Inner class
 *  where Inner class can access private data of Outer class
 * 
 * 
 * 
 * 
 */


class Outer { 
 
		   class Inner { 
		      public void show() { 
		           System.out.println("In a nested class method"); 
		      } 
		   } 
		} 
		class Program1 { 
		   public static void main(String[] args) { 
		       Outer.Inner in = new Outer().new Inner(); 
		       in.show(); 
		   } 
		} 


