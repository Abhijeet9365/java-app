package com.btc1;

public class ArrayIndex {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		System.out.println("Start");
		
		try {
			System.out.println(a[100]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index Position");
		}
		System.out.println("End");
	}
}