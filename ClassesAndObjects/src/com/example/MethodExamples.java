package com.example;


	


class Calculator{
	public float average(float a, float b) {
		return (a+b)/2;
	}
	
	public int facto(int num) {
		int f=1;
		while(num>0) {
			f*=num; // f=f*num;
			num--;
		}
		return f;
	}
	
	public void printEvenOrOdd(int num) {
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	
}

public class MethodExamples {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		float avg=cal.average(5.6f, 7.8f);
		System.out.println("Average = "+avg);
		
		int facto=cal.facto(6);
		System.out.println("Factorial = "+facto);
		
		cal.printEvenOrOdd(5);
		
	}
}