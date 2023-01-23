package com.numbers;
import java.util.Scanner;

public class Countofdigit {
	public int check(int num) 
	{
		int count=0;
		while(num>0) {
			int rem=num%10;
			count++;
			num=num/10;
		}
		return count;
	}
//		if(num<=9) {  BY USING RECURSION;
//			return 1;
//		}
//		return 1+check(num/10);
//	}
	public static void main(String[] args)
	{
		Countofdigit c1=new Countofdigit();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		System.out.println(c1.check(num));

	}

}
