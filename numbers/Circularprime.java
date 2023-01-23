package com.numbers;

public class Circularprime {
	public static boolean check(int num)
    {
     int temp=num;
     int count=0;
     while (temp>0)
     {
        count++;
        temp=temp/10;
     }
     for (int i=1;i<=count;i++)
     {
        for (int j=2;j<=num-1;j++)
        {
            if (num%j==0)
            {
                return false;
            }
        }
        int rem=num%10;
        int m1=num/10;
        
        num=rem*(int)Math.pow(10,count-1)+m1;
        System.out.println(num+"");
        
     }
     return true;
    }

	public static void main(String[] args) {
		
       System.out.println(check(3119));
	}

}
