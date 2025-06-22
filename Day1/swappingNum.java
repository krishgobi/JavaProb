package Day1;

public class swappingNum {
    public static void main(String[] args) {
        int a = 10, b = 2;

        // Swap without using a temp variable
        a = a + b; // a = 12
        b = a - b; // b = 10
        a = a - b; // a = 2

        System.out.println("a = " + a + " , b = " + b);
    }

}
