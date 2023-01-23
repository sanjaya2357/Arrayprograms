package array;

import java.util.Scanner;

public class checkelement {

	public static void main(String[] args) {
		int arr[]= {10,30,5,50,30,20};
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ELEMENT TO CHECK");
		int num=sc.nextInt();
		int index=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==num) {
				 index=i;
			}
		}
		if(index==0) {
			System.out.println("Element not found");
		}
		else {
			System.out.println(num+" Element found at index "+index);
		}
	}

}
