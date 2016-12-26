package com.hanbit.loop_for;

public class Series1To10 {
    public static void main(String[] args) {
	int sum=0;
	for(int i=0;i<=10;i++){
	    System.out.printf("%s%d","NUM",i);
	    sum+=i;
	 }
	 System.out.printf("%s %d %s","합은 ",sum, "입니다.");
    }
    
}
