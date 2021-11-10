package com.btc;

public class Bowler extends Player {

	private int wickets;
	private float economy;
	private int totalwickets;
	
	public Bowler() {
		System.out.println("Default constructer");
	}

	public Bowler(String name,int serialno,int age,int wickets, float economy, int totalwickets) {
		super(name,serialno,age);
		this.wickets = wickets;
		this.economy = economy;
		this.totalwickets = totalwickets;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public float getEconomy() {
		return economy;
	}

	public void setEconomy(float economy) {
		this.economy = economy;
	}

	public int getTotalwickets() {
		return totalwickets;
	}

	public void setTotalwickets(int totalwickets) {
		this.totalwickets = totalwickets;
	}
	public void display() {
		System.out.println("PlayerName:"+name);
		System.out.println("SerialNo:"+serialno);
		System.out.println("Age:"+age);
		System.out.println("Wickets:"+wickets);
		System.out.println("Economy:"+economy);
		System.out.println("Total wickets:"+totalwickets);
	}
}
