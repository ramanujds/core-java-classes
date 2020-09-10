package com.example;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter first string ");
		str1=scan.nextLine();
		
		int index= str1.indexOf("ra");
		
		System.out.println(index);
		
//		System.out.println("Enter second string ");
//		str2=scan.nextLine();
		
//		if(str1.equalsIgnoreCase(str2)) {
//				System.out.println("Both are equal");
//		}
//		else {
//			System.out.println("Strings are not equal");
//		}
		
//		int difference=str1.compareTo(str2);
//		
//		if(difference==0) {
//			System.out.println("Strings are equal");
//		}
//		else {
//			System.out.println("Difference = "+difference);
//		}
		
	

	}

}
