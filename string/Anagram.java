package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="silent";
		String s2="listes";
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		if(c1.length!=c2.length) {
			System.out.println("Not anagram");
			System.exit(0);
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i]) 
			{
				System.out.println("Not Anagram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");

	}

}
