package com.javaex.practice;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		
		double a,b,c,d;
		
		System.out.println("상품가격:");
		System.out.println("받은돈:");
		a=sc.nextInt();
		b=sc.nextFloat();
		System.out.println("==============");
		c=a*(double)0.1;
		d=b-a;
		System.out.println("받은돈:"+b);
		System.out.println("상품가격:"+a);
		System.out.println("부가세:"+c);
		System.out.println("잔액:"+d);
		
		sc.close();

	}

}
