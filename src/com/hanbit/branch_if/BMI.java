package com.hanbit.branch_if;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("나이 :");
		int age = s.nextInt();
		if(age < 2){
			System.out.print("BMI지수의 참고지 정보는 2세 이상부터 제공됩니다.");
			System.out.print("정확한 정보를 입력하세요.");
			
			return;
		}
		System.out.print("신장 : ");
		double height = s.nextDouble();
		System.out.print("몸무게 : ");
		double weight = s.nextDouble() / 100;
		System.out.print("몸무게 : " + height);
		System.out.print("몸무게 : " + weight);
		
			double bmi = weight / (height * height) ;
			String bmindex = "";

			if (bmi > 30.0) {
				bmindex = "고도비만";
			} else if (bmi > 25.0) {
				bmindex = "비만";
			} else if (bmi > 23.0) {
				bmindex = "과체중";
			} else if (bmi > 18.5) {
				bmindex = "정상";
			} else {
				bmindex = "저체중";
			}
			System.out.println("신체 질량 지수 : " + bmi);
			System.out.println(bmindex);
		
	
	}	
}