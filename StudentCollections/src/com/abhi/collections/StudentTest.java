package com.abhi.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentTest {

	public static void main(String[] args) {
	Map<Integer, Student> map=new LinkedHashMap<Integer, Student>();
	
	map.put(101, new Student("raja", 25, "B.tech", "Vaageswari"));
	map.put(102, new Student("rani", 23, "B.tech", "Vaageswari"));
	map.put(103, new Student("karan", 22, "B.tech", "Vaageswari"));
	map.put(104, new Student("sai", 44, "B.tech", "Vaageswari"));
	map.put(105, new Student("sai", 44, "B.tech", "Vaageswari"));
	

	
	for(Map.Entry m : map.entrySet()){  
		
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }  
	}

}
