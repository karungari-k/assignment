import java.util.Scanner;

public class Factorial {
    //  method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 0)
            System.out.println("Factorial is not defined for negative numbers.");
        else
            System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}

