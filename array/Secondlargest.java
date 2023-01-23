package array;

import java.util.Arrays;

public class Secondlargest {

	public static void main(String[] args) {
		int arr[]= {12,35,65,34,56,68,13,35};
//		Arrays.sort(arr);
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("2nd Largest element in an arry "+arr[arr.length-2]);
//		System.out.println("2nd Smallest element in an arry "+arr[1]);
		
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
		
		int secondlargest =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secondlargest && arr[i]<largest) {
				secondlargest=arr[i];
			}
		}
		System.out.println(secondlargest);

		
	}

}
