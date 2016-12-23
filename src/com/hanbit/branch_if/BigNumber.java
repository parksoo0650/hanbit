/*
 import java.util.Scanner;
public class BigNumber {
public static void main(String[] args) {
Scanner scan = new Scanner(System. in);
System. out.println( "A 값을 입력하세요." );
int a = scan.nextInt();
System. out.println( "B 값을 입력하세요" );
int b = scan.nextInt();
System. out.println( "C 값을 입력하세요" );
int c = scan.nextInt();
// 가장 큰 값부터 작은 순으로 나열하는 statement 를 완성하시오
// 예를 들어, a=4, b=7, c=1 을 입력했다면.. 7,4,1 이 되겠습니다

}
}
 * */
package com.hanbit.branch_if;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("A값을 입력하세요.");
		int a = s.nextInt();
		System.out.println("B값을 입력하세요");
		int b = s.nextInt();
		System.out.println("C값을 입력하세요");
		int c = s.nextInt();
		int na = 0, nb = 0, nc = 0;

		if (a > b) {
			if (a < c) {
				na = a;
				nb = b;
				nc = c;
			} else {
				na = a;
				nb = c;
				nc = b;
				if (b < c) {
					na = a;
					nb = c;
					nc = b;
				} else {
					na = a;
					nb = b;
					nc = c;
				}
				System.out.println(na + ">" + nb + ">" + nc);
			}
		} else if(b > a){
			if (a > c) {
				na = b;
				nb = a;
				nc = c;
			} else {
				if(b > c) {
					na = b;
					nb = c;
					nc = a;
				}else {
				na = b;
				nb = a;
				nc = c;
				}
			}
			System.out.println(na + ">" + nb + ">" + nc);
		}else if(c > b){
			if (b > a) {
				na = c;
				nb = b;
				nc = a;
			} else {
				na = c;
				nb = a;
				nc = b;
				}
			System.out.println(na + ">" + nb + ">" + nc);
		}

		/*
		 * if (a > b && b > c) {
		 * 
		 * System.out.println(a + ">" + b + ">" + c);
		 * 
		 * } else if (b > a && a > c) {
		 * 
		 * System.out.println(b + ">" + a + ">" + c);
		 * 
		 * } else if (c > b && b > a) {
		 * 
		 * System.out.println(c + ">" + b + ">" + a);
		 * 
		 * } else if (a > c && b > c) {
		 * 
		 * System.out.println(a + ">" + c + ">" + b);
		 * 
		 * }else if (b > a && c > a) {
		 * 
		 * System.out.println(b + ">" + a + ">" + c);
		 * 
		 * } else if (c > a && a > b) {
		 * 
		 * System.out.println(c + ">" + a + ">" + b);
		 * 
		 * }
		 */

	
	}
}
