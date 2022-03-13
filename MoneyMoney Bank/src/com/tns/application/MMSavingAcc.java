package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL=0;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}
@Override
	public void withdraw(float accBal) {
System.out.println("Dear SavingAccount User,Your Withdraw MINBAL is:"+MINBAL);
}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	}
	
