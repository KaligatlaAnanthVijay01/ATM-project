class BankAccount {

    private double balance;

    // Deposit method
    public void deposit(double amount) {

        if(amount > 0) {

            balance += amount;

            System.out.println("Deposited: " + amount);
        }
        else {

            System.out.println("Invalid Amount");
        }
    }

    // Getter
    public double getBalance() {

        return balance;
    }
}

public class BANKSYSTEM {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(5000);

        System.out.println("Balance: " + account.getBalance());
    }
}