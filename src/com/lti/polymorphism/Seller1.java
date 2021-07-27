package com.lti.polymorphism;

public class Seller1 extends Amazon{

		public Seller1() {
			super();
		}
		
		void purchase(double price) {
			double totalPrice=price-price*amazonDiscount();
			System.out.println("Amount to be paid to seller1"+" "+ totalPrice);
		}
}
