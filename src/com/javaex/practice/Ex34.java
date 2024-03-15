package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
//		사용자로부터 화씨 온도를 입력 받아 섭씨 온도로 변환하는 프로그램을 작성하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("화씨: ");
		float f = scanner.nextFloat();
		double c = ((double)5/9*(f-32));
		
		System.out.println("화씨 "+f+"의 섭씨온도는 "+c+" 입니다.");
		

	}

}
