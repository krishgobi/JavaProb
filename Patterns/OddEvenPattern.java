package Patterns;

public class OddEvenPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int val = (i % 2 == 1) ? 1 : 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(val);
                val += 2;
            }
            System.out.println();
        }
    }
}
