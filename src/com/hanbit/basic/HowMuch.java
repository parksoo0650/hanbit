package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		// Variables Declation
		Scanner scanner = new Scanner(System.in);
		int price = 0, count = 0, total = 0, result = 0, dc = 0;
		// Value Assingment
		System.out.println("얼마에요?");
		price = scanner.nextInt();
		System.out.println(price + "원 입니다.");
		System.out.println("몇개 드릴까요?");
		count = scanner.nextInt();
		System.out.print(count + "개 주세요");
		total = price * count;
		System.out.println("총 금액은 " + total + "원 입니다.");
		System.out.println("비싸요. 깎아주세요");
		System.out.println("얼마나 깎아 드릴까요?");
		dc = scanner.nextInt();
		System.out.println(dc + "% 깍아주세요");
		
		//Operation
		if (dc <= 10) {
			result = (total * dc) / 100;
			total = total - result;
			System.out.println("그럼 " + total + "원만 주세요");
		} else {
			System.out.println("안 남아요. 안 팝니다.");
		}
	}
}