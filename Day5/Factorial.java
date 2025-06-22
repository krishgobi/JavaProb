package Day5;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // You can change this value to compute the factorial of a different number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
