package com.abhi.instance;

//private int id;
//private String name;
//private String branch;
//private String addr;
//private String college;
public class InstanceVariablesTest {

	public static void main(String[] args) {
	
     Student s=new Student();
     
     System.out.println("The ID::"+s.id);
     System.out.println("The Branch::"+s.branch);
     System.out.println("The Address::"+s.branch);
     System.out.println("The College::"+s.branch);
     
     s.id=1;
     s.name="abhinay";
     s.branch="CSE";
     s.addr="Karimanagar";
     s.college="Vaageswari Engineering College";
     
     System.out.println("The ID::"+s.id);
     System.out.println("The Branch::"+s.branch);
     System.out.println("The Address::"+s.branch);
     System.out.println("The College::"+s.branch);
     
     
	}

}
