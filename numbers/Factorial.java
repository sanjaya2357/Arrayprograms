package com.numbers;
import java.util.Scanner;

public class Factorial {
	public int find(int num) {
		int fact=1;
//		for (int i=num;i>=1;i--) { // BY USING FOR LOOP
//			fact=fact*i;
//			                                    
//		}
//		 if(num==1)   // BY USING RECURSION
////		 {
//		 return 1;
//		 }
//		 else if(num==0) {
//			 return 0;
//		 }
//		 return num*find(num-1);
		while (num>0) {             // BY USING WHILE LOOP
			fact=fact*num;  
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial f1=new Factorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(f1.find(num));
		

	}

}
