package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

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
		

		
		
		List<Employee> employees=new ArrayList<>();
		
		
		employees.add(new Employee("Harsh", "harsh@yahoo.com", 25, 45000));
		employees.add(new Employee("Praveen", "praveen@yahoo.com", 26, 55000));
		employees.add(new Employee("Keerthi", "keerthi@yahoo.com", 24, 35000));
		employees.add(new Employee("Mahesh", "mahesh@yahoo.com", 27, 50000));
//		employees.add(new Employee("Harsh", "harsh@yahoo.com", 25, 45000));
//		employees.add(new Employee("Harsh", "harsh@yahoo.com", 25, 45000));
//		System.out.println("Unsorted List - ");
//		for(Employee emp:employees) {
//			System.out.println(emp);
//		}
		
		Comparator<Employee> sortBySalary=new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return (int)(e1.getSalary()-e2.getSalary());
			}
		};
//		
//	
//		Collections.sort(employees, (e1,e2)->e1.getAge()-e2.getAge());
//		System.out.println("Sorted List based on Age - ");
//		for(Employee emp:employees) {
//			System.out.println(emp);
//		}
//		
		Collections.sort(employees,sortBySalary);
//		System.out.println("\n\nSorted List based on Salary - ");
//		for(Employee emp:employees) {
//			System.out.println(emp);
//		}
		
		Employee e=employees.stream().filter(emp->emp.getSalary()>=50000).findFirst().get();
		System.out.println(e);
		
		

	}

}
