package com.hanbit.math;
import java.util.Scanner;
/**
 @FILE : NumberGolf.java
 @DATE : 2016. 12. 27.
 @AUTHER : Park Seoung-soo
 @STORY : 최단횟수로 맞추는 사람이 승리하는 게임
 -1 stop
 You can Integer 1~100
 */
public class NumberGolf {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int target=(int) (Math.random()*100+1);
	int bet=0;
	int count=0;
	System.out.println("TARGET:"+target);
	while(true){
	    System.out.println("Enter Integer(1~200)");
	    bet=s.nextInt();
	    count++;
	    if(bet==target){
		System.out.println("정답입니다. 축하합니다.");
		System.out.println(count + "번 만에 맞추셨습니다.");
	    }else{
		System.out.println("땡! 틀렸습니다.");
		System.out.println((bet<target)?"target이 bet보다 큽니다.":"target이 bet보다 작습니다.");
	    }
	}
    }
}
