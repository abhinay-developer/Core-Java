package com.abhi.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		Deque<String> dq=new ArrayDeque<String>();
		
		dq.add("raja");
		dq.add("rani");
		dq.add("Rama");
		dq.add("sita");
		dq.add("sita");
		
		Iterator<String> itr=dq.iterator();
		
		while(itr.hasNext()) {
		
			
			System.out.println(itr.next());
		}
		System.out.println("--------------------------");
		for(String str:dq) {
			
			System.out.println(str);
		}

	}

}
