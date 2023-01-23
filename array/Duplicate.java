package array;
import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(10);
		a1.add(40);
		a1.add(30);
		a1.add(20);
		System.out.println(a1);
		HashSet h1=new HashSet(a1);
		System.out.println(h1);
		

	}

}
