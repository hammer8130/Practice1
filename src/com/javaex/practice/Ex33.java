package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
//		사용자로부터 구의 반지름을 입력 받아 구의 부피를 계산하는 프로그램을 작성하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름: ");
		int r = scanner.nextInt();
		
		double v = (1+(double)1/3)*3.14*(r*r*r);
		
		System.out.println("구의 부피는: "+v+" 입니다.");

	}

}
