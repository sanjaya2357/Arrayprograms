package array;
import java.util.Scanner;

public class Findnumarray {

	public static void main(String[] args) {
		int count=-1;
		int arr[]= {10,20,30,60,70,20};
		System.out.println(arr.length);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to search present in array");
		int n=sc.nextInt();
		for(int i=0;i<=arr.length-1;i++) {
			if(n==arr[i]) {
//				System.out.println(n+" is present in an array");
				count=i;
				break;
			}
		}
//			else {
//				System.out.println(n+" is not present in an array");
//			}
			if(count!=-1) {
				System.out.println(n+" is present in an array");
				System.out.println(n+" is present in an array at index number"+(count));
			}
			
			else {
			System.out.println(n+" is not present in an array");
		}
		}


	}


