package com.example;//같은 패키지 안에 있으면 그냥 되는건가.

import java.util.*;
public class Example1 {// 파일 이름과 같이 할 것.

	public static void main(String[] args){
		Week today = null;//열거타입 변수선언.
		
		Calendar cal= Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);//dayofweek는 1에서 7까지의 수를 반환함.
		
		switch(week) {
		case 1:
			today=Week.SUNDAY;break;
		case 2:
			today=Week.MONDAY;break;
		case 3:
			today=Week.TUESDAY;break;
		case 4:
			today=Week.WEDNESDAY;break;
		case 5:
			today=Week.THURSDAY;break;
		case 6:
			today=Week.FRIDAY;break;
		case 7:
			today=Week.SATURDAY;break;
		}
		System.out.println("오늘요일"+today);//그냥 하면 이름을 
		/*boolean run =true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------");
			System.out.print("선택> ");
			
			switch(scanner.nextInt()) {
				case 1: 
					int k=scanner.nextInt();
					balance+=k;
					break;
				case 2:
					int d=scanner.nextInt();
					balance-=d;
					break;
				case 3:
					System.out.println(balance);
					break;
				case 4:
					run=false;
					break;
				
			}
			
		}*/
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");//ln이 붙으면 개행이 된다.
			}
			System.out.print("\n");
		}*/
		/*for(int x=1;x<11;x++) {
			for(int y=1;y<11;y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}*/
		/*while(true) {
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			System.out.println("("+a+","+b+")");
			if(a+b==5) break;
		}*/
		/*Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println(a+b);*/
		
		/*String userInput = "joonkee";
		double val = Double.valueOf(userInput);
		boolean k = Double.isNaN(val);
		//double currentBalance = 10000.0;
		
		//currentBalance+=val;
		System.out.println(k);*/
	
		/*int x=1000000;
		int y=1000000;
		long z=(long)x*y;
		System.out.println(z);*/
		//System.out.println("Hello World!");
	}

}
