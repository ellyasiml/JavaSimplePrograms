import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        if (isPrime(input)) {
            System.out.println(input + " is prime");
        } else {
            System.out.println(input + " is not prime");
        }
    }

    private static boolean isPrime(int input) {
        if (input <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
