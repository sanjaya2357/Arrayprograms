package string;

public class Countwords {

	public static void main(String[] args) {
		String name="I i love you";
//		if(name==null)
//		{
//			System.out.println("String is empty");
//		}
//		String nstring=name.trim();
		int count = name.isEmpty() ? 0 :name.split(" ").length;{
			String []c1= name.split(" ");
			System.out.println(c1[0]);
		}

		
	}

}
