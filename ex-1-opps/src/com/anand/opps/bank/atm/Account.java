package com.anand.opps.bank.atm;

public class Account {
	private int balance=6000;
	public int getBalance() {
		return balance;
	}
	public void withdrow(int amount) {
		// TODO Auto-generated method stub

		balance=balance-amount;
	}

}
