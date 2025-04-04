package javaprojectt;
import java.util.*;
public class ProductService {
HashSet<Product> products;
Scanner sc=new Scanner(System.in);

ProductService(){
	products=new HashSet<Product>();
	
}
void addProduct() {
	
	
	System.out.println("enter id");
	int id = sc.nextInt();
	System.out.println("enter name");
	String name=sc.next();
	Product p= new Product(id,name);
	System.out.println("enter next id");
	int id1 = sc.nextInt();
	System.out.println("enter next name");
	String name1=sc.next();
	Product p1=new Product(id1,name1);
	System.out.println("enter next id");
	int id2 = sc.nextInt();
	System.out.println("enter next name");
	String name2=sc.next();
	Product p2=new Product(id2,name2);
	System.out.println("enter next id");
	int id3 = sc.nextInt();
	System.out.println("enter next name");
	String name3=sc.next();
	Product p3=new Product(id3,name3);
	System.out.println("enter next id");
	int id4 = sc.nextInt();
	System.out.println("enter next name");
	String name4=sc.next();
	Product p4=new Product(id4,name4);

	products.add(p);
	products.add(p1);
	products.add(p2);
	products.add(p3);
	products.add(p4);
	
}
void display() {
	for(Product x: products) {
		
	System.out.println(x);
	
	}
}
void SearchProduct() {
	System.out.println("enter id to search");
	int pid=sc.nextInt();
	boolean found=false;
	for(Product x:products) {
		if(pid==x.id) {
			found=true;
			System.out.println(x.name);
			break;
			
			
		}
		
	}
	if(found) {
		System.out.println("product found");
		
	}
	else {
		System.out.println("product not found");
	}
	display();
}
void deleteProduct() {
	System.out.println("enter id to be deleted");
	int pid=sc.nextInt();
	boolean found=false;
	for(Product x : products) {
		if(x.id ==pid) {
			found=true;
			products.remove(x);
			break;
		}}
	display();
	}
	void UpdateProduct() {
		System.out.println("enter id to be updated");
		int pid = sc.nextInt();
		System.out.println("enter name to be replaced");
		String pname = sc.next();
		
		boolean found = false;
		for(Product x : products)
		{
			if(x.id == pid)
			{
				found = true;
				x.setName(pname);
				
				break;
			}
		}
		display();
	
}

}
