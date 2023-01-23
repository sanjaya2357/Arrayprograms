package string;

public class Checksubstring {
	
	public static boolean checksub(String main,String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}

	public static void main(String[] args) {
		System.out.println(checksub("Automation *","*"));

	}

}
