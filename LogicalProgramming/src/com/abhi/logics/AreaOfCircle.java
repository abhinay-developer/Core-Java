package com.abhi.logics;

public class AreaOfCircle {

	double rad;
	final double PI=3.14159;
	
	public void areaOfCircle() {
		rad=10.0;
		double area=PI*rad*rad;
		System.out.println("The area of circle is :"+area);
	}
	
	public static void main(String[] args) {
		AreaOfCircle aoc=new AreaOfCircle();
		aoc.areaOfCircle();

	}

}
