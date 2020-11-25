package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

	public static void main(String[] args) {
		FileWriter writer=null;
		try {
		//	char []arr="Lets get Started".toCharArray();
		//	FileOutputStream outputStream=new FileOutputStream("hello.txt",true);
			writer=new FileWriter("hello.txt");
		//	for(char ch:arr) {
			writer.write("Lets get Started");
		//}
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
