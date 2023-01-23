package array;

import java.util.Arrays;

public class Zerotoleft {
	
	public static int[] zerotoleft(int []a) {
		if(a.length==1) {
			return a;
			}
		int[] newarray=new int[a.length];
		int count=0;
		for(int number: a) {
			if(number!=0) {
				newarray[count]=number;
				count++;
			}
		}
		return newarray;
	}

	public static void main(String[] args) {
    int a[]= {0,2,1,0,4,0,0,7};
    System.out.println(Arrays.toString(zerotoleft(a)) );

	}

}
