package com.abhi.file;

import java.io.File;
import java.io.IOException;

public class CreateFileTest {

	public static void main(String[] args) throws IOException {
		File f=new File("abhi.txt");
		boolean b=f.createNewFile();
		if(b) {
			System.out.println("The File is Created Successfully");
		}
		else {
			System.out.println("The File is already existed in location");
		}
	}

}
