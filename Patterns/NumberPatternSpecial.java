package Patterns;

public class NumberPatternSpecial {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 2) {
                    System.out.print(i);
                } else {
                    System.out.print("5");
                }
            }
            System.out.println();
        }
    }
}
