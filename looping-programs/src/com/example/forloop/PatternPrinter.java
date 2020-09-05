package com.example.forloop;

import java.util.Scanner;

public class PatternPrinter {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int lines;
		System.out.println("Enter the total no. of lines to be printed ");
		lines=scan.nextInt();
		
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		

	}

}
