public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 5000);

        // Accessing data through encapsulated methods
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: " + myAccount.getBalance());

        myAccount.deposit(2000);  // Depositing money
        myAccount.withdraw(1500); // Withdrawing money

        System.out.println("Updated Balance: " + myAccount.getBalance());
    }
}
