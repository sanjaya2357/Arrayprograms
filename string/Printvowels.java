package string;

public class Printvowels {

	public static void main(String[] args) {
		String s1="hellojspiders";
		int vcount=0;
		int ccount=0;
		int c1=0;
		s1.toLowerCase();
		for(int i=0;i<=s1.length()-1;i++) {
			char c=s1.charAt(i);
			if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u')
			{
//				System.out.println(c);
				vcount++;
			}
			else
			{
				c1++;
			}
			char d=s1.charAt(i);
			 if(d>='a' && d<='z')
			{
//			System.out.println(d);
				ccount++;
			}
			
			
		}
System.out.println(vcount);
System.out.println(c1);



	}

}
