package com.hanbit.branch_switch;
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
		switch(opcode){
		case "+":
			result = first + second; 
			break;
		case "-": 
			result = first - second;
			return;
		case "*": 
			result = first * second;
			break;
		case "/": 
		result = first / second;
			break;
		case "%": 
			result = first % second;
			break;
		default : 
			System.out.println("ERROR!");
			return;
		}
			System.out.println("Result : " + result);
	}

}