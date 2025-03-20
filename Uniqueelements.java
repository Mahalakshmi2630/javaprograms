package javaprojectt;
import java.util.*;
public class Uniqueelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,6,3,9,4,2,8,6};
Arrays.sort(a);
for(int i=0;i<a.length-1;i++) {
	if(a[i]!=a[i+1]) {
		System.out.println(a[i]);
	}
	
}
System.out.println(a[a.length-1]);
	}

}
