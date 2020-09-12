package com.example;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
		
		String []names= {"Rohit","Mohan","Robin","Atul","Priti","John","Bob"};
		
		System.out.println("Before Sorting");
		for(String name:names) {
			System.out.println(name);
		}
		
		Arrays.sort(names);
		
//		for(int i=0;i<names.length;i++) {
//			for(int j=i+1;j<names.length;j++) {
//				if(names[i].compareToIgnoreCase(names[j])>0) {
//					String temp=names[i];
//					names[i]=names[j];
//					names[j]=temp;
//				}
//			}
//		}
//		
		System.out.println("After Sorting");
		for(String name:names) {
			System.out.println(name);
		}

	}

}
