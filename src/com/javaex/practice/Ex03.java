package com.javaex.practice;

public class Ex03 {
	
	public static void main(String[] args){
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a="+a);//예상 값 4 답 4
		
		
		System.out.println("b="+b);//답 2
		// int b = y*2가 대입되고 ++가 적용됨.
		
		System.out.println("x="+x);//예상값 2 답 2
		
		
		System.out.println("y="+y);//예상값 2 답2
		
	}
}
