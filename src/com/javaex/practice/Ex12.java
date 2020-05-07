package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double radius, area;
		final double PI=3.14;
		System.out.println("반지름을 입력하세요:");
		radius=sc.nextDouble();
		area= radius*radius*PI;
		System.out.println("원의 넓이는"+area+"입니다");
		sc.close();		
	}

}
