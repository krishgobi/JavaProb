package Day1;

public class NextAlphabet {
    public static void main(String[] args) {
        char currentChar = 'a'; // You can change this value to test with different characters

        if (currentChar >= 'a' && currentChar < 'z') {
            char nextChar = (char) (currentChar + 1);
            System.out.println("The next alphabet after " + currentChar + " is " + nextChar + ".");
        } else if (currentChar == 'z') {
            System.out.println("There is no next alphabet after " + currentChar + ".");
        } else {
            System.out.println(currentChar + " is not a lowercase alphabet character.");
        }
    }
}
