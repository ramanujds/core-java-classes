package com.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		FileReader reader=null;
		FileWriter writer=null;
		try {
//			FileInputStream inputStream=new FileInputStream("hello.txt");
//			int c;
//			while((c=inputStream.read())!=-1) {
//				System.out.print((char)c);
//			}
			
			reader=new FileReader("hello.txt");
			BufferedReader br=new BufferedReader(reader);
//			int c;
//			
//			while((c=reader.read())!=-1) {
//				System.out.print((char)c);
//			}
			String str=br.readLine();
			String []words=str.split(" ");
			
			writer=new FileWriter("result.txt");
			for(String word:words) {
				if(word.length()>3) {
					System.out.println(word);
					
					try {
					//	char []arr="Lets get Started".toCharArray();
					//	FileOutputStream outputStream=new FileOutputStream("hello.txt",true);
						
					//	for(char ch:arr) {
						writer.write(word);
					//}
						
				
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			//System.out.println(str);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
