package com.abhi.string;

import java.util.Scanner;

public class ReverseAStringUsingInput {

	public static void main(String[] args) {
	  String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String::");
		String str=sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("The String is:"+reverse);

	}

}
