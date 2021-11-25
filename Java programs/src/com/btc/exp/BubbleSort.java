package com.btc.exp;

public class BubbleSort {
public static void  main(String[] args) {
	int []arr= {10,20,40,50,30};
	System.out.println("Before Sorting the elements");
	for(int element:arr) {
		System.out.println(" "+element);
	}
	System.out.println();
	int[] sortedArr=bubbleSort(arr);
	System.out.println("After Sorting the Array");
	for(int element:sortedArr) {
		System.out.println(" "+element);
	}
	System.out.println();
	}
	public  static int[]  bubbleSort(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
