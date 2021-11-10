package com.btc;

public class Arithemeticexp {
public static void main(String[] args) {
	
	int a =10;
	for(int i=0;i<=5;i++) {
		try {
		System.out.println("Trying to divide the number");
		int x = a/i;
		System.out.println("Result=:"+x);
	}
		catch(Exception exp) {
			System.out.println("Do not divide a number by Zero");
		}
	}
	System.out.println("this is an exception handling program");
	System.out.println("End the program");
}
}