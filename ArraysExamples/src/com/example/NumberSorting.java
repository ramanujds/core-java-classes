package com.example;

public class NumberSorting {

	static int x=0;
	
	public static void main(String[] args) {
	
	int nums[]= {10,3,5,7,2};
	
	System.out.println("Before sorting : ");
	for(int n:nums) {
		System.out.print(n+ "\t");
	}
	
	for(int i=0;i<nums.length;i++) {
		for(int j=i+1;j<nums.length;j++) {
			if(nums[i]>nums[j]) {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
	}
	
	System.out.println("\n\nAfter sorting : ");
	for(int n:nums) {
		System.out.print(n+ "\t");
	}

	System.out.println(x);
}

}
