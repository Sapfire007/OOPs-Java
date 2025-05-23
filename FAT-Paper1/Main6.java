interface PaymentMethod{
    abstract void processPayment(double amount);
}

class CreditCard implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        if(amount>100){
            System.out.println("Payment of Rs."+amount+" via credit card is successful!");
        } else{
            System.out.println("Payment is too low and cannot be processed...");
        }
    }
}

class PayPal implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        if(amount>100){
            System.out.println("Payment of Rs."+amount+" via PayPal is successful!");
        } else{
            System.out.println("Payment is too low and cannot be processed...");
        }
    }
}

class BankTransfer implements PaymentMethod{
    @Override
    public void processPayment(double amount){
        if(amount>100){
            System.out.println("Payment of Rs."+amount+" via bank transfer is successful!");
        } else{
            System.out.println("Payment is too low and cannot be processed...");
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        PaymentMethod c1 = new CreditCard();
        c1.processPayment(50000);

        PaymentMethod p1 = new PayPal();
        p1.processPayment(12.50);

        PaymentMethod b1 = new BankTransfer();
        b1.processPayment(400);
    }
}