package com.hanbit.loop_while;
/**
 * @FILE : SeriesOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHER : Park Seoung-soo
 * @STORY : 1부터 2까지의 합 구하기(diff=1)
 */
public class SeriesOneToFive {
    public static void main(String[] args) {
	int sum = 0;
	int num = 1;
	while(true){
	    sum = sum + num;
	    if(num == 5){break;}
	    num = num + 1;
	}
	sum=1+2+3+4+5;
	System.out.println("합은 " + sum + "입니다.");
	 
    }
}
