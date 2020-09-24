package com.example;

public class Bowler extends Player {

	String bowlingArm;
	float economy;
	int wickets;
	
	public void getBowlerData() {
		age=35;
		playerName="Bravo";
		team="CSK";
		economy=5.5F;
		bowlingArm="Right Arm";
		wickets=95;
		
		
	}

	public void showBowlerData() {
		System.out.println(this);
	}
	
	
	@Override
	public String toString() {
		return "Bowler [bowlingArm=" + bowlingArm + ", economy=" + economy + ", wickets=" + wickets + ", playerName="
				+ playerName + ", team=" + team + ", age=" + age + "]";
	}
	
	
	
	
}
