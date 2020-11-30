package com.abhi.collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("Raja");
		set.add("Rani");
		set.add("Rama");
		set.add("Karan");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

//		for(String str:set) {
//			System.out.println(str);
//		}
	}

}
