package com.abhi.file;

import java.io.File;
import java.io.IOException;

public class CreateDirectoryTest {

	public static void main(String[] args)throws IOException {
		//creation of a file
		File f=new File("anu.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		//creation of directory
		
		File f1=new File("sunny");
		if(!f.exists()) {
			f1.mkdir();
			System.out.println(f.exists());
		}
		else {
			System.out.println("Already You created");
		}
	
		System.out.println(f1.exists());
		//creation File Inside the directory (Directory must present)
		
		File f2=new File("sunny","sunny.txt");
		f2.createNewFile();
	}
}
