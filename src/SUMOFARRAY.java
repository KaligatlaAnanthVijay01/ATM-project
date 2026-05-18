import java.util.Scanner;

public class SUMOFARRAY{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        int sum = 0;

        for(int i = 0; i < 5; i++) {

            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();

            sum = sum + numbers[i];
        }

        System.out.println("Sum of Array: " + sum);
    }
}