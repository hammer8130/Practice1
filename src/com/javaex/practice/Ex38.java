package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
//		총 금액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세
//		요	
		Scanner scanner = new Scanner(System.in);
		System.out.print("전체금액을 입력해주세요: ");
		int x = scanner.nextInt();

		int r = 1000 * (x / 1000);
		System.out.println("실제지불금액은 " + r + " 입니다.");
		
		scanner.close();
	}

}
