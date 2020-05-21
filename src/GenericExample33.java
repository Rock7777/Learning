/*
 * 
 * 
 *   Generic Functions example
 * 
 */
public class GenericExample33 {
	static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericDisplay(11); 
		   
	       
        genericDisplay("GeeksForGeeks"); 
   
        
        genericDisplay(1.0); 
	}

}
