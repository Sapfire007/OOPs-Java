// package Day6;

class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void Withdraw(double amount) throws Exception{
        if(amount>balance){
            throw new Exception("Insufficient Balance");
        }
        balance-=amount;
    }
}

public class Main5{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(100);
        try{
            acc1.Withdraw(500);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
