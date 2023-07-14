package com.java.concept;

public class Deadlock_2 {

	
	    public static void main(String[] args) {
	        final String resource1 = "Resource 1";	//initialization	
	        final String resource2 = "Resource 2";

	        Thread thread1 = new Thread(() -> {      //object
	            synchronized (resource1) {           //acquire the lock on thread 1
	                System.out.println("Thread 1: Locked resource 1"); 
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                synchronized (resource2) {  // holding resource 1 and waiting resource 2
	                    System.out.println("Thread 1: Locked resource 2");
	                }
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            synchronized (resource2) {
	                System.out.println("Thread 2: Locked resource 2");
	                try {
	                    Thread.sleep(1000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                synchronized (resource1) {
	                    System.out.println("Thread 2: Locked resource 1");
	                }
	            }
	        });

	        thread1.start();
	        thread2.start();
	    }
	}


