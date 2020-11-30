package com.abhi.logics;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
        int i=2;
        for(i=2;i<=100;i++) {
        	if(i%i==0&&i%2==0) {
        		System.out.println("The Prime Numbers are"+i);
        	}
        }
	}

}
