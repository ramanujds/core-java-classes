package com.example;

public class Batsman implements Player {

	 String playerName;
	 String team;
	 int age;
	float average;
	float strikeRate;
	int centuries;
	
	 public void play() {
	
		 System.out.println("Batsman Playing...");
		 
	 }
	
	public Batsman() {
		
		System.out.println("Welcome Batsman");
	}
	
	public void getBatsmanData() {
		playerName="MS Dhoni";
		team="CSK";
		age=40;
		average=55.6f;
		strikeRate=150.8f;
		centuries=3;
	}
	
	public void showBatsmanData() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Batsman [average=" + average + ", strikeRate=" + strikeRate + ", centuries=" + centuries
				+ ", playerName=" + playerName + ", team=" + team + ", age=" + age + "]";
	}
	
	

	
	
	
}
