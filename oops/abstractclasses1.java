// Abstract class representing a payment method
abstract class Payment {
    String username;

    // Constructor in an abstract class
    Payment(String username) {
        this.username = username;
        System.out.println(username + " is initiating a payment.");
    }

    // Abstract method (must be implemented by subclasses)
    abstract void makePayment(double amount);

    // Concrete method (common behavior)
    void validateUser() {
        System.out.println("Validating user: " + username);
    }

    // Static method (utility function)
    static void showPaymentMethods() {
        System.out.println("Available payment methods: Credit Card, UPI, PayPal.");
    }
}

// Concrete subclass for Credit Card payments
class CreditCardPayment extends Payment {
    CreditCardPayment(String username) {
        super(username);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

// Concrete subclass for UPI payments
class UPIPayment extends Payment {
    UPIPayment(String username) {
        super(username);
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

