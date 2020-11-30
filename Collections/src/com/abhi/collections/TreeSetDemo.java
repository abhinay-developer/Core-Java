package com.abhi.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ss=new TreeSet<String>();
		
		ss.add("raja");
		ss.add("Rani");
		ss.add("Karan");
		ss.add("ramesh");
		ss.add("Suresh");
		
		ss.remove("raja");
		Iterator<String> itr=ss.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
