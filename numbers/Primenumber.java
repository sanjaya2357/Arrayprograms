package com.numbers;
import java.util.Scanner;

public class Primenumber {
	public static void check(int num)
	{
		int count=0;
		for (int i=2;i<=num-1;i++) {
			if(num%i==0) 
			{
				count++;
			}
		}
		 if (count==0 && num>1)
		 {
			 System.out.println("Prime Number");
			 System.out.println("count");

			 
		 }
		 else {
			 System.out.println("Not a Prime Number");
		 }
		}
		
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
       check(num);
	}

}
