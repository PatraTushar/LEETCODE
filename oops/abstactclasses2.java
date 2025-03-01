// Driver class (Main method)
public class Main {
    public static void main(String[] args) {
        // Calling static method
        Payment.showPaymentMethods();
        System.out.println();

        // Creating object for Credit Card payment
        Payment ccPayment = new CreditCardPayment("John");
        ccPayment.validateUser();
        ccPayment.makePayment(5000.75);

        System.out.println();

        // Creating object for UPI payment
        Payment upiPayment = new UPIPayment("Emma");
        upiPayment.validateUser();
        upiPayment.makePayment(1500.50);
    }
}
