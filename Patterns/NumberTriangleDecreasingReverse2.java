package Patterns;

public class NumberTriangleDecreasingReverse2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= i + 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
