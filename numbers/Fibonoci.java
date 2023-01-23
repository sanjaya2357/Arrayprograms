package com.numbers;

public class Fibonoci {
	public static void find(int num) {
		int l1=1;
		int l2=1;
	int sum=l1+l2;
//		System.out.print(l1+" ");
//	System.out.print(l2+" ");
		for (int i=3;i<=num;i++) 
		{
			int l3=l1+l2;
		System.out.print(l3+" ");
		   l1=l2; 
		    l2=l3;
//		    
//			 sum += l3;
//			 System.out.println(sum);
			
			//System.out.print(sum);
		
			
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(4);
	}

}
