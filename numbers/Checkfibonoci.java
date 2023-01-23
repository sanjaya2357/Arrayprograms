package com.numbers;
import java.util.Scanner;

public class Checkfibonoci {
	public static void check(int num)
	{
		int l1=0;
		int l2=1;
//		if(num==1 || num==0)
//		{
//			return "Fibonoci Number";
//		}
		System.out.print(l1+" "+l2+" ");
	    for(int i=3;i<=num;i++) 
	    {
	    	int l3=l1+l2;
//	    	if(l3==num) {
//	    		return "fibonoci number";
//	    	}
	    	System.out.print(l3+" ");
	    	l1=l2;
	    	l2=l3;
	    	
	    }
//	    return "Not a Fibonoci Number";
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
//      System.out.println( check(num));
		check(num);
	}

}
