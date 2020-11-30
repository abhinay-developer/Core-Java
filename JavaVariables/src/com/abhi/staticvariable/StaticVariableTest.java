package com.abhi.staticvariable;

public class StaticVariableTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee(1, "abhinay", "Hyd ", 9666147856l);
		Employee emp2=new Employee(2, "abhi", "Hyd ", 9666147852l);
		System.out.println(emp);
		System.out.println(emp2);
		System.out.println(emp.Company);
	}
}
