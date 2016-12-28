package com.hanbit.matix;
import java.util.Scanner;
/**
@FILE   : ReportCard.java
@DATE   : 2016. 12. 23.
@AUTHER : Park Seoung-soo
@STORY  : 
*/
public class ReportCard {
	public static void main(String[] args) {
		int total=0,avg=0,i=0;
		char grade='0';
		String arrstr="0";
		String info = "0";
		Scanner s = new Scanner(System.in);
		int[]arr=new int[5];
		String arrgrade="0";
		System.out.print("Name : " );
		System.out.println("If you wnat to stop , Type -1");
		System.out.println("If the number of Subject is 6, Auto quit!!");
		String name=s.next();
		
		
		    for(i=0;i<arr.length;i++){
			System.out.print("Score : ");
			arr[i]=s.nextInt();
		    }
		    for(i=0;i<arr.length;i++){
			total+=arr[i];
			//arrstr=(i==arr.length-1)?arrstr+"=":arrstr+"+";
			
			   
		    }
		    avg=total/i;
		   /* total+=score;
		    avg=total/num;
		    num++;*/
		    
		if(avg>=90){
			grade='A';
		}else if(avg>=80){
		    grade='B';
		}else if(avg>=70){
			grade='C';
		}else{
			grade='D';
		}
		String sub="0"; 
		String arrsub[]={"이름","국어","영어","수학","사회","과학","평균","학점"};
		
		for(i=0;i<arrsub.length;i++){
		   sub+=arrsub[i] + "    ";
		}		
		   for(i=0;i<arr.length;i++){
		      arrgrade+=arr[i]+"  ";
		       
				    } 
		 String line = "--------------------------";
		System.out.println("");
		System.out.println("");
		/*System.out.printf("Name     : %s \n" ,name);
		//System.out.printf("equation : %s%d\n",arrstr,total);  
		System.out.printf("Total    : %d \n" ,total);
		System.out.printf("Average  : %d \n" , avg);
		System.out.printf("grade    : %s \n" , grade);*/
		System.out.printf(
			"====================================\n"  +
			"%s \n %s \n %s %s %d %s",sub, line, name, arrgrade,avg,grade +
			"\n====================================");
	}

}