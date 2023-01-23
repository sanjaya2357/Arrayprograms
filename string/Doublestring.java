package string;

public class Doublestring {

	public static void main(String[] args) {
		String s1="hai hello hi hello bye bye";
		String arr1[]=s1.split(" ");
		String arr2[]=s1.split(" ");
		
		for(int k=0;k<arr1.length;k++) {
			System.out.print(arr1[k]);
		}
          for(int i=0;i<=arr1.length-1;i++) {
        	  int count=0;
        	  for(int j=0;j<=arr1.length-1;j++) {
        		  if(arr1[i].equals(arr2[j])) {
        			  count++;
       			  arr2[j]=" ";
        		  }
        	  }
        	  if(count>0) {
        		  System.out.println(arr1[i]+":"+count);
        	  }
        	  
          }
	}

}
