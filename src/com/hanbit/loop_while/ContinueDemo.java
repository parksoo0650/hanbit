package com.hanbit.loop_while;

public class ContinueDemo {
    public static void main(String[] args) {
	int sum=0;
	int num=0;
	while(true){
	    num++;
	    sum+=num;
	    if(num<100){
		continue;
		
	    }else{
		break;
	    }
	    
	}
	 System.out.printf("%s: \n"
	 	+ "%d", "합", sum);
    }
}
