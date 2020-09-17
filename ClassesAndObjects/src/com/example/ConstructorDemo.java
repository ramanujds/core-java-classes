package com.example;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Student s1=new Student(101, "Steve", "steve@gmail.com");
		Student s2=new Student(102, "Rohit", "rohit@yahoo.com");
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
	
}


class Student{
	private int roll;
	private String name;
	private String email;
	

	public Student() {

	}

	public Student(int roll, String name, String email) {
		this.roll = roll;
		this.name = name;
		this.email = email;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
}