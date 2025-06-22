package Day2;

public class alphaCharNum {
    public static void main(String[] args) {
        char ch = 'A'; // You can change this value to test with different characters

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is not an alphabet character or digit.");
        }
    }
}
