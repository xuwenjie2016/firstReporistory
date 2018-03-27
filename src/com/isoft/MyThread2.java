package com.isoft;

public class MyThread2 extends Thread{
	
	
	@Override
	public void run() {
		
		System.out.println("woshi ");
	}
	public static void main(String[] args) {
		new MyThread2().run();
	}
}
