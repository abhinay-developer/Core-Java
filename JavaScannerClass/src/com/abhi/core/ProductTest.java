package com.abhi.core;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
	 Product p=new Product();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the pCode::");
	  p.pCode=sc.nextLine();
	 System.out.println("Enter the pName::");
	  p.pName=sc.nextLine();
	 System.out.println("Enter the pPrice");
      p.pPrice=sc.nextFloat();
     System.out.println("Enter the pQty::");
      p.pQty=sc.nextInt();
     p.getProductDetails();
     
     
     

	}

}
