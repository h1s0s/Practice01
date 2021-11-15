package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double c = sc.nextDouble();
		System.out.println("화씨 "+c+" 의 섭씨온도는 "+((5.0/9.0)*(c-32.0)));
		
		sc.close();
		
	}
}
