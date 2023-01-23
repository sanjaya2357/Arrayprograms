package array;

import java.util.Arrays;

public class Duplicatearray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,2,7,8,9,8};

// To print duplicate elements from an array
//	for(int i=0;i<=a.length-1;i++)
//	{
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]==a[j]) {
//				System.out.println(a[i]);
//			}
//		}
//			
//		}	
	
	// To remove duplicate elements from an array
		
		int len=a.length;
		int newarray[]=new int[a.length];
		int s=0;
		Arrays.sort(a);
		for(int i=0;i<len-1;i++) {
			if(a[i]!=a[i+1]) {
				newarray[s++]=a[i];
			}
		}
		newarray[s++]=a[len-1];
		
		for(int k=0;k<s;k++) {
			System.out.print(newarray[k]+" ");
		}
	
		
	}
	
	}

