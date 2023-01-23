

package string;

public class Removeduplicate {

	public static void main(String[] args) {
		String str="hello";
		String str1="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					str1=str1+str.charAt(i);
					break;
				}
			}
			System.out.println(str1);
		}

	}

}
