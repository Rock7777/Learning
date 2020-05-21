/*
 *  Generics concepts to code reuse
 * 
 * 
 * 
 */

class Test<T> 
	{ 
	     
	    T obj; 
	    Test(T obj) {  this.obj = obj;  }   
	    public T getObject()  { return this.obj; } 
	} 
public class GenericExample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test <Integer> iObj = new Test<Integer>(15); 
        System.out.println(iObj.getObject()); 
   
        
        Test <String> sObj = new Test<String>("GeeksForGeeks"); 
        System.out.println(sObj.getObject()); 


	}

}
