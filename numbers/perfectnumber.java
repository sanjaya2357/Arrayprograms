package com.numbers;

public class perfectnumber {
	public static void check(int num) {
		int i;
		int count=0;
		for( i=1;i<=num;i++) {
			if(i*i==num) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(num+" is perfect number");
		}
		else {
			System.out.println(num+"NOT a perfect number");
		}
	}

	public static void main(String[] args) {
		check(6);

	}

}
