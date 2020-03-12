package com.example;
import java.util.*;
public class BankApplicaiton {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run=true;
		while(run) {
			System.out.println("선택");
			int select=scanner.nextInt();
			if(select==1) {
				createAccount();
			}else if(select==2) {
				accountList();
			}else if(select==3) {
				deposit();
			}else if(select==4) {
				withdraw();
			}else if(select==5) {
				run=false;
			}
		}
		System.out.println("종료");
	}
	private static void createAccount() {
	
		System.out.println("계좌생성");
		System.out.print("계좌번호:");
		String ano=scanner.next();//왜nextline은 안되는걸까??
		
		System.out.print("계좌주:");
		String owner=scanner.next();
		
		System.out.print("입금액");
		int b=scanner.nextInt();
		
		Account newAccount=new Account(ano,owner,b);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				break;
			}
		}
	}
	private static void accountList() {
		System.out.println("계좌목록");
		for(Account ac : accountArray) {
			if(ac==null) break;
			System.out.print("계좌번호:");
			System.out.println(ac.getAno());
			System.out.print("계좌주:");
			System.out.println(ac.getOwner());
			System.out.print("잔액:");
			System.out.println(ac.getBalance());	
		}
	}
	private static void deposit() {
		System.out.println("예금");
		System.out.print("계좌번호입력:");
		String ano=scanner.next();
		Account own=findAccount(ano);
		if(own==null) {
			System.out.println("sibal");
			return;
		}
		int plusbal=scanner.nextInt();
		int result=own.getBalance()+plusbal;
		own.setBalance(result);
		
	}
	private static void withdraw() {
		System.out.println("출금");
		System.out.print("계좌번호입력:");
		String ano=scanner.next();
		Account own=findAccount(ano);
		int minusbal=scanner.nextInt();
		int result=own.getBalance()+minusbal;
		own.setBalance(result);
	}
	private static Account findAccount(String ano) {
		
		
		for(int i=0;i<accountArray.length;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
			
		}
		return null;
	}

}
