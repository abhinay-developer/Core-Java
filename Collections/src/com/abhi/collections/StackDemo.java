package com.abhi.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack=new Stack<String>();
		stack.push("Jagdeesh");
		stack.push("Rajan");
		stack.push("Gill");
		stack.push("Narine");
        
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
		
			
			System.out.println(itr.next());
		}
	}

}
