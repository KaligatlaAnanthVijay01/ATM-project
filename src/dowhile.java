import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("1. Continue");
            System.out.println("2. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

        } while(choice != 2);
    }
}