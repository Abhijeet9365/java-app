package com.btc;

public class Player {

	protected String name;
	protected int serialno;
	protected int age;
	public Player() {
		System.out.println("default constructer");
	}
	public Player(String name, int serialno, int age) {
		this.name = name;
		this.serialno = serialno;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("PlayerName:"+name);
		System.out.println("SerialNo:"+serialno);
		System.out.println("Age:"+age);
	}
}
