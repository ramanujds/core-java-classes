package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListDemo {


	public static void main(String[] args) {
		
		
		Collection items= new ArrayList();
		
		items.add("Kush");
		items.add(5);
		items.add(true);
		items.add(25.65);
		
		for(Object obj:items) {
			System.out.println(obj);
		}
		
//		items.forEach(obj->System.out.println(obj));
		
//		Iterator itr=items.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		

	}

}
