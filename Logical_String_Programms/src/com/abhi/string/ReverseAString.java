package com.abhi.string;

public class ReverseAString {

	public static void main(String[] args) {
	 String name="JavaCoding";
	  String reverse="";
	 
	 for(int i=name.length()-1;i>=0;i--) {
		 reverse=reverse+name.charAt(i);
	 }
	 System.out.println("The Reversed String::"+reverse);

	}

}
