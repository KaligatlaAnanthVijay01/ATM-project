import java.util.Scanner;

public class STUDENTDATABASE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];
        for(int i = 0; i < n; i++) {

            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\n----- STUDENT DATABASE -----");

        int total = 0;
        for(int i = 0; i < n; i++) {

            System.out.println(names[i] + " -> " + marks[i]);

            total += marks[i];
        }
        double average = (double) total / n;

        System.out.println("\nClass Average: " + average);
    }
}