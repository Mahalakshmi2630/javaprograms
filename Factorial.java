package javaprojectt;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("enter a number");
			 long num=sc.nextLong();
			 long fact=1,i;
			 for(i=1;i<=num;i++) {
				 fact =fact*i;
			 }
			 System.out.println(fact);
		}
	}

}