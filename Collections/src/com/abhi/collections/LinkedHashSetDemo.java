package com.abhi.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
	
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Ram");
		lhs.add("naveen");
		lhs.add("Rajan");
		lhs.add("abhinay");
		lhs.add("Saran");
		lhs.add(null);
		
		Iterator<String> itr=lhs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
