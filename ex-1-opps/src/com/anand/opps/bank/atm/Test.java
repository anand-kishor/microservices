package com.anand.opps.bank.atm;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		AccountHolder holder=new AccountHolder(account);
		Thread t1=new Thread(holder);
		Thread t2=new Thread(holder);
		
		t1.setName("anand");
		t2.setName("kishor");
		
		t1.start();
		t2.start();

	}

}
