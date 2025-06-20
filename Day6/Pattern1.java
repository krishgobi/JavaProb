public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n - j; i++) {
                System.out.print(i);
            }
            for (int k = n; k > n - j; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
