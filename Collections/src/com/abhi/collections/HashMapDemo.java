package com.abhi.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	
		Map<Integer,String> map=new HashMap<Integer,String>();
	
		map.put(1, "abhinay");
		map.put(2,"Rani");
		map.put(3,"Karan");
	
		 for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } 
	}

}
