package javaprojectt;
import java.util.*;
public class Duplicateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]= {2,3,4,5,3,7,2};
		int i,j;
		for(i=0;i<a.length-1;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate values are"+ a[i]);
				}
			}
		}
	}
	}


