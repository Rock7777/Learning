package com.unchecked.exception;
/*
 * 
 * ArrayIndexOutOfBoundsException Example which comes under Unchecked(Runtime) Exception
 * 
 * 
 * 
 */

public class UncheckedExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			   int arr[] ={1,2,3,4,5};
			   System.out.println(arr[7]);
			}
		        catch(ArrayIndexOutOfBoundsException e){
			   System.out.println("Index does  not exist");
			}
	}

}
