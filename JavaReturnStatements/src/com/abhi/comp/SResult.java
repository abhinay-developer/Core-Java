package com.abhi.comp;

public class SResult {

	public float per;
	public String result;

	public void calculate(int p, int totM) {
 
		per = (float) totM / 6;
		if (p == 1) {
			result = "fail";
		} // if

		else if (per >= 70 && per <= 100) {
			result = "Distinction";
		} else if (per >= 60 && per <= 70) {
			result = "FirstClass";
		} else if (per >= 50 && per <= 60) {
			result = "SecoundClass";
		} else if (per >= 35 && per <= 50) {
			result = "ThirdClass";
		}

		else {
			result = "Fail";
		}

	}// calculate(_)

	public	void getResult() {
		System.out.println("Per:" + per);
		System.out.println("Result:" + result);
	}
}// class
