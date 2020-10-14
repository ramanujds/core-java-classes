package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberReader {
	
	public void readNum() throws IOException,NumberFormatException,NegativeNumberException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter a number:");
		
			num=Integer.parseInt(reader.readLine());
			if(num<=0) {
				throw new NegativeNumberException("Negative Numbers are Not Allowed..");
			}
			System.out.println("Entered Number is "+num);
		
	}

}
