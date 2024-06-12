package bank;

public class Main {
    public static void main(String[] args) {
        Bank account = new Bank("uttam", 2000);
        System.out.println(account.toString()); 

        try {
            account.withdraw(500);
            System.out.println(account.toString()); 
            account.withdraw(1000);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}