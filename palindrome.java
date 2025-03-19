package javaprojectt;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int rev =0;
		int temp;
		temp=n;
		while(n>0) {
			rev=rev*10 + n%10;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
	}

}

