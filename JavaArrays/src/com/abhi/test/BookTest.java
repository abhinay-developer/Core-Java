package com.abhi.test;

import com.abhi.maccess.Book;

public class BookTest {

	public static void main(String[] args) {
		Book b[] = new Book[3];
		b[0] = new Book("A111", "CoreJava");
		b[1] = new Book("A222", "AdvanceJava");
		b[2] = new Book("A333", "Spring");

		System.out.println("--------Display the Books-------");
        for(Book k:b) {
        	System.out.println(k);
        }
	}

}
