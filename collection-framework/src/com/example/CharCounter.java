package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str;
		System.out.println("Enter a String : ");
		str=scan.nextLine();
		Map<Character, Integer> charCounts=new HashMap<>();
		
		for(char ch:str.toCharArray()) {
			if(charCounts.containsKey(ch)) {
				int previous=charCounts.get(ch);
				charCounts.put(ch, previous+1);
			}
			else {
				charCounts.put(ch, 1);
			}
		}
		
		for(char ch:charCounts.keySet()) {
			
			System.out.println(ch+" -> "+charCounts.get(ch));
			
		}
		
		
		
		
		//amit

	}

}
