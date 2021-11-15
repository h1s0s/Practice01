package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요:");
		int pay = sc.nextInt();
		int ten_years_pay = pay * 10;
		System.out.println("10년동안 최대 저축액은 "+ten_years_pay+"원 입니다.");
		
		sc.close();
	}
}
