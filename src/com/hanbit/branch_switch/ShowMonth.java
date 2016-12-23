package com.hanbit.branch_switch;

import java.util.Scanner;

/**
 * @FILE : ShowMonth.java
 * @DATE : 2016. 12. 23.
 * @AUTHER : Park Seoung-soo
 * @STORY :
 * 
 *        To. 개발자님 [1]연도를 4로 나눈값이 0 이고. 해당 연수가 100으로 나누어 떨어지지 않으면 평년이다.
 *        [2]2000년은 4로 나눈값이 0 이고, 해당 연수가 100으로 나누어 떨어지는데, 400으로 나눠 떨어지는 연도는 윤년이다
 */

public class ShowMonth {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

	System.out.println("Year :");
	int year = s.nextInt();
	System.out.println("Month :");
	int month = s.nextInt();
	String res = "0";
	switch (month) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	    res = "31";
	    break;
	case 4: case 6: case 9: case 11:
	    res = "30";
	    break;
	case 2:
	    if (year % 4 == 0 && year % 100 != 0) {
		res = "29";
	    } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
		res = "29";
	    } else {
		res = "28";
	    }
	    break;
	default:
	    res = "몰라";
	}
	System.out.println(month + "월은 " + res + "일까지 입니다.");

    }
}
