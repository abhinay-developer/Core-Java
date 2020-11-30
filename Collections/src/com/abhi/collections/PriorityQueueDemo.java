package com.abhi.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> que=new PriorityQueue<String>();
		
		que.add("raja");
		que.add("rani");
		que.add("Vilan");
		System.out.println("Head::"+que.element());
		System.out.println("Head::"+que.peek());
		
		que.remove();
		que.poll();
		Iterator<String> itr=que.iterator();
		
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
	}

}
