package Patterns;

public class NumberPatternSpecial3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n - i + 1) {
                    System.out.print(i);
                } else {
                    System.out.print("5");
                }
            }
            System.out.println();
        }
    }
}
