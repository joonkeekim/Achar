package com.example;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println(account.getBalance());
		
		account.setBalance(-100);
		System.out.println(account.getBalance());
		
		account.setBalance(200000000);
		System.out.println(account.getBalance());
	}

}
