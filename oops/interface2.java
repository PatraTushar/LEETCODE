// implement interface in separate classes

class creditCard implements Payment{

    public void initiatePayment(double amount){
        System.out.println("Credit Card Payment of $" + amount + " initiated.");
    }

    public void verifyTransaction(){
        System.out.println("Credit Card Transaction Verified.");
    }


    //override default transaction method
    public void transactionStatus(){
        System.out.println("Credit Card Payment is being processed...");

    }

}

class PayPal implements Payment{

    public void initiatePayment(double amount){
        System.out.println("PayPal Payment of $" + amount + " initiated.");
    }

    public void verifyTransaction(){
        System.out.println(" PayPal Transaction Verified.");
    }
}

class UPI implements Payment{

    public void initiatePayment(double amount){
        System.out.println(" UPI Payment of $" + amount + " initiated.");
    }

    public void verifyTransaction(){
        System.out.println(" UPI Transaction Verified.");
    }

    //overriding default method
    public void transactionStatus() {
        System.out.println("UPI Payment is successful.");
    }



}
