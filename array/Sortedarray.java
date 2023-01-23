package array;
import java.util.Scanner;

public class Sortedarray {

	public static void main(String[] args) {
		
		
//		for(int i=0;i<5;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				if(i==j)
//				{
//					System.out.print('*');
//				}
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==j)
				{
					System.out.print('*');
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		int arr[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Elements");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the array Elements at index"+i);
			 arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(" array Elements at index("+i+")is "+arr[i]);
		}
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
         		if(arr[i]>arr[j]) // ASSENDING ORDER
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		
		System.out.println("Sorted order of the elament in array is ");
//		System.out.println("Sorted order of the elament in array is "+);
		
			for(int i=0;i<=arr.length-1;i++) {
				System.out.println(arr[i]);
		}
		}
//	System.out.println(arr[i]);
		

	}


