package com.example.whileloop;

import java.util.Scanner;

public class FactorialFinder {

	public static void main(String[] args) {
		
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=scan.nextInt();
		int factorial=1;
		while(n>0) {
			//factorial=factorial*n;
			factorial *= n;
			n--;
		}
		System.out.println("Factorial = "+factorial);
		
		scan.close();
	}

}
