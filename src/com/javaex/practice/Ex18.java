package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double r = sc.nextDouble();
		System.out.println("구의 부피는: "+(4.0/3.0)*(3.14*(r*r*r)));
		
		sc.close();
		
	}
}
