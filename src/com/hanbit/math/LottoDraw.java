package com.hanbit.math;

/**
@FILE   : LottoDraw.java
@DATE   : 2016. 12. 27.
@AUTHER : Park Seoung-soo
@STORY  : 로또볼 추첨
	  1~45까지 랜덤숫자
	    볼갯수는 총 6개
	    중복 허용
	    출력은 {5,23,12,40,19,22]
	  
*/
public class LottoDraw {
    public static void main(String[] args) {
	
	int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,count=0;
	while(true){
	    
	    int num=(int) (Math.random()*45+1);
	    count++;
	    
	    switch(count){
	    case 1:
		b1=num;
		break;
	    case 2:
		b2=num;
		break;
	    case 3:
		b3=num;
		break;
	    case 4:
		b4=num;
		break;
	    case 5:
		b5=num;
		break;
	    case 6:
		b6=num;
		break;
	    default:
		System.out.println("다시 입력하세요.");
		break;
		
	    }
	    
	    if(count==6){
		break;
	    }
	   
	  }
	  System.out.printf("추첨된 번호 [%d,%d,%d,%d,%d,%d]",b1,b2,b3,b4,b5,b6);
    }
}
