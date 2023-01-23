package array;

import java.util.Arrays;

public class Maxmin {

	public static void main(String[] args) {
		int arr[]= {10,80,50,60,590,100};
		Arrays.sort(arr);
         int max=arr[0];
         int min=arr[0];
         for(int k=0;k<arr.length;k++) {
        	 System.out.println(arr[k]);
         }
         
       for(int i=arr.length;i>=0;i--)
       {
        	 if(arr[i]!=arr[i-1]) {
        		 System.out.println(arr[i]);
        	 }
	}   
//         System.out.println(arr);
         for(int i=0;i<=arr.length-1;i++) {
        	 if(arr[i]>max){
        		 max=arr[i];
        	 }
        	 if(arr[i]<min) {
        		 min=arr[i];
        	 }
         }
         System.out.println(max);
         System.out.println(min);
}
}
