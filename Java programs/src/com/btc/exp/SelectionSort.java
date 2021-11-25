package com.btc.exp;

public class SelectionSort {
public static void main(String[] args) {
	int []arr= {2,8,6,10,4};
	System.out.println("Before Sorting the elements");
	for(int element:arr) {
		System.out.println(" "+element);
	}
	int[] sortedArr=SelectionSort(arr);
	System.out.println("After Sorting the Array");
	for(int element:sortedArr) {
		System.out.println(" "+element);
	}
	System.out.println();
}
public static int[] SelectionSort(int []arr) {
	int length=arr.length;
	for(int i=0;i<length;i++) {
		int min=i;
		for(int j=i+1;j<length;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr;
	}

}

