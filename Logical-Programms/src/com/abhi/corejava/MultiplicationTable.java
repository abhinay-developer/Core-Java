package com.abhi.corejava;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table");
		int i = sc.nextInt();
		for(int x=1;x<=10;x++) {
			System.out.println(i+"x"+x+"="+" "+x*i);
		}

	}

}
