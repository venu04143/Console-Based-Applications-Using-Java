package com.atmproject;

import java.util.Scanner;

public class ATMProcess implements ATMServices{

	private UserDetails user;
	
	public ATMProcess(){
		
	}
	public ATMProcess(UserDetails user){
		this.user=user;
	}
	static Scanner sc = new Scanner(System.in);
	@Override
	public void withdraw() {
		System.out.println("Enter Amount to Wthdraw.");
		double amount=sc.nextDouble();
		
		if(amount< user.getBalance()) {
			user.setBalance(user.getBalance()-amount);
			System.out.println("Withdraw Sucessfull. Your Remaining Account Balance is :"+user.getBalance());
		}else {
			System.out.println("Insufficient Balance. Please Enter a Valid Amount.");
		}
		
	}
	@Override
	public void deposite() {
		System.out.println("Enter Amount to Deposite ");
		double amount = sc.nextDouble();
		if(amount >0) {
			user.setBalance(user.getBalance()+amount);
			System.out.println("Deposite Sucessfull. Your Current Account Balance is :"+user.getBalance());
		}else {
			System.out.println("Enter Valid Amount");
		}
		
	}
	@Override
	public void checkBalance() {
		System.out.println("Current Balance is : "+user.getBalance());
		
	}
	
	
}
