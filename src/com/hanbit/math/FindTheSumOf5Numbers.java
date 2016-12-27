package com.hanbit.math;
import java.util.Scanner;
public class FindTheSumOf5Numbers {
    public static void main(String[] args) {
	int sum=0,count=0,n=0;
	Scanner s = new Scanner(System.in);
	/*for(count=0; count<5; count++){
	    n = s.nextInt();
	    sum+=n;
	   }
	 System.out.printf("%d",sum);*/
	while(count<4){
	    n = s.nextInt();
	    sum+=n;
	    count++;
	}
	System.out.printf("%d",sum);
    }
}
