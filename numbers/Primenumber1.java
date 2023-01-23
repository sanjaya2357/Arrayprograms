package com.numbers;
// Program to find n prime number
public class Primenumber1 {
	public static void check(int n) {
		int num=1;
		int count=0;
		int i;
		while (count<n) {
			num=num+1;
			for(i=2;i<=num;i++) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				count=count+1;
			}
		}
		
		System.out.println(num);
	}
	
	public static void main(String[] args) {
	
          check(10);
	}

}
