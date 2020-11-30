package com.abhi.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> list=new Vector<String>();
		
		list.add("Virat");
		list.add("Bumrah");
		list.add("Karan");
		list.add("Rana");
		list.add("Sandeep Sharma");
		
		 Iterator<String> itr=list.iterator();
		 
		 while(itr.hasNext()) {
			 
			 System.out.println(itr.next());
		 }

	}

}
