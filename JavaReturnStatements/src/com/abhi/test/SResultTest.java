package com.abhi.test;

import java.util.Scanner;

import com.abhi.comp.BranchCheck;
import com.abhi.comp.SResult;

public class SResultTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Name::");
		String sName=sc.nextLine();
		System.out.println("Enter the Branch::");
		String branch=sc.nextLine();
		System.out.println();
		BranchCheck bc=new BranchCheck();
		boolean k=bc.verify(branch.toUpperCase());
		if(k) {
			System.out.println("Enter the rollNo::");
			String rollNo=sc.nextLine();
			if(rollNo.length()==10) {
				int i=0;
				int p=0;
				int totM=0;
				
				System.out.println("Enter the 6 sub marks::");
				while(i<=6) {
				
					System.out.println("Enter the marks of sub ::"+i);
					int sub=sc.nextInt();
					i++;
					if(sub<0||sub>100) {
						System.out.println("Invalid Marks");
					i--;
					continue;
					}
					if(sub>0&&sub<=34) {
						p=1;
					}
					System.out.println("StudentName"+sName);
					System.out.println("Branch::"+branch);
					System.out.println("RollNo::"+rollNo);
					
					totM=totM+sub;
				}
				
				SResult sr=new SResult();
				sr.calculate(p, totM);
				
				
				
				
			}
		}

	}

}
