package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
//		다음 중 결과값이 다른 것을 선택하고 이유를 설명해 보세요
		
		System.out.println(13/5); // 2
		System.out.println((double)(13/5)); //2.0
		
		
//		((double)(13/5)); 의 연산 순서는 / 먼저 실행되므로
//		해당몫의 double형인 2.0으로 변환이 된다.
	}

}
