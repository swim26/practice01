package com.javaex.practice;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double w,h,area,perimeter;
		System.out.print("가로를 입력하세요:");
		w=sc.nextDouble();
		System.out.print("세로를 입력하세요:");
		h=sc.nextDouble();
		area=w*h;
		System.out.println("사각형 넓이는"+area);
		perimeter=(w*2)+(h*2);
		System.out.println("사각형 둘레는"+perimeter);
				
		sc.close();
	}

}
