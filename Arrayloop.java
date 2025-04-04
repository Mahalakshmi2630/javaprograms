package test2;

import java.util.ArrayList;

public class Arrayloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// travesing by for loop
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("mahi");
		arr.add("ishu");
		arr.add("mouni");
		arr.add("sidhu");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		//by for each loop
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("abc");
		arr1.add("def");
		arr1.add("ghi");
		arr1.add("jkl");
		for(String i:arr1) {
	    System.out.println(i);
		}
		
	}
}
