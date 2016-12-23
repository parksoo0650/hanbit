package com.hanbit.loop_while;
import java.util.Scanner;
/**
@FILE   : ReportCard.java
@DATE   : 2016. 12. 23.
@AUTHER : Park Seoung-soo
@STORY  : 
*/
public class ReportCard {
	public static void main(String[] args) {
		int score=0,total=0,avg=0,sum=0,num=1;
		char grade ='0';
		Scanner s = new Scanner(System.in);
		System.out.print("Name : " );
		String name=s.next();
		while(true){
		    System.out.print("Score : ");
		    score=s.nextInt();
		    if(score==-1){
			break;
		    }
		    sum=sum+score;
		    total=sum;
		    avg=total/num;
		    num=num+1;
		    }
		if(avg>=90){
			grade='A';
		}else if(avg>=80){
		    grade='B';
		}else if(avg>=70){
			grade='C';
		}else{
			grade='D';
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Name    :" + name);
		System.out.println("Total   :" + total);
		System.out.println("Average :" + avg);
		System.out.println("grade   :" + grade);
	}
}