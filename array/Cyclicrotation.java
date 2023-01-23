package array;

import java.util.Arrays;

public class Cyclicrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};

int i=0;
int j=a.length-1;
while(i!=j) {
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	i++;

}
for(int k=0;k<a.length;k++) {
	System.out.println(a[k]);
}
System.out.println(Arrays.toString(a));
	}

}
