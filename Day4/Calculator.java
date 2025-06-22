package Day4;

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char operator = '+';

        int result;

        switch (operator) {
            case '+':
                result = a + b;
                System.out.println("Addition: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Subtraction: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Multiplication: " + result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}
