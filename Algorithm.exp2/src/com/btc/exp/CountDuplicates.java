package com.btc.exp;
import java.util.Arrays;
public class CountDuplicates {
  public static void main(String[] args) {
	
	  int []arr1 = {2,5,8,7,6,9};
	  int []arr2 = {8,11,4,3,0,2};
	  
	 int Total =countDuplicates(arr1,arr2);
	 System.out.println("Total_Duplicates="+Total);  
}
  public static int countDuplicates(int []arr1,int []arr2) {
	  
	  int count = 0;
	  Arrays.sort(arr1);
	  Arrays.sort(arr2);
	  for(int i=0,j=0;i<arr1.length && i<arr2.length;) {
		  if(arr1[i]==arr2[j]) {
			  count++;
			  i++;
			  j++;
		  }
	  
		  else if(arr1[i]<arr2[j]) {
				  i++;
			  }
			  else {
				  j++;
			  }
		  }
	  
	return count;		  
	  }
  }
			  
			  
			  
			  
			  
