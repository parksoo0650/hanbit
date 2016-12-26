package com.hanbit.loop_for;
/**
 * @FILE : SeriesOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHER : Park Seoung-soo
 * @STORY : 1부터 2까지의 합 구하기(diff=1)
 */
public class Unary {
    public static void main(String[] args) {
	int sum=0;
	for(int num=0;num<5;num++){
	    System.out.printf("%s:%d \n","NUM",num);
	    sum+=num;
	}
	//sum=1+2+3+4+5;
	System.out.printf("%s %d %s","합은 ",sum ,"입니다.");
	 
    }
}
