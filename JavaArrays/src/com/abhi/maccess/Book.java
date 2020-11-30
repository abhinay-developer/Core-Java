package com.abhi.maccess;

public class Book {

	public String bCode,bName;
	
	public Book(String bCode,String bName) {
		
		this.bCode=bCode;
		this.bName=bName;	
	}
	public String toString() {
		
		return bCode+"\t"+bName;
		
	}
}
