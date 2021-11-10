package com.btc;

public class Batter extends Player {

	private int toatlrun;
	private int centuary;
	private float strikerate;
	
	public Batter() {
		System.out.println("Default constructer");
	}

	public Batter(String name,int serialno,int age,int toatlrun, int centuary, float strikerate) {
		super(name,serialno,age);
		this.toatlrun = toatlrun;
		this.centuary = centuary;
		this.strikerate = strikerate;
	}

	public int getToatlrun() {
		return toatlrun;
	}

	public void setToatlrun(int toatlrun) {
		this.toatlrun = toatlrun;
	}

	public int getCentuary() {
		return centuary;
	}

	public void setCentuary(int centuary) {
		this.centuary = centuary;
	}

	public float getStrikerate() {
		return strikerate;
	}

	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}
	public void display() {
		System.out.println("PlayerName:"+name);
		System.out.println("SerialNo:"+serialno);
		System.out.println("Age:"+age);
		System.out.println("TotalRun:"+toatlrun);
		System.out.println("Centuary:"+centuary);
		System.out.println("StrikeRate:"+strikerate);
	}
}
