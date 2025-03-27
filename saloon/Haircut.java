package javaprojectt;

public class Haircut {
    String haircutName;
    double price;

    Haircut(String haircutName, double price) {
        this.haircutName = haircutName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Haircut Name: " + haircutName);
        System.out.println("Price: " + price);
    }

}
