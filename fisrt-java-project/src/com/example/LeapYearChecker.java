package com.example;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		
	
		
		int year;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		year=scan.nextInt();
		
		if(year%4==0 && (year%100 != 0 || year%400 == 0)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
		
		
		
	}
}

// 2020

// 2000

// 1900

// 2013