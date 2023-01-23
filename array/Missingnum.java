package array;

public class Missingnum {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,11};
//		int b[]={1,2,3,4,5,6};
        int sum1=0;
        for(int i=0;i<a.length;i++) {
        	sum1=sum1+a[i];
        }
        int sum2=0;
        for(int i=1;i<=11;i=i+2) {
        	sum2=sum2+i;
        }
        System.out.println(sum2-sum1);
	}

}
