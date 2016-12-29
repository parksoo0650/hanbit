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
		String info = "";
		Scanner s = new Scanner(System.in);
		int[]arr=new int[5];
		String arrgrade="";
		System.out.print("Name : " );
		System.out.println("If you wnat to stop , Type -1");
		System.out.println("If the number of Subject is 6, Auto quit!!");
		String name=s.next();
		System.out.print("Score : ");
		    for(i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
			if(arr[i]>100){
			    System.out.println("다시입력하세요.");
			    //arr[i]=s.nextInt();
			    
			   }
			total+=arr[i];
			arrgrade+=arr[i]+"\t";
		    }
		    avg=total/i;
		    /*String avg1="";
		    avg1+=avg;
		    char cavg=avg1.charAt(0);*/
		    int num=(int)(avg*0.1);
		   /* total+=score;
		    avg=total/num;
		    num++;*/
		switch(num)
		{
		case 9:
		    grade='A';
		    break;
		case 8:
		    grade='B';
		    break;
		case 7:
		    grade='C';
		    break;
		default:
		    grade='D';
		   break;
		}
		    /*if(avg>=90){
			grade='A';
		}else if(avg>=80){
		    grade='B';
		}else if(avg>=70){
			grade='C';
		}else{
			grade='D';
		}*/
		String sub=""; 
		String arrsub[]={"이름","국어","영어","수학","사회","과학","평균","학점"};
		for(i=0;i<arrsub.length;i++){
		   sub+=arrsub[i]+"\t";
		}
		info=name+"\t"+arrgrade+avg+"\t"+grade;
		 String line = "-------------------------------------------------------------";
		 String line1 = "===========================================================";
		System.out.println("");
		System.out.println("");
		System.out.printf("%s\n%s\n%s\n%s\n%s",line1, sub, line, info, line1);
	}

}