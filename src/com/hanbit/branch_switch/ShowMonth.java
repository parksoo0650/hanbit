package com.hanbit.branch_switch;
import java.util.Scanner;

public class ShowMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Year :");
		int year = s.nextInt();
		System.out.println("Month :");
		int month = s.nextInt();
		String res;
		switch(month){
		case 1:
			res = "31"; break;
		case 3:
			res = "31"; break;
		case 5:
			res = "31"; break;
		case 7:
			res = "31"; break;
		case 8:
			res = "31"; break;
		case 10:
			res = "31"; break;
		case 12:
			res = "31"; break;
		case 4:
			res = "30"; break;
		case 6:
			res = "30"; break;
		case 9:
			res = "30"; break;
		case 11:
			res = "30"; break;
		case 2:
			if (year % 400 == 0 || (year % 100 == 0 && year % 4 == 0 )){
				res = "28";
			} else {
				res = "29";
			}
			
			/*if(year % 400 == 0){
				res = "윤년";
			}else if(year % 100 == 0){
				res = "평년";
			}else if(year % 4 == 0){
				res = "윤년";
			}else{
				res = "평년";
			}*/
			break;
			default :
				res = "몰라";
		}
		System.out.println(month + "월은" + res + "일까지 입니다.");
		
	}
}
