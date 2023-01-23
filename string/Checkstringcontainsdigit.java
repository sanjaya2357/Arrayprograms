package string;

public class Checkstringcontainsdigit {
	
	public static boolean checkstring(String str) {
		
		for(int i=0;i<str.length();i++) {
			if(! Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str="123456s";
		System.out.println(checkstring(str));

	}

}
