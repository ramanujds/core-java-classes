package com.example;

public class Outer {

	//Instance Inner Class
	
	public void showOuter() {
		System.out.println("Hello from outer class");
	}
	
	class Inner{
		public void showInner() {
			System.out.println("Hello from inner class");
			showOuter();
		}
	}
	
	static class Inner2{
		public void showInner2() {
			System.out.println("Hello from static inner class");
		}
	}
	
	
	
}
