
package com.hanbit.branch_switch;

import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ssn = "0", gender = "0", name = "0";
		
		System.out.print("주민번호 :");
		ssn = s.next();
		char ch = ssn.charAt(7);
	
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
		System.out.println("다시 입력하세요");
			return;
	 }
	 	System.out.print("이름 :");
		name = s.next();
	
		switch(ch){
		case '1' : case '3' :
			gender = "남자"; 
			break;
		case '2' :case '4' :
			gender = "여자"; 
			break;
		case '5' : case '6' :
			gender = "외국인"; 
			break;
		
		default :
			System.out.println("ERROR !");
		return;
		}
		/*	if (ch == '1' || ch == '3') {
			gender = "남자";
		} else if (ch == '2' || ch == '4') {
			gender = "여자";
		} else if (ch == '5' || ch == '6') {
			gender = "외국인";
		}*/
		System.out.print(name + " : " + ssn + " : " + gender);
	
  }
}
