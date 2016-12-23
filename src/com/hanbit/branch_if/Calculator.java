package com.hanbit.branch_if;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("=== Calculator ===");
		int first = 0, second = 0, result = 0;
		System.out.println("First Number :");
		first = s.nextInt();
		System.out.println("Opcode : ");
		String opcode = s.next();
		System.out.println("Second Number : ");
		second = s.nextInt();
		if (opcode.equals("$")) {
			System.out.println("잘못된 값을 입력하셨습니다.");			
			return; 
		}
		if (opcode.equals("+")) {
			result = first + second;
		} else if (opcode.equals("-")) {
			result = first - second;
		} else if (opcode.equals("*")) {
			result = first * second;
		} else if (opcode.equals("/")) {
			result = first / second;
		}
			System.out.println("Result : " + result);
	}

}