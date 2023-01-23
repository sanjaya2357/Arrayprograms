package array;
import java.util.Scanner;

public class Arraydemo {

	public static void main(String[] args) {
//	   int arr[]= {10,20,20,40,50};
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the value of the array["+i+"]");
		 arr[i]=sc.nextInt();
		}
	   for(int i=0;i<=arr.length-1;i++) 
	   {
		   System.out.println("Value at arr["+i+"] is "+arr[i]);
			   
		   }
	   }

	}


