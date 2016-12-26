package com.hanbit.loop_for;

public class Fibonacci {
    public static void main(String[] args) {
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55의 합

	int a=1, b=1, c=2, sum=2;
	for (int i=3; i<=10; i++) {
	    c=a+b;
	    a=b;
	    b=c;

	    System.out.println(a);
	    // System.out.println(b);
	    // System.out.println(c);
	    sum+=c;
	}
	System.out.printf("%d",sum);
    }
}
