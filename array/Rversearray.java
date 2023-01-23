package array;
import java.util.Scanner;

public class Rversearray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the elements of the array["+i+"]");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(" elements of the array ["+i+"]"+arr[i]);
	}
		System.out.println(" Elements of the reversed array ");
		for(int i=arr.length-1;i>=0;i--) {
			//System.out.println(" Elements of the reversed array ");
			System.out.println(+arr[i]);
			
		}

}
}