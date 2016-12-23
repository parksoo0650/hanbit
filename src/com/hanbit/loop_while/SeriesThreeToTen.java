package com.hanbit.loop_while;

/**
@FILE   : SeriesThreeToTen.java
@DATE   : 2016. 12. 23.
@AUTHER : Park Seoung-soo
@STORY  : 3부터 10까지의 합
*/
public class SeriesThreeToTen {
    public static void main(String[] args) {
	int sum = 0;
	int num = 3;
	while(true){
	    sum = sum + num; 
	    if(num==10){break;} 
	    num = num + 1; 
	    
	}
	System.out.println("합은 " + sum + "입니다.");
    }
}
