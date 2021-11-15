package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2; // 10%2 -> ++i -> 대입
		
		System.out.println(i); //11
		System.out.println(n); //1
		
	}
}
