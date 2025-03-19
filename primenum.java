package javaprojectt;
import java.util.*;
public class primenum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=1) {
			System.out.println("not prime number");}
			else if(n%2==0){
				System.out.println("not prime number");
			}
			else {
			System.out.println("prime number");
		}
	}
}
