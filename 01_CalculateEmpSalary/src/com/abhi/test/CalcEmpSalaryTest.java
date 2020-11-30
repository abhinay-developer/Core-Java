package com.abhi.test;

import java.util.Scanner;

import com.abhi.beans.EmpSalary;

public class CalcEmpSalaryTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
           System.out.print("Enter the Basic Salary::");
		int bs = sc.nextInt();

		if (bs >= 5000) {
			EmpSalary es = new EmpSalary();
			es.calculate(bs);
			es.getTotal();
		} // if
		else {
			System.out.println("Invalid Basic Salary");
		}
	}
}