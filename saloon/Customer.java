package javaprojectt;

public class Customer {
	 String name;
	    String contactNumber;

	    Customer(String name, String contactNumber) {
	        this.name = name;
	        this.contactNumber = contactNumber;
	    }

	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Contact Number: " + contactNumber);
	    }

}
