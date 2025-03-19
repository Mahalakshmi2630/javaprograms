package javaprojectt;
import java.util.*;
public class Invertedrighthalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();		
		int i,j;
		for(i=n;i>=1;i--){
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}