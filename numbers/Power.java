package com.numbers;
import java.util.Scanner;

public class Power {
//	int num;
//	int pow;
//	public  int find(int res) {
//		
//		 res=(int)Math.pow( num, pow);
//		 res=1;
//		for (int i=1;i<=pow;i++) {
//			res=res*num;
//		}
//		return res;
//	}

	public static void main(String[] args) {
//		Power p1=new Power();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the num and power ");
////		int res=(int)Math.pow(int num, pow);
//		 res=sc.nextInt();
//		System.out.println(p1.find(res));
//       
//		 int count;
		    int base, power, result  =1;
		    try(Scanner n1 = new Scanner(System.in))
		    {
		        System.out.println("Enter Base");
		        base = n1.nextInt();
		        System.out.println("Enter power");
		        power = n1.nextInt();
		    }
		  //  while(count<=num2)
		    {
		    	 
		        if(power==1)
		        {
		        	
//		            count++;
		            System.out.println(base+" to the power "+power+" is "+base);
		        }
		        else
		        {
		        	for (int i=1;i<=power;i++) {
//	        	result=(int)Math.pow( base, power);
		        	result = base*result;
//	            System.out.println(base+" to the power "+power+" is "+result);
//		        	System.out.println(num1+" to the power "+num2+" is "+result);
		        }
		        	System.out.println(base+" to the power "+power+" is "+result);
		    }
		   // System.out.println(num1+" to the power "+num2+" is "+result);
		}
	}
}


