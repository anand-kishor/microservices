package com.example.model;

public class Account {
	private int accNo;
	private String accountType;
	private String accountHolderName;
	private String accountBankName;
	public Account(int accNo, String accountType, String accountHolderName, String accountBankName) {
		super();
		this.accNo = accNo;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.accountBankName = accountBankName;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountBankName() {
		return accountBankName;
	}
	public void setAccountBankName(String accountBankName) {
		this.accountBankName = accountBankName;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accountType=" + accountType + ", accountHolderName=" + accountHolderName
				+ ", accountBankName=" + accountBankName + "]";
	}
	

}
