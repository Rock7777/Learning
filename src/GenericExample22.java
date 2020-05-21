/*
 *   Sending Multiple arguments 
 * 
 * 
 * 
 * 
 */

class Test1<T,U,R> 
	{ 
	    T obj1;  
	    U obj2;  
	    R obj3;  
	    
	    Test1(T obj1, U obj2, R obj3) 
	    { 
	        this.obj1 = obj1; 
	        this.obj2 = obj2; 
	        this.obj3 = obj3;
	    } 
	  
	    
	    public void print() 
	    { 
	        System.out.println(obj1); 
	        System.out.println(obj2); 
	        System.out.println(obj3);
	    } 
	} 
public class GenericExample22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1<String, Integer,String> obj = 
	            new Test1<String, Integer,String>("GfG", 15,"MKR"); 
	  
	        obj.print(); 

	}

}
