package com.abhi.corejava;

public class Odd {
	public void odd() {
		System.out.println("The Odd Numbers  are::");
		for (int i = 0; i < 10; i++) {
			if (i % 2!= 0) {
				System.out.print(" "+ i);
			} // if
		} // for
	}// method
}// class

class Logic2 {
	public static void main(String[] args) {
		Odd e = new Odd();
		e.odd();
	}
}
