package com.btc;

public class Mainclass {
public static void main(String[] args) {
	
	Player player = new Batter("Virat" ,18,30,35,30,125.5f);
	player.display();
	System.out.println();
	Player p2 = new Bowler("chahal",10,28,5,5.5f,10);
	p2.display();
}
}
