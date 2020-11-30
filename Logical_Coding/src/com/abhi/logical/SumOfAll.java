package com.abhi.logical;

public class SumOfAll {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<=array.length-1;i++) {
			
			 sum=sum+array[i];
			
		}
		System.out.println("The Elements:"+sum);
	}

}
