package Day5;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            if (a < 2) {
                System.out.println("Neither prime nor composite.");
                return;
            }

            boolean isPrime = true;

            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Composite");
            }
        }
    }
}
