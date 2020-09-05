package com.example.forloop;

import java.util.Scanner;

public class ContineAndBreakExample {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		int sum=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number ");
			num=scan.nextInt();
			if(num<0) {
				continue;
			}
			sum+=num;
		}
		
	
		System.out.println("Sum = "+sum);
		
	}

}
