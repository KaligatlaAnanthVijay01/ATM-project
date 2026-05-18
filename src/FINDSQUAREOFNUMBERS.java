import java.util.Scanner;

public class FINDSQUAREOFNUMBERS{

    // Method
    public static int findSquare(int number) {

        return number * number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int square = findSquare(num);

        System.out.println("Square: " + square);
    }
}