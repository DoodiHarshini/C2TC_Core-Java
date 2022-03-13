package com.tns.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	public  void getCreditLimit() {
	
	}
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	@Override
	public void withdraw(float creditLimt) {
		System.out.println(" Account Balance  is:"+creditLimit);
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
