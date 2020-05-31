package com.abhi.corejava;

public class Even {
	public void even() {
		System.out.println("The Even Numbers are::");
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(" "+ i);
			} // if
		} // for
	}// method
}// class

class Logic1 {
	public static void main(String[] args) {
		Even e = new Even();
		e.even();
	}
}
