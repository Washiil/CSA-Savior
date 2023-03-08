public class Account
{
    private int accountNumber;
    private double balance;
    
    // Initialize values in constructor
    public Account(int accountNumber, double openingBal){
       this.accountNumber = accountNumber;
       this.balance = openingBal;
    }
    
    // Complete the accessor method
    public double getBalance(){
        return this.balance;
    }
    
    // Add amount to balance
    public void deposit(double amount){
       this.balance += amount;
    }
    
    // Subtract amount from balance
    public void withdraw(double amount){
        this.balance -= amount;
    }
    
    // Should read: Regular account current balance $__.__
    public String toString(){
       return "Regular account current balance $" + this.balance;
    }
}