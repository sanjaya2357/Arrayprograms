package com.numbers;

public class Armstrong {
	public static void check(int num) {
		int temp=num;
		int res=0;
		while(num>0) {
			int rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
		System.out.println(temp + " " +res);
		if (res==temp)
		{
			System.out.println(temp + " is Armstrong number");
		}
		else {
		System.out.println(temp + " is not a armstrong number");
	}
	}

	public static void main(String[] args) {
	  check(9474);

	}

}
