package string;

public class Reverseword {

	public static void main(String[] args) {
		String s1="java programming";
		
		String [] s2=s1.split(" ");
		String revstring="";
		
		for(int i=0;i<s2.length;i++) {
			String word=s2[i];
			String revword="";
			
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revstring=revstring+revword+" ";
		}
		System.out.println(revstring);
		 
		String [] revrsestring=revstring.split(" ");
		 String result="";
		 
		 for(int k=revrsestring.length-1;k>=0;k--) {
			 result=result+revrsestring[k]+" ";
		 }
		 System.out.println(result);
		
}
}
