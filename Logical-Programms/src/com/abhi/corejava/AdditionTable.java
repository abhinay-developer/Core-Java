package com.abhi.corejava;
import java.util.Scanner;
public class AdditionTable {
	public void addition(int i) {
		System.out.println("AdditionTable.addition()");
		for (int x = 1; x <= 10; x++) {
			System.out.println(i + "+" + x + "=" + " " + x + x);
		}

	}
}

class Logic6{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AdditionTable md=new AdditionTable();
		System.out.println("Enter the table");
		int i = sc.nextInt();
           md.addition(i);
	}
	}
