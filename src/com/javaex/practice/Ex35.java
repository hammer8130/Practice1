package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
//		long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
//		(단 빛의 속도는 300000 km/s 로 계산한다)
		
		long l = 300000;
		long s = (l*60)*60*24*365;
		
		System.out.println("빛이 1년 동안 가는 거리는 "+s+"km 입니다.");
		

	}

}
