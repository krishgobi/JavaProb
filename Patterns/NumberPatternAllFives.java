package Patterns;

public class NumberPatternAllFives {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("5");
            }
            System.out.println();
        }
    }
}
