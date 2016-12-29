package com.hanbit.matix;

public class MrSmith {
    public static void main(String[] args) {
	String[][] name = {
		{"Good Morning","Good Afternoon","Good Evening","Good Bye"},
		{"Mr","Mrs","Miss"},
		{"Smith","Alex","Johnson"}};
	String people="";
	people=name[0][1];
	people+=name[1][1];
	people+=name[2][1];
	System.out.printf("%s\t",people);
    }
}
