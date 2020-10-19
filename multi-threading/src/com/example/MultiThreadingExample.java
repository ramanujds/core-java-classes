package com.example;

import java.io.IOException;

public class MultiThreadingExample {
		
	public static void main(String[] args) {
		Thread m1=new Thread1();
		Thread m2=new Thread2();
		m1.start();
		m2.start();
	}
	

}

class Thread1 extends Thread{
	
	public void run() {
		for(int i=1;i<=20;i++) {
			
				try {
					sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			System.out.println("From Fun 1 ... i = "+i);
			if(i==5) {
				try { char ch;
				System.out.println("Enter a value");
					ch=(char) System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=50;i<=70;i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("From Fun 2 ... i = "+i);
		}
	}
	
}