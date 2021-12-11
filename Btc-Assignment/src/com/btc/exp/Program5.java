package com.btc.exp;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str1 =sc.next();
		boolean value1=check(str1);
	}
	public static boolean check(String str1) 
	{
		if(str1.contains("*"))
		{
			int start1=0;
			int end=str1.indexOf("*");
			String leftStr=str1.substring(start1,end);
			int start2=str1.indexOf("*")+1;
			int end2=str1.length();
			String rightStr=str1.substring(start2,end2);
			System.out.println(rightStr);
			System.out.println(leftStr);
			if(leftStr.equalsIgnoreCase(rightStr)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
