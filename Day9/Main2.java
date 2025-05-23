class Bank{
    private double balance;
    public Bank(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws Exception{
        if(amount>balance){
            throw new Exception("Insufficient balance");
        }
        balance -= amount;
    }
}

public class Main2{
    public static void main(String[] args) {
        Bank b1 = new Bank(100);
        try{
            b1.withdraw(200);
        } catch (Exception e){
            System.out.println(e);
        } finally{
            System.out.println("End of program.");
        }
    }
}