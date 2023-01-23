package com.numbers;
import java.util.Scanner;

public class Spynumber {
	public String check(int num) {
		int sum=0;
		int product=1;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		System.out.println("Sum of a number is "+sum);
		System.out.println("Product of a number is "+product);
		 if (sum==product) 
		 {
			return "SPY NUMBER";
		 }
		 else {
			 return "NOT a SPY NUMBER";
		 }
	}

	public static void main(String[] args) {
		Spynumber s1=new Spynumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(s1.check(num));
		
	}

}
