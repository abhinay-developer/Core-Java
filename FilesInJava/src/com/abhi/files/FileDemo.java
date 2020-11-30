package com.abhi.files;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		
		File file=new File("java1.txt");
		try {
			if(file.createNewFile()) {
				
				System.out.println("File is created");
			}
			else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
