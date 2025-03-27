package javaprojectt;
class Saloon {
    Customer customer;
    Haircut haircut;
    Membership membership;

    Saloon(Customer customer, Haircut haircut, Membership membership) {
        this.customer = customer;
        this.haircut = haircut;
        this.membership = membership;
    }

    void displayDetails() {
        System.out.println("Saloon Details:");
        customer.displayDetails();
        haircut.displayDetails();
        membership.displayDetails();
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Customer customer = new Customer("Sidhu", "9764567890");

	        Haircut haircut1 = new Haircut("Basic Haircut", 15.0);
	        Haircut haircut2 = new Haircut("Premium Haircut", 30.0);
	        Haircut haircut3 = new Haircut("Deluxe Haircut", 50.0);

	        Membership membership1 = new Membership("Basic Membership", 100.0, 3);
	        Membership membership2 = new Membership("Premium Membership", 200.0, 6);
	        Membership membership3 = new Membership("Deluxe Membership", 500.0, 12);

	        Saloon saloon1 = new Saloon(customer, haircut1, membership1);
	        Saloon saloon2 = new Saloon(customer, haircut2, membership2);
	        Saloon saloon3 = new Saloon(customer, haircut3, membership3);

	        System.out.println("Saloon 1:");
	        saloon1.displayDetails();

	        System.out.println("\nSaloon 2:");
	        saloon2.displayDetails();

	        System.out.println("\nSaloon 3:");
	        saloon3.displayDetails();
	}

}
