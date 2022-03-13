package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
@Override
public	void withdraw(float creditLimit) {
	System.out.println("Dear Current Account User,Your creditlimit is"+creditLimit);
	
		
}

@Override
public String toString() {
	return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}

	


}
