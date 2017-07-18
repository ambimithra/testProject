package com.hp;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		try {
			
			wait();
			notify();
			notifyAll();
			
			sleep(10);
			yield();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("es");
	}
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		test.start();
		
		

	}

}
