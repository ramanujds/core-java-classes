package com.example;

public class ThreadSynchronization {
	
	public synchronized void showMultiplicationTable(int n)  {
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+" x "+i+" = "+(n*i));
			if(n==5 && i==5) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(n==4 && i==10) {
				notify();
			}
		}
	}
	
	public static void main(String[] args) {
		
		ThreadSynchronization ts=new ThreadSynchronization();
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				ts.showMultiplicationTable(5);
				
			}
		};
		
Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				ts.showMultiplicationTable(4);
				
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		
	}
	

}

