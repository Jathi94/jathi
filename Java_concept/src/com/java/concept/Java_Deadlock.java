package com.java.concept;

public class Java_Deadlock {
	
	//part of multithreading
	//realtime example : 1st obj-Desktop = 1st resource-printer;
					//	 2nd obj-Laptop = 2nd resource-  scanner ;
	
  public static void main(String[] args) {
	
	  String resource1 ="printer";
	  String resource2 ="Scanner";
	  Runnable run1 = ()->{
		  synchronized (resource1) {
			  System.out.println(Thread.currentThread().getName()+":Locked"+ resource1);
			  try {
				  Thread.sleep(100);
			  }catch(Exception e) {}
			  synchronized (resource2) {
				  System.out.println(Thread.currentThread().getName()+":Locked"+ resource2);
				
			}
		  }
	  };
	  
	  Runnable run2 = ()->
	  {
		  synchronized (resource2) {
		  System.out.println(Thread.currentThread().getName()+":Locked"+ resource2);
		  try {
			  Thread.sleep(100);
		  }
		  catch(Exception e) {}
		  }
		  synchronized (resource1) {
			  System.out.println(Thread.currentThread().getName()+":Locked"+ resource1);
			  
		  }
			
		
	  
	  
	  
	  
	  
};

Thread thread1 = new Thread(run1);thread1.setName("Desktop");
Thread thread2 = new Thread(run2);thread2.setName("Laptop");
  
   thread1.start();
   thread2.start();
   

  }
}
