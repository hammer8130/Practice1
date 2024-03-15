package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
//		상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품가격: ");
		float p = scanner.nextInt();
		System.out.print("받은돈: ");
		float m = scanner.nextInt();
		
		float x = p/10;
		float ex = m-p;
		
		System.out.println("받은돈: "+m);
		System.out.println("상품가격: "+p);
		System.out.println("부가세: "+x);
		System.out.println("잔액: "+ex);
	}

}
