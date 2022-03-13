package com.tns.framework;

public abstract class BankAcc {
	 private int accNo;
	private String accNm;
    private float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withdraw(float accBal) {
		System.out.println("withdraw and accountbalance are:"+accBal);

}
	public void  deposite(float accBal) {
		System.out.println("Dear Saving Accont user, your TotalAccountBalance is:"+accBal);
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
