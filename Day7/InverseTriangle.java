package Day7;
import java.util.Scanner;
public class InverseTriangle {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        int n = sb.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
                }
            System.out.println();
            }   
        }
    }



