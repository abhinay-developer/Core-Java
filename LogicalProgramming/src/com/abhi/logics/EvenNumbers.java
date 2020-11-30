package com.abhi.logics;

public class EvenNumbers {
   int i;
	public void evenOrOdd() {
	  for(i=0;i<=10;i++) {
		  if(i%2==0) {
			  System.out.println("The Even Numbers are::"+i);
		  }
	  }
	   
   }
	public static void main(String[] args) {
		EvenNumbers eod=new EvenNumbers();
		eod.evenOrOdd();
  
	}

}
