package com.example;

public class ThreadWithRunnableInterface {

	public static void main(String[] args) {

		Runnable r1 = ()->{
				for (int i = 1; i <= 20; i++) {
					System.out.println("From Thread 1 --- i = " + i);
				}
		};
				
		Runnable r2 = new SecondThread();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

	
	}
}

class SecondThread implements Runnable {

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("From Thread 2 --- i = " + i);
		}

	}

}