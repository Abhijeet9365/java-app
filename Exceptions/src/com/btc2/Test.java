package com.btc2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the integer value: ");
			Integer inputInt = sc.nextInt();
			System.out.println(inputInt);
		}
		catch(InputMismatchException ex) {
			System.out.println("Input given is Mismatch"+ ex);

		}
		System.out.println("Exception handled");
		System.out.println("program executed");
	}
}
