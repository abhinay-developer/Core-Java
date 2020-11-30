package com.abhi.file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteFile {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			FileWriter fw = new FileWriter("D:\\images\\DText.txt");
			char ch1;
			System.out.println("Enter the data @ at the end ");
			while ((ch1 = (char) br.read()) != '@') {
				fw.write(ch1);
			}
			fw.close();
			System.out.println("Display from File");
			int ch2;
			while ((ch2 = br.read()) != -1) {
				System.out.println((char) ch2);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

}
