package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		
//		Map<Integer,String> map=new HashMap<>();
//		
//		map.put(1,"One");
//		map.put(2, "Two");
//		map.put(3, "Three");
//		
//		int key;
		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a number : ");
//		key=scan.nextInt();
//		System.out.println(map.get(key));
		
		
		Map<String,Employee> employees=new HashMap<>();
		

		Employee e1,e2,e3,e4;
		
		e1=new Employee("Harsh", "harsh@yahoo.com", 25, 45000);
		e2=new Employee("Praveen", "praveen@yahoo.com", 26, 55000);
		e3=new Employee("Keerthi", "keerthi@yahoo.com", 24, 35000);
		e4=new Employee("Mahesh", "mahesh@yahoo.com", 27, 50000);
		
		employees.put(e1.getEmpName(),e1);
		employees.put(e2.getEmpName(),e2);
		employees.put(e3.getEmpName(),e3);
		employees.put(e4.getEmpName(),e4);
		
//		System.out.println("Enter Employee Name");
//		
//		String empName=scan.nextLine();
//		
//		Employee emp=employees.get(empName);
//		
//		System.out.println(emp);
		
		for(String ename:employees.keySet()) {
			System.out.println(employees.get(ename));
		}
		
		
		
	}

}
