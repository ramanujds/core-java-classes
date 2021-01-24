package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class NIOReadingFile {

	public static void main(String[] args) {
		
		try {
			Files.lines(Paths.get("hello.txt")).filter(line->line.length()>10).forEach(System.out::println);
			
			
			//.filter(s->s.toString().length()>3).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
