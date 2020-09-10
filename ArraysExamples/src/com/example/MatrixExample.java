package com.example;

public class MatrixExample {

	public static void main(String[] args) {
		
		int [][]matrix= {{2,3,5},{7,8,9},{4,6,1}};
		
		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(matrix[i][j]+"  ");
//			}
//			System.out.println();
//		}
		
		for(int[] row:matrix) {
			for(int val:row) {
				System.out.print(val+"  ");
			}
			System.out.println();
		}
		
		

	}

}
