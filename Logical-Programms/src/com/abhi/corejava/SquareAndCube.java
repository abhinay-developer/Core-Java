package com.abhi.corejava;

import java.util.Scanner;

class SquareAndCubes {
	void SquareAndCubes(int x) {
		System.out.println("The Square is==>" + x + "x" + x + "=" + x * x);
		System.out.println("The Cube is ==>" + x + "x" + x + "x" + x + "=" + x * x * x);
	}
}

class SquareAndCube {

	public static void main(String[] args) {
		SquareAndCubes sac = new SquareAndCubes();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number");
		int x = sc.nextInt();
		sac.SquareAndCubes(x);

	}

}
