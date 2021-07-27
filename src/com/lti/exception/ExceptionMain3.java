package com.lti.exception;

import java.util.Scanner;

public class ExceptionMain3 {

	public static void main(String[] args) {
		int[]num= {1,2,3};
		int []num1= {10,20,30,40,50};
		try {
			System.out.println(num[0]);
			System.out.println(num1[1]);
			int n=10/1;
		}
		catch(NullPointerException e) {
		
			System.out.println("Array is not initialized");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+"Position not available");
		}
//	catch(Exception e) {
//		System.out.println(e.getMessage());
//	}
//	catch(Throwable e) {
//		
		finally{
			System.out.println("Finally executed");
		}
		//custom Exception
		int age=0;
		System.out.println("Enter your age");
		age=new Scanner(System.in).nextInt();
		
		if(age<0){			
			try {
				throw new NegativeAgeException("Age cannot be negative");
			} catch (NegativeAgeException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		else{
			System.out.println("Your age is"+age+"years old");
			}
		System.out.println("Main ends");
		}
	}

