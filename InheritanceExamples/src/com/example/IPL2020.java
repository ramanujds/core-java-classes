package com.example;

public class IPL2020 {

	public static void main(String[] args) {
		
		
		Player player1=new Batsman();
		player1.play();
//		player1.getBatsmanData();
//		player1.showBatsmanData();
		
		player1=new Bowler(25);
		player1.play();
		
//		bowler1.getBowlerData();
//		bowler1.showBowlerData();

	}

}
