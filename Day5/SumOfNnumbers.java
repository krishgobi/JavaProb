package Day5;

public class SumOfNnumbers {
    public static void main(String[] args) {
        int n = 5; // You can change this value to compute the sum of numbers up to a different number
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}
