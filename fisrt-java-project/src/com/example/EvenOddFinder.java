package com.example;

import java.util.Scanner;

public class EvenOddFinder {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+" is an even no.");
		}
		else {
			System.out.println(num+" is an odd no.");
		}

	}

}


// Syntax
// ---------------
//	if(condition){
//		statements;
//		.....
//	}
//	else{
//		statements;
//		...
//	}