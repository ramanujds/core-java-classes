package com.example.forloop;

public class ForLoopExample {

	public static void main(String[] args) {
		
		for(int i=10 ; ; i++){
			System.out.println("Hello From For Loop");
			if(i>=4) {
				break;
			}
		}
		
		int k=10;
		do {
			System.out.println("Hello From Do-While Loop");
			k++;
		}while(k<5);

		int x=10;
		while(true) {
			System.out.println("Hello From While Loop");
			x++;
			if(x>=4) {
				break;
			}
		}
		
		
	}

}
