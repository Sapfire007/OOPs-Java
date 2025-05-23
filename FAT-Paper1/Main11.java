// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class manages balance with synchronized methods
class BankAccount {
    private double balance;
    private static final double MIN_BALANCE = 1000;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // synchronized to ensure thread safety
    public synchronized double checkBalance() {
        return balance;
    }

    // synchronized withdrawal method
    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds! Minimum balance of Rs. " + MIN_BALANCE + " must be maintained.");
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew Rs. " + amount + ". Remaining balance: Rs. " + balance);
    }
}

// User thread class implementing Runnable
class User implements Runnable {
    private BankAccount account;
    private double withdrawalAmount;

    public User(BankAccount account, double withdrawalAmount) {
        this.account = account;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " checking balance: Rs. " + account.checkBalance());
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println(Thread.currentThread().getName() + " error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(Thread.currentThread().getName() + " error: " + e.getMessage());
        }
    }
}

public class Main11{
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(5000);

        // Creating multiple user threads attempting withdrawals
        Thread user1 = new Thread(new User(sharedAccount, 2000), "User1");
        Thread user2 = new Thread(new User(sharedAccount, 1500), "User2");
        Thread user3 = new Thread(new User(sharedAccount, 1800), "User3");

        user1.start();
        user2.start();
        user3.start();

        // Join threads to wait for their completion (optional)
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final balance: Rs. " + sharedAccount.checkBalance());
    }
}