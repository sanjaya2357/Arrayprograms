package string;

public class ReverseString {

	public static void main(String[] args) {
		String s1="JSPIDERS";
		String s2="";
//		for(int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//		}
		int a=s1.length()-1;
		while(a>=0) {
			s2=s2+s1.charAt(a);
			a--;
			
		}
		System.out.println(s2);

	}

}
