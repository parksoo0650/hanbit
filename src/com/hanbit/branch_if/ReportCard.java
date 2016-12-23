package com.hanbit.branch_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Name : " );
		String name = s.next();
		System.out.print("Korean Score : ");
		kor = s.nextInt();
		System.out.print("English Score : ");
		eng = s.nextInt();
		System.out.print("Math Score : ");
		math = s.nextInt();
		char grade = 0;
		
		total = kor + eng + math;
		avg = total / 3;
		
		if(avg >= 90){
			grade = 'A';
		}else if(avg >= 80){
			grade = 'B';
		}else if(avg >= 70){
			grade = 'C';
		}else{
			grade = 'D';
		}
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("Name : " + name);
		System.out.println("Total : " + total);
		System.out.println("Average : " + avg);
		System.out.println("grade : " + grade);
	}
}