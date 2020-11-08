package com.example;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> items=new PriorityQueue<>();
		
		items.add("Abc");
		items.add("rahul");
		items.add("Harsh");
		items.add("Gaurav");
	
		
		while(items.size()>0) {
			System.out.println(items.poll().toUpperCase());
		}
		

	}

}
