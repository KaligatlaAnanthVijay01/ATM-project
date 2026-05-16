import java.util.Scanner;

public class ATMProject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int originalPin = 2006;
        int enteredPin;

        double balance = 45000;

        System.out.print("Enter ATM PIN: ");
        enteredPin = sc.nextInt();

        if(enteredPin == originalPin) {

            int choice;

            do {

                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch(choice) {

                    case 1:
                        System.out.println("Balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit: ");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        System.out.println("Deposited Successfully");
                        break;

                    case 3:
                        System.out.print("Enter withdraw: ");
                        double withdraw = sc.nextDouble();

                        if(withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal Successful");
                        } else {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }

            } while(choice != 4);

        } else {
            System.out.println("Incorrect PIN");
        }
    }
}