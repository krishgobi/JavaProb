package Day1;

public class GreatestAmongNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        int greatest = (a > b && a > c) ? a :
                       (b > c) ? b : c;

        System.out.println(greatest + " is the greatest number.");
    }
}
