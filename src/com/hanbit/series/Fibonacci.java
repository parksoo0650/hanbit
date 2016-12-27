package com.hanbit.series;

/**
@FILE   : Fibonacci.java
@DATE   : 2016. 12. 27.
@AUTHER : Park Seoung-soo
@STORY  :  
*/
public class Fibonacci {
    public static void main(String[] args) {
	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55의 합

	int a=1, b=1, c=2, sum=2;
	for (int i=3; i<=10; i++) {
	    c=a+b;
	    a=b;
	    b=c;
	    sum+=c;
	}
	System.out.printf("%d",sum);
    }
}
