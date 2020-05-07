package com.javaex.practice;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double a, b;
		
		System.out.println("반지름:");
		a=sc.nextDouble();		
		b=(double)4/(double)3 * 3.14 *(a*a*a);				
		System.out.println("구의부피는: "+b+"입니다." );
		sc.close();
	}

}
