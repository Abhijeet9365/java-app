package com.btc.exp;

public class Problem33 {

	public static void main(String[] args) {
		String input="this was great";
		 System.out.println(checkForFirstAndLastChar(input));
		}
		public static int checkForFirstAndLastChar(String input) {
		 int n=0;
		 if(input.charAt(0)==input.charAt(input.length()-1))
		  n=1;
		 else n=-1;
		 return n;

	}

}
