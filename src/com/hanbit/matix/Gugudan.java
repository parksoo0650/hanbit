package com.hanbit.matix;

public class Gugudan {
    public static void main(String[] args) {
	//i*j=i*j
	int result=0;
	String gugudan="";
	int [][]mtx= new int[10][6];
	int i=0, j=0;
	j=5;
	for(i=1;i<mtx.length;i++){
	    System.out.printf("\n");
	    j=5;
	    for(j=2; j<mtx[i].length; j++){
		result=i*j;
		mtx[i][j]=result;
		System.out.printf("%d*%d=%s\t",j,i,result);
		   if(mtx[i].length==9){
		       i=5;
		       System.out.printf("%d*%d=%s\t",j,i,result);
		   }
		 
	}
	    
      }
	
	
    }
}
