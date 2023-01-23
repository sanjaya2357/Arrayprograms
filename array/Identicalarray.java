package array;

public class Identicalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a[]= {1,2,3,4,5,5};
 int b[]= {1,2,3,4,5,6};
 
 boolean result=true;
 if(a.length==b.length) {
 
  for(int i=0;i<a.length;i++) {
if(a[i]!=b[i]) {
	result=false;
}
  
	}
 }
 else{
	 result=false;
  }
 if(result==true) {
	 System.out.println("arrays are equal");
 }
 else {
	 System.out.println("Arrays are not equal");
 }
 
}
}
