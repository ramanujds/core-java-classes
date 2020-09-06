package com.example;

import java.util.Scanner;

public class ArraysProgram1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
//		int []nums= {5,15,20,18,10};
		
		System.out.println("Enter the total no. of elements : ");
		int n=scan.nextInt();
		
		int []nums=new int[n];

		System.out.println("Enter the elements : ");
		
		for(int i=0;i<nums.length; i++) {
			nums[i]=scan.nextInt();
		}
		
//		nums[0]=5;
//		nums[1]=15;
//		nums[2]=20;
//		nums[3]=18;
//		nums[4]=10;
		System.out.println("Elements are: ");
//		for(int i=0;i<nums.length;i++) {
//			System.out.print(nums[i]+"\t");
//		}
		
		for(int num:nums) {
			System.out.print(num+"\t");
		}
		
		

	}

}
