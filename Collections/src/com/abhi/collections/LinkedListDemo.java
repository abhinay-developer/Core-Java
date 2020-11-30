package com.abhi.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> list=new LinkedList<String>();
		
		list.add("Raja");
		list.add("Rani");
		list.add("Guatham");
		list.add("Sneha");
		
		Iterator<String> itr= list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
