package com.hanbit.matix;

public class MatrixDiff5 {
    public static void main(String[] args) {
	int[][]mtx=new int[5][5];
	int k=0;
	for(int i=0;i<mtx.length;i++){
	    System.out.println("");
	    for(int j=0;j<mtx[i].length;j++){
		//mtx[i][j]=k+=5;
		System.out.printf("%d\t",mtx[i][j]);
	    }
	}
    }
}
