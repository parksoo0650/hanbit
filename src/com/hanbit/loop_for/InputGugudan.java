package com.hanbit.loop_for;

import java.util.Scanner;

public class InputGugudan {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num = 0;
	while (true) {
	    System.out.println("출력할 단을 입력하세요");
	    num = s.nextInt();
	    if (num <= 0) {
		System.out.println("올바른 값을 입력 해 주세요.");
	    } else {
		System.out.println(num + "단");
		for (int i = 1; i < 10; i++) {
		    int result = 0;
		    result = num * i;
		    System.out.printf("%d * %d = %d \n",num,i,result);

		}

	    }
	}

    }
}
