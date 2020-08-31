package com.example;

import java.util.Scanner;

public class GradePrinter {

	public static void main(String[] args) {

		float marks;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks:");
		marks = scan.nextFloat();

		if (marks >= 80) {
			System.out.println("Grade A");
		} else if (marks >= 70) {
			System.out.println("Grade B");
		} else if (marks >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Sorry you're failed");
		}

	}

}
