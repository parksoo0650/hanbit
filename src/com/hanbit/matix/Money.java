package com.hanbit.matix;
import java.util.Scanner;
/**
@FILE   : Money.java
@DATE   : 2016. 12. 28.
@AUTHER : Park Seoung-soo
@STORY  : 
 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램
 * [요구사항] 금융업을 하는 고객사로부터 프로그램 개발요청이 들어왔습니다.
 * 금액을 입력받은 후 우리나라 화폐종류별로 해당 갯수를 표기하는 프로그램입니다.
 * 예를들어, 125,520 원을 입력하면 화면에 이렇게 보이게 하면 됩니다.
 * 표시하고 10원미만은 절삭
   ******************************************************
      요청금액 : 126520 원
      5만원 : 2매
      1만원 : 2매
      5천원 : 1매
      1천원 : 1매
      5백원 : 1개
               백원 : 0개
               오십원 : 0개
               십원 : 2개
*/
public class Money {
    public static void main(String[] args) {
	   System. out.println( "금액을 입력하세요" );

	        Scanner s = new Scanner(System. in);
	        String m="0";
	        int money = s.nextInt();

	        int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

	        int mok = 0;

	        int nmg = 0;
	        int mod = 0;
	        int moneycount=0;
	        System. out.println( "Money:" + money);
	        System.out.printf("%s %d %s","요청금액은",money,"원 입니다. \n");
	        for (int i = 0; i < moneyUnit.length; i++) {
	            // 이 부분을 코딩하여 완성하시오
	            mok=money/moneyUnit[i];
	            nmg=money%moneyUnit[i];
	            money=nmg;
	            String[] moneyname = { "5만원", "1만원", "5천원", "1천원", "5백원", "백원", "오십원", "십원"};
	            for(int j=0; j < moneyname.length; j++){
	        	m=moneyname[i];
	            }
	            System.out.printf("%s %d%s \n",m,mok,"매");
	            
	        	
	            }
	            /*    switch(i){
	            case 1:
	        	mok=money/moneyUnit[i];
	        	nmg=money%moneyUnit[i];
	        	
	            }
	            */
	           
	            }
		            

       	 
	            
	            
	          /*  System.out.printf("\n %s %d","5천원:",mok);
	            System.out.printf("\n %s %d","1천원:",mok);
	            System.out.printf("\n %s %d","5백원:",mok);
	            System.out.printf("\n %s %d"," 백원:",mok);
	            System.out.printf("\n %s %d"," 오십원:",mok);
	            System.out.printf("\n %s %d"," 십원:",mok);      
	        	   */
	           
	         
	            
	        	
	       	 
	            
	        }
	          
	        
	           
	            
	        
    		

