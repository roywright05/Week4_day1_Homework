package com.problems;

// Use Java Thread/Runnables to calculate pi to 12 digits


 class MyThread extends Thread {
	 
	 public void run() {
		 
		 //Code for implementing pi goes here
		 double pi = Math.PI;
		 
		 System.out.printf("The value of pi is %.12f", pi);
		 
	 }
	
}

public class Problem1{
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.start();
		
	}
	
	
}