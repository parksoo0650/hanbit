package com.hanbit.matix;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	//int[]arr={1,2,3,4,5};
	int[]arr=new int[5];
	/*arr[0]=s.nextInt();
	arr[1]=s.nextInt();
	arr[2]=s.nextInt();
	arr[3]=s.nextInt();
	arr[4]=s.nextInt();*/
	int sum=0 ,i=0, opcode=arr.length;
	String arrstr="0";
	for(i=0;i<arr.length;i++){
	    arr[i]=s.nextInt();
	}
	for(i=0;i<arr.length;i++){
	    sum+=arr[i];
	    arrstr=(arr[i]==arr.length)?arrstr+"=":arrstr+"+";
	    arrstr+=arr[i];
	    
	    //System.out.printf("%s",arrstr); 
	    //System.out.printf("%s",(arr[i]==arr.length)?arr[i]+"=":arr[i]+"+");
	    
	    }
	System.out.printf("%s",arrstr);  
	 
    }
}
