/**
 * Created by user on 16-Sep-15.
 */
public class Account {
    private Customer customer;
    private int AccountNumber;
    private double balance;
    private String branch;
    public Account(Customer customer, int AccountNumber, double balance){
        this.customer=customer;
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    public Account(Customer customer, int AccountNumber, String branch){
        this.customer=customer;
        this.AccountNumber=AccountNumber;
        this.branch=branch;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public int getAccountNumber(){
        return this.AccountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getBranch(){
        return this.branch;
    }
    public Customer getCustomer(){
        return this.customer;
    }
    public String getCustomerName(){
        return this.customer.getName();
    }
    public void debit(double amount){
        balance=balance+amount;
    }
    public void credit(double amount){
        balance=balance-amount;
    }
    public void print(){
        System.out.println("Customer: "+ getCustomerName() +" Branch: " + branch + " A/C no: " + AccountNumber + " Balance: " + balance );
    }
}
