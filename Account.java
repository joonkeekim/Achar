package com.example;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano,String owner,int balance) {
		this.ano=ano;
		this.owner=owner;
		this.balance=balance;
	}
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner=owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance=balance;}
	/*static final int MIN_B=0;
	static final int MAX_B=1000000;
	void setBalance(int balance) {
		if(balance>=MIN_B&&balance<=MAX_B) {
			this.balance=balance;
		}
		return;
	}
	int getBalance() {
		return this.balance;
	}*/
}
