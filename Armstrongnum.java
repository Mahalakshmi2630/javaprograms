package javaprojectt;
import java.util.*;
public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int finsum=n;
int count=0;
double sum=0;
while(n!=0) {
	int d=n%10;
	count++;
	n=n/10;
}
while(temp!=0) {
	int d=temp%10;
	sum=sum+ Math.pow(d,count);
	temp=temp/10;
	
}
		if (finsum==sum) {
			System.out.println("armstrong number");
			
		}
		else {
			System.out.println("not armstrong number");
		}
	}

}
