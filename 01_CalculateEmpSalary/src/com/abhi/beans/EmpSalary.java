package com.abhi.beans;

public class EmpSalary {

	float totSal;

	public void calculate(int bSal) {
		totSal = bSal + (0.93f * bSal) + (0.63f * bSal);
	}

	public void getTotal() {
		System.out.println("TotalSalary:" + totSal);
	}
}
