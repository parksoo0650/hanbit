package com.hanbit.math;

import java.util.Scanner;

/**
 @FILE : FindTheSumOfMulti5.java
 @DATE : 2016. 12. 27.
 @AUTHER : Park Seoung-soo
 @STORY : [결과] Integer Form 1 TO [input] The Number of Multi 5: ? 
 The Sum: 
 if input less than 1, please input again!
 -1 if you want to stop, enter
 */
public class FindTheSumOfMulti5 {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num=0, count=0, sum=0, i=0;
	
	
	/*if (num<4 && num!=-1) {
	    System.out.printf("%s", "please input again! \n");
	} else if (num==-1) {
	    return;
	} else {
	    System.out.printf("Integer Form 1 To %d \n", num);
	    for (i=5;i<=num;i+=5) {
		if (num%5==0) {
		    sum+=num;
		    count++;
		    System.out.println(i);
		    
		}
		
	    }
	   
	}
	 System.out.printf("The Number of Multi 5:%d \n", count);
	    System.out.printf("The Sum:%d \n", sum);*/
	
	while(true){
	    System.out.printf("%s", "Enter Number \n");
	    num = s.nextInt();
	    if(num<5){
		System.out.println((num==-1)?"Bye~":"please input again!");
	    	}else{
		for(i=1;i<=num;i++){
		    if(i%5==0){
			count++;
			sum+=i;
		    }
		}
		System.out.printf("The Number of Multi 5:%d \n", count);
		    System.out.printf("The Sum:%d \n", sum);
	    }
	}

    }
    
}
