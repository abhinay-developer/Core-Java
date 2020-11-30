package com.abhi.student;

public class StudentTest {

	public static void main(String[] args) {
		StudentAdress sa=new StudentAdress();
		System.out.println("-----Student Address-----");
		sa.hNo="13-11-10";
		sa.streetNo="Srinagar";
		sa.city="Hyderabad";
		sa.pinCode=505301;
		sa.getStudentAddress();
		System.out.println("----Student Details----");
		StudentDetails sd=new StudentDetails();
		sd.rollNo="15UM1A0534";
		sd.mailId="abhinay.galipally@gmail.com";
		sd.phNo=9912155611l;
		sd.sName="Abhinay";
		sd.sBranch="CSE";
		sd.getStudentDetails();
		

	}

}
