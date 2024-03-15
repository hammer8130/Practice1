package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
//		사용자로부터 밑변, 높이 값을 입력 받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로: ");
		float w = scanner.nextFloat();
		System.out.print("세로: ");
		float h = scanner.nextFloat();
		
		float t = (w*h)/2;
		
		System.out.println("삼각형의 넓이는 "+t+" 입니다.");
	}

}
