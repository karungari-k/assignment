import java.util.Scanner;

public class Fibonaccisequence {

    public static void printFibonacci(int terms) {
        // the first two numbers
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: " + first + ", " + second);

        for (int i = 2; i < terms; i++) {
            int next = first + second; // Calculate the next number in the sequence
            System.out.print(", " + next);
            first = second; // Move to the next pair
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();

        // Validate user input
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (terms == 1) {
            System.out.println("Fibonacci Sequence: 0");
        } else {
            printFibonacci(terms); // Call method to print Fibonacci sequence
        }
    }
}

