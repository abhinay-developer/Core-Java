package com.abhi.corejava;
import java.util.Scanner;
public class MultiplicationTableWithMethod {
	public void multiplication(int i) {
		for (int x = 1; x <= 10; x++) {
			System.out.println(i + "x" + x + "=" + " " + x * i);
		}

	}
}

class Logic5{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MultiplicationTableWithMethod md=new MultiplicationTableWithMethod();
		System.out.println("Enter the table");
		int i = sc.nextInt();
           md.multiplication(i);
	}
	}
