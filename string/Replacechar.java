
package string;

public class Replacechar {

	public static void main(String[] args) {
		String word="MAVA";
		
		System.out.println("String before replacing is : "+word);
		String replace=word.replace('M', 'J');
		System.out.println("String before replacing is : "+replace);
		
		String sentence="I YOU LOVE YOU YOU MUST LOVE ME";
		System.out.println("String before replacing is : "+sentence);
		String replace1=sentence.replaceAll("YOU","I");
		System.out.println("String before replacing is : "+replace1);
		
		
	}

}
