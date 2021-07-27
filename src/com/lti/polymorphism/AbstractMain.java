package com.lti.polymorphism;

import java.util.Scanner;

public class AbstractMain {

	public static void main(String[] args) {
		Amazon amazon =null;
		
		System.out.println("1.Seller1 2.Seller2");
		int ch=new Scanner(System.in).nextInt();
		
		if(ch==1) {
			amazon=new Seller1();
		}
		if(ch==2) {
			amazon = new Seller2();
		}

		amazon.purchase(5000);
	}

}
