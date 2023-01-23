package array;

public class Maxsubarray {
	
	public static int findmaxsubarray(int []a) {
		int maxsum=a[0];
		int sum=a[0];
        
		for(int i=1;i<a.length;i++) {
			if(sum<0) {
				sum=a[i];
			}
		
			else {
				sum=sum+a[i];
			}
			maxsum=Math.max(sum,maxsum);	
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int a[]= {1,2,-5,4,3,8,5};
         System.out.println(findmaxsubarray(a));
	}

}
        //For maxsubarray of size k
		//public static int findmaxsubarray(int []a, int k) {
//int maxsum=a[0];
//
//for(int i=0;i<a.length-k;i++) {
//	int sum=0;
//for(int j=i;j<i+k;j++) {
// sum=sum+a[i];
//}
//	maxsum=Math.max(sum,maxsum);	
//}
//return maxsum;
//}
