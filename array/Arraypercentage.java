package array;
import java.util.Scanner;

public class Arraypercentage {

	public static void main(String[] args) {
		int sum=0;
		float percent;
		int[] sub=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the subject");
		for (int i=0;i<=sub.length-1;i++) {
			System.out.println("Enter the marks of the subject["+(i+1)+"]");
			sub[i]=sc.nextInt();
		}
		for (int i=0;i<=sub.length-1;i++) {
			sum=sum+sub[i];
		}
		percent=sum/6;
		System.out.println("Percentage is "+percent);

	}

}
