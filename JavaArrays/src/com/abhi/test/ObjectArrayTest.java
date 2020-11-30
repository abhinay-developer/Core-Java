package com.abhi.test;

public class ObjectArrayTest {

	public static void main(String[] args) {
	
		Object o[]=new Object[5];
		
		o[1]=new String("abhinay");
		o[2]=new Integer(10);
		o[3]=new Float(15.5);
		System.out.println("-------Info------");
		for(Object k:o) {
			
			System.out.println(k);
		}
	}

}
