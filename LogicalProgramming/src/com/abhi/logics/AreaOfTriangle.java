package com.abhi.logics;

import java.util.Scanner;

public class AreaOfTriangle {
	public void areaOfTraingle(int height,int base) {
		int result=(base*height)/2;
		System.out.println("The area of triangle::"+result);
		
	}

	public static void main(String[] args) {
		AreaOfTriangle aot=new AreaOfTriangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base ::");
		int base=sc.nextInt();
		System.out.println("Enter the height ::");
		int height=sc.nextInt();
		aot.areaOfTraingle(height, base);

	}

}
