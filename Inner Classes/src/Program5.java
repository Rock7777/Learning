/*
 * 
 * Static Nested classes
 * 
 * 
 */


class Outer2 { 
   private static void outerMethod() { 
     System.out.println("inside outerMethod"); 
   } 
     
    
   static class Program5 { 
     public static void main(String[] args) { 
        System.out.println("inside inner class Method"); 
        outerMethod(); 
     } 
   } 
  
}