package com.btc.exp;

public class LinearSearch {
public static void main(String[] args) {
	int []arr= {10,20,30,40,50};
	int item=50;
	System.out.println(item+" is found at index:"+LinearSearch(arr,item));
}
public static int LinearSearch(int[] arr,int item) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==item) {
			return i;
		}
	}
	return -1;
}
}