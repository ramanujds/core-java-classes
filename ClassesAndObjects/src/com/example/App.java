package com.example;

public class App {

	public static void main(String[] args) {
	
		Human human1=new Human();
		
		human1.setAge(25);
		human1.setHeight(5.8f);
		human1.setName("Rahul");
		Human.plannet="Earth";
		human1.eat();
		human1.walk();
		
		
		Human human2=new Human();
		
		human2.setAge(30);
		human2.setHeight(5.6f);
		human2.setName("Mahesh");
		Human.plannet="Mars";
		human2.eat();
		human2.walk();
		
		
		human1.displayInfo();
		human2.displayInfo();
		
		
		
	}

}
