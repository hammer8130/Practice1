package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
//		직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(너비, 높이 변수 double형으로 작성)
		Scanner scanner = new Scanner(System.in);
		System.out.print("너비를 입력하세요:");
		int w = scanner.nextInt();
		System.out.print("높이를 입력하세요: ");
		int h = scanner.nextInt();
		
		float r1=(w*2)+(h*2);
		float r2=w*h;
		
		System.out.println("사각형의 둘레는 "+r1);
		System.out.println("사각형의 넓이는 "+r2);

	}

}
