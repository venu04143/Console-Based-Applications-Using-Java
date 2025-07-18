package com.atmproject;

public class UserDetails {

	private String userName;
	private long accountNumber;
	private double balance;
	private int pin;
	
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public UserDetails(String userName, long accountNumber, double balance, int pin) {
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "UserDetails [userName=" + userName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ ", pin=" + pin + "]";
	}
	
	
}
