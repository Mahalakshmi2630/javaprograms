package javaprojectt;

public class MainProduct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService ob=new ProductService();
	ob.addProduct();
	ob.display();
	ob.SearchProduct();
	ob.deleteProduct();
	ob.UpdateProduct();
	}

}
