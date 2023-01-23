package string;

public class charcounting {

	public static void main(String[] args) {
		String s1="nayana";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a') {
				count++;
				System.out.print(s1.charAt(i));
			}
			
		}
		System.out.print(count);
	}

}
