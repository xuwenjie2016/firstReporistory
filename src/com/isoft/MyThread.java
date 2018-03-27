package com.isoft;

public class MyThread implements Runnable{
	
	public static void main(String args[]) {
		Thread thread = new Thread(new MyThread());
		thread.start();
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}
	
	
	

}
