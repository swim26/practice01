package com.javaex.practice;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double a, b;
		
		System.out.println("화씨:");
		a=sc.nextDouble();
		b= (double)5/(double)9 * (a-32);
		
		System.out.println("화씨 "+a+"의 온도는" +b+" 입니다.");
		sc.close();

	}

}
