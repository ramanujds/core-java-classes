package com.example;

public class MaxMinFinder {

	public static void main(String[] args) {
		
		int []values= {5,21,1,17,3};
		
		int max=values[0];
		
		for(int i=0;i<values.length;i++) {
			if(values[i]>max) {
				max=values[i];
			}
		}

		System.out.println("Max = "+max);
	}

}
