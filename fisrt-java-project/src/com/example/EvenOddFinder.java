package com.example;

import java.util.Scanner;

public class EvenOddFinder {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=scan.nextInt();
		
//		(expression ? Statement if true : Statement if false) 		
		
		String result;
		
		result=(num%2==0 ? " is an even no." : " is an odd no.");
		
		System.out.println(num+ result);
		
		
//		if(num % 2 == 0) {
//			System.out.println(num+" is an even no.");
//		}
//		else {
//			System.out.println(num+" is an odd no.");
//		}

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