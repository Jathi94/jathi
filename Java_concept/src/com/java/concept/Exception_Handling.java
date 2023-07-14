package com.java.concept;

public class Exception_Handling {

	public static void main(String[] args) throws Exception {
		
		//arithmetic exception
		

		//int a = 20;
//		Thread.sleep();
//		System.out.println(a / 0);

//		try {
//
//			System.out.println(a / 0);
//			
//		} catch (ArithmeticException e) {
//
//			System.out.println(e.getMessage());
//
//		}

//		
		//Null pointer Exception
		
		String s=null;
		
		
		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		
		
	}
	
	
	

  

}
