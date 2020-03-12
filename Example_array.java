package com.example;

import java.util.Scanner;

public class Example_array {

	public static void main(String[] args) {
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("선택");
		
		
		int sel=scanner.nextInt();
		
		switch(sel) {
		case 1:
			scores=new int[scanner.nextInt()];
			break;
		case 2:
			for(int i=0;i<scores.length;i++) {
				scores[i]=scanner.nextInt();
			}
			break;
		case 3:
			for(int i=0;i<scores.length;i++) {
				System.out.println("점수"+scores[i]);
			}
			break;
		case 4:
			int sum=0;
			double avg=0;
			for(int i=0;i<scores.length;i++) {
				sum+=scores[i];
			}
			avg=(double)sum/scores.length;
			System.out.println("avg:"+avg);
			break;
		case 5:
			run=false;
			break;
			}
		}
		System.out.println("exit");
		
		/*int [][]array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		int len=0;
		double avg=0.0;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
				len++;
			}	
		}
		avg=(double)sum/len;
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);*/
		
		
		/*int max=0;
		int[] array= {1,5,3,8,2};
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.println(max);*/
	}

}
