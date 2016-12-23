package com.hanbit.loop_while;
import java.util.Scanner;
/**
@FILE   : SeriesInput.java
@DATE   : 2016. 12. 23.
@AUTHER : Park Seoung-soo
@STORY  : 입력 받은 값을 더하기,
	  Type이 -1이면 루프 종료 합니다.
*/
public class SeriesInput {
    public static void main(String[] args) {
	System.out.println("Type Number:");
	Scanner s = new Scanner(System.in);
	int num=0;
	int sum=0;
	while (true) {
	    System.out.println("Type Number:");
	    num=s.nextInt(); 
	    if (num==-1) { 
		System.out.println("합은" + sum + "입니다.");
		break;
	    }
	    sum=sum+num; 
	}
    }
}
