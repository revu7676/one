public class Bank_Transaction {
    String account_name;
    String accountholder_name;
    String account_type;
    String account_number;
    double balance;

    public Bank_Transaction(String accountName, String holderName, String type, String number, double balance) {
        this.account_name = accountName;
        this.accountholder_name = holderName;
        this.account_type = type;
        this.account_number = number;
        this.balance = balance;
    }

    public void displayTransaction() {
        System.out.println("Account Name: " + account_name);
        System.out.println("Account Holder: " + accountholder_name);
        System.out.println("Account Type: " + account_type);
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: " + balance);
}
// Main.java
    public static void main(String[] args) {
        Bank_Customer customer = new Bank_Customer("Alice", "C123", "123 Main Street");
        Bank_Transaction transaction = new Bank_Transaction("SBI", "Alice", "Saving", "SB123456789", 50000.0);

        customer.displayCustomer();
        transaction.displayTransaction();
}

}

