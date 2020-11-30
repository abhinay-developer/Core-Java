package com.abhi.corejava;

public class StaticPolymorphism {

	public static void main(String[] args) {
	
		Addition a1=new Addition();
		a1.add(10, 20);
		a1.add(10, 20, 30);
		a1.add(10, 20, 30f);

	}

}
