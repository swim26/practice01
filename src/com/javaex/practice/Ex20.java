package com.javaex.practice;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a, b, c, d, sum;
		
		System.out.print("500원 개수: ");
		a=sc.nextInt();
		System.out.print("100원 개수: ");
		b=sc.nextInt();
		System.out.print("50원 개수: ");
		c=sc.nextInt();
		System.out.print("10원 개수: ");
		d=sc.nextInt();
		sum=(a*500)+(b*100)+(c*50)+(d*10);		
		System.out.print("동전의 총합은 "+sum+" 입니다.");

		sc.close();
	}

}
