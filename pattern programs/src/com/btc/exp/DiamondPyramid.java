package com.btc.exp;

import java.util.Scanner;

public class DiamondPyramid {
public static void main(String[] args) {
	int i,j,k;
    Scanner sc= new Scanner(System.in);
    System.out.print("enter the number of row for half diamond: ");  
    int n= sc.nextInt();  
    for(i=1;i<=n;i++)
    {
	   for(k=1;k<=i;k++){
                     System.out.print("*");
		    }
		 System.out.println("");
	    }
	    
	for(i=n;i>1;i--)
    {
	    for(k=i;k>1;k--){
                     System.out.print("*");
		    }
		 System.out.println("");
	    }
}
}
