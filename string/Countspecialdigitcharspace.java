package string;

public class Countspecialdigitcharspace {
	
	public static void Countspecial(String str) {
		char[] s1=str.toCharArray();
		int scount=0;
		int ccount=0;
		int dcount=0;
		
		for(int i=0;i<s1.length;i++) {
			if(!(Character.isAlphabetic(s1[i])) && !(Character.isDigit(s1[i])) && !(Character.isWhitespace(s1[i]))) {
				scount++;
				System.out.println(s1[i]);
			}
			if(!(Character.isDigit(s1[i])) && !(Character.isWhitespace(s1[i]))) {
				ccount++;
			}
			if(!(Character.isAlphabetic(s1[i])) && !(Character.isWhitespace(s1[i]))) {
				dcount++;
			}
		}
		if(scount==0) {
			System.out.println("No special characters");
		}
		else {
			System.out.println(scount +" special characters");
		}
		if(ccount>0) {
			System.out.println(ccount-scount+ " Albhbets");
		}
		if(dcount>0) {
			System.out.println(dcount-scount+ " Numbers");
		}
		// To rerplace special character
		
		String s2=str.replaceAll("[^a-zA-Z0-9]","");
         System.out.println(s2);
	}

	public static void main(String[] args) {
		
      String str="sanjaya2357@@gamil.com";
      Countspecial(str);
	}

}
