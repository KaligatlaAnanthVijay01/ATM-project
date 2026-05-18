import java.util.Scanner;

public class LARGESTNUMBERARRAY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter number: ");
            numbers[i] = sc.nextInt();
        }
        int largest = numbers[0];
        for (int i = 0; i < 5; i++) {
            if(numbers[i]>largest){
                System.out.print("\n largest number:"+largest);
            }

        }
    }
}
