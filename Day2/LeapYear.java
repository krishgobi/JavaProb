package Day2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("It's a leap year.");
            } else {
                System.out.println("It's not a leap year.");
            }
        }
    }
}
