package javaprojectt;
import java.util.*;
public class Rightrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		for(int i=0;i<n;i++) {
			int j,last;
			last=arr[arr.length-1];
			for( j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
				
			}
			
			arr[0]=last;
		}System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		

	}

}
