package com.abhi.arrays;

import java.util.Arrays;

public class SortMethod {
	// A sample Java program to sort an array of integers 
	// using Arrays.sort(). It by default sorts in 
	// ascending order 
	public static void main(String[] args) {
		
		int numbers[]= {100,20,90,10,40,60};
		
		Arrays.sort(numbers);
		
		  System.out.printf("Modified arr[] : %s", 
                  Arrays.toString(numbers)); 	
	}

}
