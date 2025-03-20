package javaprojectt;
import java.util.*;
public class Leftrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {1,3,5,6,2,8};
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int j,first;
			first=a[0];
			for(j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
			
		}for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
