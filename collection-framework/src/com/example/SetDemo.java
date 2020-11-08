package com.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		Set set=new TreeSet();
//		
//		set.add(100);
//		set.add(500);
//		set.add(200);
//		set.add(300);
//		set.add(200);
//	
//		
//		
//		for(Object item:set) {
//			System.out.println(item);
//		}
		

		
		
		Set<Employee> employees=new TreeSet<>();
		
		
		employees.add(new Employee("Harsh", "harsh@yahoo.com", 25, 45000));
		employees.add(new Employee("Praveen", "praveen@yahoo.com", 26, 55000));
		employees.add(new Employee("Keerthi", "keerthi@yahoo.com", 24, 35000));
		employees.add(new Employee("Mahesh", "mahesh@yahoo.com", 27, 50000));
		employees.add(new Employee("Harsh", "harsh@yahoo.com", 25, 45000));
		employees.add(new Employee("Harsh", "harsh@yahoo.com", 25, 45000));
		
		for(Employee emp:employees) {
			System.out.println(emp);
		}
		
		

	}

}
