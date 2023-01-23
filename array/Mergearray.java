package array;

public class Mergearray {

	public static int[] mergearray(int[] a1,int[]a2) {
		int len1=a1.length;
		int len2=a2.length;
		int[] newarray=new int[len1+len2];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<len1 && j<len2) {
			if(a1[i] < a2[j]) {
				newarray[k++]=a1[i++];
			}
			else {
				newarray[k++]=a2[j++];
			}
		}
		while(i<len1)
		{
			newarray[k++]=a1[i++];
		}
		while(j<len2) {
			newarray[k++]=a2[j++];
		}
		return newarray;
	}
	public static void main(String[] args) {
      int a1[]= {1,5,6,7};
      int a2[]= {2,5,8,9};
      int result[]=mergearray(a1,a2);
      
      for(int l=0;l<result.length;l++) {
    	  System.out.print(result[l]+" ");
      }
      

	}

}
