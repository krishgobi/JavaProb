package Patterns;

public class NumberPatternChangeRow {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n) {
                    System.out.print(i);
                } else {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}
