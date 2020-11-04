package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo {


	public static void main(String[] args) {
		
		
		List items=new ArrayList();
		items.add("Kush");
		items.add(5);
		items.add(true);
		items.add(2.5);
		
		items.add(2, "Mohit");
		
//		for(Object obj:items) {
//			System.out.println(obj);
//		}
		
//		Iterator itr=items.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
//		for(int i=0;i<items.size();i++) {
//			System.out.println(items.get(i));
//		}
		
		items.forEach(System.out::println);
		
		
		
//		int []arr= {5,2,1,6,3};
//		
//		for(int value:arr) {
//			System.out.println(value);
//		}
		
		

	}

}
