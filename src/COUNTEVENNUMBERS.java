import java.util.Scanner;

public class COUNTEVENNUMBERS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        int count = 0;

        for(int i = 0; i < 5; i++) {

            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();

            if(numbers[i] % 2 == 0) {

                count++;
            }
        }

        System.out.println("Even Numbers Count: " + count);
    }
}