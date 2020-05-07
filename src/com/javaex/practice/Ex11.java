package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int pay, sum;	
	System.out.print("월급을 입력하세요:");
	pay=sc.nextInt();
	sum=pay*120;
	System.out.println("10년동안 최대 저축액는 "+sum+"원 입니다.");
	sc.close();
		
	}

}

