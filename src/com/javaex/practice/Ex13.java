package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요:");
		double won = sc.nextDouble();
		
		
		System.out.println("받으실 달러는 " + (won/1230.95)+" 달러");
		
		sc.close();
	}
	
}
