package javaprojectt;

public class Membership {

	  String membershipName;
	    double membershipPrice;
	    int membershipDuration; // in months

	    Membership(String membershipName, double membershipPrice, int membershipDuration) {
	        this.membershipName = membershipName;
	        this.membershipPrice = membershipPrice;
	        this.membershipDuration = membershipDuration;
	    }

	    void displayDetails() {
	        System.out.println("Membership Name: " + membershipName);
	        System.out.println("Membership Price: " + membershipPrice);
	        System.out.println("Membership Duration: " + membershipDuration + " months");
	    }
	}

