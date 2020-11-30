package com.abhi.logics;

import java.util.Scanner;

public class SquareOfTwoNumbers {

	public void squareOfTwoNumbers(int num) {
		int result=num*num;
		System.out.println("The Square of "+num+" is:"+result);
	}
	public static void main(String[] args) {
		SquareOfTwoNumbers sotn=new SquareOfTwoNumbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number::");
		int first=sc.nextInt();
		sotn.squareOfTwoNumbers(first);
		

	}

}
