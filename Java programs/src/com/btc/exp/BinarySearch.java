package com.btc.exp;

public class BinarySearch {
public static void main(String[] args) {
	int []arr= {10,20,30,40,50};
	int index=BinarySearch(arr,20);
	System.out.println("Array element is found at index:"+index);
}
public static int BinarySearch(int[] arr,int item) {
	int p=0;
	int r=arr.length-1;
	int q;
	while(p<=r) {
		q=(p+r)/2;
		if(arr[q]==item) {
			return q;
		}
		else if(arr[q]>item) {
			return r=q-1;
		}
		else {
			return p=q+1;
		}
	}
	return -1;
}
}
