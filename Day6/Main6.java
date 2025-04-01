// package Day6;

class InsufficientFunds extends Exception {
    private double balance;
    public InsufficientFunds(double balance){
        super("Sorry you need to buy more litecoins!!!");
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}

class CryptoWallet{
    private double litecoins;

    public CryptoWallet(double litecoins){
        this.litecoins = litecoins;
    }

    public void Send(double transfer) throws InsufficientFunds{
        if(transfer>litecoins){
            throw new InsufficientFunds(litecoins);
        }
        litecoins-=transfer;
    }
}

public class Main6 {
    public static void main(String[] args) {
        double transferAmt = 50;
        CryptoWallet wallet1 = new CryptoWallet(15);
        try{
            wallet1.Send(transferAmt);
        }catch(InsufficientFunds e){
            System.out.println(e);
            System.out.println("You need to get "+((transferAmt)-(e.getBalance()))+" litecoins to proceed with this transaction...");
        }
    }
}