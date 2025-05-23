// package FAT_Paper1;

import java.util.Scanner;

class BankAccount{

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private static String bankName;

    public BankAccount(String accN, String accHN, double b){
        accountNumber = accN;
        accountHolderName = accHN;
        balance = b;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    public void setAccountHolderName(String name){
        accountHolderName = name;
    }
    
    public void getAccountHolderName(){
        System.out.println(accountHolderName);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Sum of: Rs."+amount+" has been deposited in your account.");
    }

    public void withdraw(double amount){
        System.out.println("Withdrawl amount of: Rs."+amount+" has been requested...");
        if(amount>balance){
            System.out.println("Sorry you can't withdraw due to insufficient funds!");
        } else if((balance-amount)<1000){
            System.out.println("Sorry you can't withdraw, you have to maintain a minimum balance of 1000Rs.");
        } else{
            balance -= amount;
            System.out.println("Withdrawl successful of: Rs. "+amount);
        }
    }

    public void displayBalance(){
        System.out.println("Bank Name: "+BankAccount.bankName+"\nAccount number: "+accountNumber+"\nAccount holder name: "+accountHolderName+"\nAccount balance: "+balance);
    }

}

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount.setBankName("Phoenix Bank");
        BankAccount obj1 = new BankAccount("IN007WB1234", "Saptarshi Bose", 10000);
        obj1.displayBalance();
        obj1.deposit(10000);
        obj1.withdraw(2500);

        System.out.println("\n\n");

        BankAccount obj2 = new BankAccount("IN268AP3154", "Rohit Dey", 100);
        obj2.displayBalance();
        obj2.deposit(10000);
        obj2.withdraw(2500000);
    }
}