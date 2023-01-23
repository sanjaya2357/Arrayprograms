package string;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="dacb";
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not a rotation");
			System.exit(0);
		}
		String s3=s1+s2;
		
		if(s3.indexOf(s2)!=-1) 
		{
			System.out.println("rotation");
		}
		else {
			System.out.println(" Not a rotation");
		}
	}

}
