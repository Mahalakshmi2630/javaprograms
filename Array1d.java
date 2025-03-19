package javaprojectt;
import java.util.*;
public class Array1d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of an array");
		int n=sc.nextInt();
		System.out.println("enter numbers");
;		int a[]=new int[n];
		
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();}
				
			    	
			
				for(int i=0;i<n;i++) {
					System.out.println(a[i]);
				}
			
		
	}
}
