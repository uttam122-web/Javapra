package bank;

public class Bank {
    private String accName;
    private double balance;

    public Bank(String accName, double balance) {
        this.accName = accName;
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Name: " + accName + ", Balance: " + balance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (balance - amount < 1000) {
            throw new LowBalanceException("Insufficient balance. Balance cannot be less than 1000.");
        }
        balance -= amount;
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}