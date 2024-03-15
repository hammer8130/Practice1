package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
//		원화를 달러화로 계산하는 프로그램을 작성하세요. (환율 1달러 = 1230.95원 상수로 지정)
		Scanner scanner = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요: ");
		double m=scanner.nextInt();
		final double dol = 1230.95;
		double result = m/dol;
		System.out.println(result);
	}

}
