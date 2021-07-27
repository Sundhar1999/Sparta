package com.lti.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		int[]num= {1,2,3};
		int []num1= {10,20,30,40,50};
		try {
			System.out.println(num[0]);
			System.out.println(num1[1]);
			int n=10/0;
		}catch(NullPointerException e) {
		
			System.out.println("Array is not initialized");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+"Position not available");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		catch(Throwable e) {
		
		}
		System.out.println("Main ends");}}

