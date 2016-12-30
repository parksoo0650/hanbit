package com.hanbit.matix;

/**
@FILE   : Zigzag.java
@DATE   : 2016. 12. 29.
@AUTHER : Park Seoung-soo
@STORY  :  1   2   3   4   5
 10   9   8   7   6
 11  12  13  14  15
 20  19  18  17  16
 21  22  23  24  25
 * */
public class Zigzag {
    public static void main(String[] args) {
        int length = 5; // 배열 길이
        int[][] arr = new int[length][length];
        int k = 1; // 넣을 값
        int flag = 1; // 스위치변수
        int i = 0; // 행
        int j = 0; // 열
        String str="";
        int x=0;
        for(i=0;i<arr.length;i++){
            System.out.printf("%s","\n");
            if(i%2==1){
        	for(j=4;j>=0;j--){
			arr[i][j]=k;
			k++;
		    }
		}else{
		    for(j=0;j<5;j++){
			arr[i][j]=k;
			k++;
		    
		    }	
		    
        	}
            }
        for(i=0;i<5;i++){
            System.out.printf("%s","\n");
            for(j=0;j<5;j++){
        	System.out.printf("%d\t",arr[i][j]);
            } 
        }
        
    }     
}
