package com.abhi.test;

import java.util.Scanner;

import com.abhi.comp.Addition;
import com.abhi.comp.Division;
import com.abhi.comp.ModuloDivision;
import com.abhi.comp.Multiplication;
import com.abhi.comp.Substraction;

public class ArithemeticOperatorsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value ::");
		int val1 = sc.nextInt();
		System.out.print("Enter the Secound value ::");
		int val2 = sc.nextInt();
		if (val1 > 0 && val2 > 0) {
			System.out.println("Enter the Choice");
			System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.ModDiv\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Addition ad = new Addition();
				ad.add(val1, val2);
				break;
			case 2:
				Substraction sub = new Substraction();
				sub.sub(val1, val2);
			case 3:
				Multiplication mul = new Multiplication();
				mul.mul(val1, val2);
			case 4:
				Division div = new Division();
				div.div(val1, val2);
			case 5:
				ModuloDivision md = new ModuloDivision();
				md.modDiv(val1, val2);
			default:
				System.out.println("You Entered invalid Option");
				break;
			}
		} // if
		else {
			System.out.println("Invalid Values");
		}
	}// main
}// class
