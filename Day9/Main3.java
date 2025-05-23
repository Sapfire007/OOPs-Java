class InsufficientFundsException extends Exception{
    public InsufficientFundsException(double a, double b){
        super("You got insufficient funds, deposit "+(a-b)+"Rs more to proceed");
    }
}

class ATM{
    private double balance;

    public ATM(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws Exception{
        if(amount>balance){
            throw new InsufficientFundsException(amount, balance);
        }
        balance -= amount;
    }

}

public class Main3 {
    public static void main(String[] args) {
        ATM a1 = new ATM(100);
        try{
            a1.withdraw(200);
        } catch (Exception e){
            System.out.println(e);
        } finally{
            System.out.println("End of program.");
        }
    }
}
