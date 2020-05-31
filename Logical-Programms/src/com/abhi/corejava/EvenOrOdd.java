package com.abhi.corejava;

import java.util.Scanner;

public class EvenOrOdd {
	public void evenOrOdd(int i) {
		if (i % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EvenOrOdd od = new EvenOrOdd();
		System.out.println("Enter the number");
		int x = sc.nextInt();
		od.evenOrOdd(x);

	}

}
