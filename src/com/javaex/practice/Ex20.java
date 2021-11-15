package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int fivehundredwon = sc.nextInt();
		System.out.print("100원 개수: ");
		int onehundredwon = sc.nextInt();
		System.out.print("50원 개수: ");
		int fiftywon = sc.nextInt();
		System.out.print("10원 개수: ");
		int tenwon = sc.nextInt();
		
		System.out.println("동전의 총 합은 "+((fivehundredwon*500)+(onehundredwon*100)+(fiftywon*50)+(tenwon*10))+" 원 입니다.");
		
		sc.close();
		
	}
}
