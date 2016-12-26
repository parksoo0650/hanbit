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
		int score=0,total=0,avg=0,num=1;
		char grade ='0';
		Scanner s = new Scanner(System.in);
		System.out.print("Name : " );
		System.out.println("If you wnat to stop , Type -1");
		System.out.println("If the number of Subject is 6, Auto quit!!");
		System.out.print("Score : ");
		String name=s.next();
		while(num<=6){
		    System.out.print("Score : ");
		    score=s.nextInt();
		    if(score==-1){
			break;
		    }
		    total+=score;
		    avg=total/num;
		    num++;
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
		System.out.printf("Name    %d:" + name);
		System.out.printf("Total   %d:" + total);
		System.out.printf("Average %d:" + avg);
		System.out.printf("grade   %d:" + grade);
	}
}