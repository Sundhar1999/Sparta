package com.lti.polymorphism;

abstract public class Amazon {
	private double discount;

    protected Amazon() {
    	System.out.println("Welcome to amazon");
    	discount=0.01;
    }

    abstract void purchase(double price);  //to be implemented

    protected double amazonDiscount() {    //to be reused
    	return discount;
		
	}
}
