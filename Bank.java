package test2;
abstract class Bank1 {
	abstract String getBankName();
	abstract double getRateOfInterest();
	public void displayBankDetails() {
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Rate of Interest: " + getRateOfInterest() + "%");
	}
}
class SBI extends Bank1 {
    double getRateOfInterest() {
        return 5.5;
    }
    String getBankName() {
        return "SBI";
    }
}
class ICICI extends Bank1 {
    double getRateOfInterest() {
        return 6.7;
    }
    String getBankName() {
        return "ICICI";
    }
}
public class Bank {
    public static void main(String[] args) {
        Bank1 b1 = new SBI();  
        Bank1 b2 = new ICICI();
        b1.displayBankDetails();
        System.out.println();
        b2.displayBankDetails();
    }
}
	

