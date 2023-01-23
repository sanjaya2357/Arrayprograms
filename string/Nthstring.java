 package string;

public class Nthstring {

	public static void main(String[] args) {
		String s1="hellohai";
		char arr1[]=s1.toCharArray();
		char arr2[]=s1.toCharArray();
		for(int i=0;i<=arr1.length-1;i++) {
			int count=0;
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {
					count++;
				arr2[j]='\0';
				}
			}
			if(count>0) {
				System.out.println(arr1[i]+":"+count);
			}
			}
			
		}
		
		
	
	}


