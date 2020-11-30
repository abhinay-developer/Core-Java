package com.abhi.test;

public class MethodOveloadingTest {
public static void main(String[] args) {
	
	Addition ad=new Addition();
	Addition1 ad1=new Addition1();
	int x=ad.add(10, 20);
	int y=ad1.add(10, 20, 30);
	System.out.println("The Addition::"+x);
	System.out.println("The Addition1::"+y);
			
}
}
