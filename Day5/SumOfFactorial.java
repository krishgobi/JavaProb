package Day5;

public class SumOfFactorial {
    public static void main(String[] args) {
        int n = 5; // You can change this value to compute the sum of factorials up to a different number
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += factorial;
        }

        System.out.println("The sum of factorials from 1 to " + n + " is: " + sum);
    }
}
