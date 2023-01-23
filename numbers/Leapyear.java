package com.numbers;
import java.util.Scanner;

public class Leapyear {
	public static String check(int year) {
		if (year%400==0 && year%100!=0 || year%4==0) {
			return "LEAP YEAR";
		}
		return "NOT A LEAP YEAR";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int num=sc.nextInt();
		System.out.println(check(num));

	}

}
