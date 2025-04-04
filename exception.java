package test2;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first it will print it");
		int c[]= {1,2,3,4};
		try {
			 
			 System.out.println(c[2]);
			 int a=10/0;
			
			 System.out.println("divide by zero");
					}
					catch(Exception e) {
						e.printStackTrace();
					}
	
	}

}
