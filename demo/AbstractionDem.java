
package demo;

// Abstract parent class
abstract class Payment {

    // Abstract method
    abstract void processPayment();

    // Regular (concrete) method
    void paymentMessage() {
        System.out.println("Processing payment...");
    }
}

// First child class
class Cash extends Payment {
    @Override
    void processPayment() {
        System.out.println("Payment made using Cash.");
    }
}

// Second child class
class GCash extends Payment {
    @Override
    void processPayment() {
        System.out.println("Payment made using GCash.");
    }
}

// Main class
public class AbstractionDem {
    public static void main(String[] args) {

        // Creating child-class objects
        Cash cash = new Cash();
        GCash gcash = new GCash();

        // Demonstrating methods
        System.out.println("=== CASH PAYMENT ===");
        cash.paymentMessage();
        cash.processPayment();

        System.out.println();

        System.out.println("=== GCASH PAYMENT ===");
        gcash.paymentMessage();
        gcash.processPayment();
    }
}
