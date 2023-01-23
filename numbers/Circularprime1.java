package com.numbers;
import java.util.Scanner;

public class Circularprime1
{
	public static boolean check(int num)
	{
		int temp=num;
		int count=0;
		while(temp>0) 
		{
			     count++;
				temp=temp/10;
			}
			for(int i=1;i<=count;i++)
			{
				for(int j=2;j<=num-1;j++) 
				{
					if(num%j==0)
					{
						return false;
					}
				}
				int rem=num%10;
				int m1=num/10;
				num=rem*(int)Math.pow(10, count-1)+m1;
				System.out.println(num);

				
			}
			return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int num=sc.nextInt();
		System.out.println(check(num));

	}

}
