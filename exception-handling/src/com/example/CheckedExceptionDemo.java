package com.example;

import java.io.IOException;

public class CheckedExceptionDemo {

	static NumberReader numReader;
	
	public static void main(String[] args)  {

		
		try {
			if(numReader!=null) {
					numReader.readNum();
			}
			else {
				System.out.println("Numreader is not initialized");
			}
		}catch (IOException e) {
			System.err.println("IO Error Occured");
		}
		catch (NumberFormatException e) {
			System.err.println(e);
		}
		catch (NegativeNumberException e) {
			System.err.println(e);
		}
		

	}

}
