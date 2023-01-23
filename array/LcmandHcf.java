package array;

public class LcmandHcf {
	
	public static int maxlcm(int arr[],int n) {
		int maxlcm=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				maxlcm=Math.max(maxlcm, (arr[i]*arr[j]/findgcd(arr[i],arr[j])));
			}
			
		}
		return maxlcm;
	}

	private static int findgcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return findgcd(b,a%b);
	}

	public static void main(String[] args) {
		int arr[] = { 17, 3, 8, 6 };
        int n = arr.length;
 
        System.out.print(maxlcm(arr, n));
//		int[] arr = {8,4,2,16};
//		int max,min,x,lcm=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length-1;j++) {
//				if(arr[i]>arr[j]) {
//					max=arr[i];
//					min=arr[j];
//				}
//					else {
//						max=arr[j];
//						min=arr[i];
//					}
//				
//				for(int k=0;k<arr.length;k++) {
//					x=max*k;
//					if(x%min==0) {
//						lcm=x;
//					}
//				}
//				}
//			}
//		System.out.println("Lcm of array elements is "+lcm);
//		int lcm=arr[0];
//		int gcd=arr[0];
//		
//		for(int i=1;i<arr.length;i++) {
//			gcd=findgcd(arr[i],lcm);
//			lcm=(lcm*arr[i])/gcd;
//		}
//	
//		System.out.println(lcm);
//	}
//		
//		public static int findgcd(int a,int b) {
//			if(b==0) {
//				return a;
//			}
//				else 
//				{
//					return findgcd(b,a%b);
//				}
			}
		

		}

	


