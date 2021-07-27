package com.lti.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Main begins");
		try {
			fileRead("d:\\copytest.txt");
		} catch (Exception e) {
			System.out.println("File not found");
			
		}
					
	}
	public static void fileRead(String fileName) {
		FileReader reader= null;
		char[] ch=new char[100];
		try {
			reader=new FileReader(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
		try {
			reader.read(ch);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ch);
	}

}
