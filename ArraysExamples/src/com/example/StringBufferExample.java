package com.example;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class StringBufferExample {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the text:");
		String str=scan.nextLine();
		System.out.println("Enter the word to serach");
		String searchStr=scan.nextLine();
		System.out.println("Enter the word to replace with");
		String replaceWord=scan.nextLine();
		
		// hello world how are you?
		// world
		// 6
		// 5
		// 10
		
		StringBuffer strBfr=new StringBuffer(str);
		int start=str.indexOf(searchStr);
		if(start==-1) {
			System.out.println("Word not found in String");
			System.exit(0);
		}
		int end=start+searchStr.length();
		strBfr.replace(start, end, replaceWord);
	
//		strBfr.reverse();
		System.out.println(strBfr);
		

	}

}
