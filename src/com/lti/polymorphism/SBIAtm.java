package com.lti.polymorphism;

public class SBIAtm implements ATM {
    private double balance=10000;
    private double amount;
		
	
	@Override
	public void withdraw(double amount) {
		this.amount=amount;
		System.out.println("Amount withdrawn from SBI:"+amount);

	}

	@Override
	public double checkBalance() {
	
		return balance-amount;
	}
}