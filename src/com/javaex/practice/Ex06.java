package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;// 10%2 = 0 -> 대입 > i++
		
		System.out.println(i); //11 (n을 대입할때 i++에서 1이 증가함)
		System.out.println(n); //0 
		
	}
}
