package Day2;

import java.util.Scanner;
  
public class EquillateralTriangle {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 3 sides: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            // Check triangle inequality
            if (a + b > c && a + c > b && b + c > a) {
                // Equilateral check
                if (a == b && b == c) {
                    System.out.println("It's an equilateral triangle.");
                }
                // Right-angled check using Pythagoras
                else if (a * a + b * b == c * c || 
                         a * a + c * c == b * b || 
                         b * b + c * c == a * a) {
                    System.out.println("It's a right-angled triangle.");
                }
                else {
                    System.out.println("It's a triangle (but not equilateral or right-angled).");
                }
            } else {
                System.out.println("It is not a triangle.");
            }
        } else {
            System.out.println("It is not a triangle.");
            }
        }
    }
}

