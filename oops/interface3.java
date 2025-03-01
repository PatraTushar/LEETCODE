// testing with polymorphism

public class PaymentTest {

    public static void main(String[] args) {

        // Polymorphism: Using interface reference for different payment methods

        Payment obj=new creditCard();
        Payment obj2=new PayPal();
        Payment obj3=new UPI();

        // initiating payments

        obj.initiatePayment(100);
        obj.verifyTransaction();
        obj.transactionStatus();  // overridden method
        obj.secureTransaction();  // calls private method internally


        System.out.println(" ------------------------- ");

        obj2.initiatePayment(200);
        obj2.verifyTransaction();
        obj2.transactionStatus();
        obj2.secureTransaction();

        System.out.println(" ---------------------------- ");

        obj3.initiatePayment(50);
        obj3.verifyTransaction();
        obj3.transactionStatus();
        obj3.secureTransaction();

        // calling static method from the interface

        Payment.paymentGatewayInfo();

    }
}
