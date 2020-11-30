package com.abhi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List <String> list=new ArrayList<String>();
		
		list.add("abhinay");
		list.add("Nani");
		list.add("karan");
		list.add("Madhu");
		list.add("CNU");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
