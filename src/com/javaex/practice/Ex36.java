package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
//		동전 별 개수를 입력 받아 총금액을 계산하는 프로그램을 작성하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int a = scanner.nextInt();
		System.out.print("100원 개수: ");
		int b = scanner.nextInt();
		System.out.print("50원 개수: ");
		int c= scanner.nextInt();
		System.out.print("10원 개수: ");
		int d = scanner.nextInt();
		
		int sum = (a*500)+(b*100)+(c*50)+(d*10);
		
		System.out.println("동전의 총합은"+sum+" 원 입니다.");

	}

}
