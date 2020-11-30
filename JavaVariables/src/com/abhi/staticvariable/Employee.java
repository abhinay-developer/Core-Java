package com.abhi.staticvariable;

public class Employee {

	public int empId;
	public String name;
	public static String Company = "Tech Mahindra";
	public String location;
	public long mobileNo;



	public Employee(int empId, String name, String location, long mobileNo) {
		super();
		this.empId = empId;
		this.name = name;
		this.location = location;
		this.mobileNo = mobileNo;
	
		
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", location=" + location + ", mobileNo=" + mobileNo
				+ "]";
	}

}
