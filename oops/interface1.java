package OopsByKK.Interfaces.SeparateClassesImplementingTheSameInterface;

// Define a interface for payment processing

interface Payment{

    // Interface variable (constants)->public,static,final
    String company="SecurePay";

    //Abstract methods(must be implemented by all classes)

    void initiatePayment(double amount);
    void verifyTransaction();

    // Default methods(java 8)- provide common behaviour
    default void transactionStatus(){
        System.out.println(" Transaction status pending ....");
    }

    // static methods(java 8) ->called without an object
    static void paymentGatewayInfo(){
        System.out.println(" using SecurePay Gateway for processing ");
    }

    // private method(java 9) ->used inside default method
    private void logTransaction(){
        System.out.println(" Transaction logged in securePay database");
    }
    default void secureTransaction(){
        logTransaction();
        System.out.println(" Transaction secured ");
    }
}
