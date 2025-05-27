public class Bank_Customer {
    String cust_name;
    String customer_id;
    String customer_address;

    public Bank_Customer(String name, String id, String address) {
        this.cust_name = name;
        this.customer_id = id;
        this.customer_address = address;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Address: " + customer_address);
}
}


