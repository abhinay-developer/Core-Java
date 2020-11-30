package com.abhi.logics;

import java.util.Scanner;

public class EvenOrOdd {

	public void evenOrOdd(int num) {
		if (num % 2 == 0) {

			System.out.println("The " + num + " is even::");
		} else {
			System.out.println("The " + num + " is odd::");
		}
	}

	public static void main(String[] args) {
		EvenOrOdd eod=new EvenOrOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		eod.evenOrOdd(num);

	}

}
