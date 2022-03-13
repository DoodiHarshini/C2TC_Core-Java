package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
	BankFactory  BF=new MMBankFactory();
	SavingAcc sa = new MMSavingAcc(1253,"Harsha",10000,true);
	sa.deposite(10000);
	sa.toString();
	CurrentAcc ca =new MMCurrentAcc(1236,"Harshini",4000,2000);
	ca.withdraw(2000);
ca.toString();
	}

}
