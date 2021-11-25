package com.btc.exp;

public class InsertionSort {
public static void main(String[] args) {
	int []arr = {10,20,30,50,60,40};
	System.out.println("Before Sorting the elements");
	for(int element:arr) {
		System.out.println(" "+element);
	}
 	System.out.println();
	int[] sortedArr=InsertionSort(arr);
	System.out.println("After sorting the Array");
	for(int element:sortedArr) {
		System.out.println(" "+element);
	}
	System.out.println();
}
public static int[] InsertionSort(int[] arr) {
	int length=arr.length;
	for(int i=0;i<length;i++) {
		int element=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>element) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=element;
	}
	return arr;
}
}
