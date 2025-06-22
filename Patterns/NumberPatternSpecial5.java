package Patterns;

public class NumberPatternSpecial5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(i);
                } else {
                    System.out.print("5");
                }
            }
            System.out.println();
        }
    }
}
