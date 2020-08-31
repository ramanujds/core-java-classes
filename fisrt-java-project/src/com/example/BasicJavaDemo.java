package com.example;

import java.util.Scanner;

public class BasicJavaDemo {
	

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the values for x and y ");
		int x=scanner.nextInt();
		
		int y=scanner.nextInt();
		int sum=x+y;
		
		System.out.println(x+" + "+y+ " = "+sum);
		
		
		
//		System.out.println("x = "+x);
//		System.out.println("y = "+y);
//		System.out.println("Sum = "+sum);
		

	}

}
