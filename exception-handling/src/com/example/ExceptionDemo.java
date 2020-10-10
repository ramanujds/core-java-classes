package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Line 1");
		divide();
		System.out.println("Line 2");
		System.out.println("Completed Program");

	}

	static void divide() {
		Scanner scan = new Scanner(System.in);
		int a, b;

		System.out.println("Enter Values for a and b ");
		try {
			a = Integer.parseInt(scan.nextLine());
			b = Integer.parseInt(scan.nextLine());

			int x = a / b;
		} 
		catch (ArithmeticException ex) {
			System.out.println("B cannot be zero. Please eneter the values again");
			divide();
		}
		
		catch (NumberFormatException e) {
			System.out.println("Please enter valid integers only");
			divide();
		}
		catch (Exception e) {
			System.out.println("Something went wrong.. Please try again..");
			divide();
		}
	}

}
