package com.example;

public class Human {
	
	static String plannet;
	
	private int age;
	private String name;
	private float height;
	
	public Human() {
		System.out.println("Default constructor Invoked");
	}
	
	public Human(int age, String name, float height) {
		this.age=age;
		this.height=height;
		this.name=name;
		System.out.println("Constructor having 3 arguments Invoked..");
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	public void eat() {
		System.out.println(name+" is eating..");
	}
	
	public void walk() {
		System.out.println(name+" is walking..");
	}
	
	public void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Height "+height);
		System.out.println("Plannet : "+plannet);
	}
	
}
