import java.util.*;

class WithdrawlException extends Exception{
    public WithdrawlException(){
        super("Withdrawl amount must be in multiples of 100.");
    }
}

class ATM{
    double accBal = 12345678.90;
    public void withdraw(double amount) throws Exception{
        if(amount>accBal){
            throw new ArithmeticException("Insufficient balance");
        }else{
            if(amount%100!=0){
                throw new WithdrawlException();
            } else{
                accBal -= amount;
                System.out.println("Withrawl successful for: Rs. "+amount);
            }
        }
    } 
}

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount to be withdrawn: ");
        try{
            double a = in.nextDouble();
            ATM a1 = new ATM();
            a1.withdraw(a);
        } catch(InputMismatchException e){
            System.out.println(e+": Invalid Input! Please enter a numeric value");
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch (WithdrawlException e){
            System.out.println(e);
        } catch(Exception e){
            System.out.println("Internal error...");
        }
    }
}