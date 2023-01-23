package com.numbers;
import java.util.Scanner;


public class Sumofdigit {
	public int check(int num) 
	{
	int sum=0;
	while(num>0) 
	{
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	return sum;
}

	public static void main(String[] args)
	{
		Sumofdigit s1=new Sumofdigit();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
		int num = sc.nextInt();
	//System.out.println("Enter the number");
	System.out.println(s1.check(num));

		
		
		
}
}