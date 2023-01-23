package array;

public class Reversegruops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
int k=3;
int l=arr.length-k;
for(int i=k;i>=0;i--)
{
    System.out.print(arr[i]);
}
for(int j=arr.length;j>k;j--){
     System.out.println(arr[j]);
}
	}

}
