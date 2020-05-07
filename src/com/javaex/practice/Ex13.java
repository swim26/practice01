package com.javaex.practice;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double won;
		double dollar;
		final double RATE =1230.95;
		
		System.out.print("환전할 원하를 입력하시요:");
		won=sc.nextInt();
		dollar=won/RATE;
		System.out.println("받으실 달러는"+dollar);
		
		sc.close();
	}
	
}
